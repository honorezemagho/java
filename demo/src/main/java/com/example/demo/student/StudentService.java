package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;

@Service
public class StudentService{

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public static boolean isValidEmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public Student findUser(Long studentId){

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("Student with id " + studentId + " does not exist"));
       return student;
    }

    public List<Student> getStudents(){
                return this.studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> checkEmail = studentRepository
                .findStudentByEmail(student.getEmail());

        boolean validEmail = isValidEmail(student.getEmail());
        if(checkEmail.isPresent()) {
            throw new IllegalStateException("Email is already taken. Please choose another one");
        }

        if (!validEmail){
            throw new IllegalStateException("Invalid Email");
        }

        this.studentRepository.save(student);
    }

    @Transactional
    public void updateStudent(Long studentId,String name,String email) {
        Student student = this.findUser(studentId);


        if(name != null & name.length() > 0 &&
                !Objects.equals(student.getName(), name)){
            student.setName(name);
        }

        if(email != null & email.length() > 0 && isValidEmail(student.getEmail()) &&
                !Objects.equals(student.getEmail(), email)){
            student.setEmail(email);
        }
    }

    public void deleteStudent(Long studentId) {
        this.findUser(studentId);
        studentRepository.deleteById(studentId);
    }
}
