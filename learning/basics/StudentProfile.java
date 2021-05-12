public class StudentProfile {
    String firstname;
    String lastname;
    int graduateYear;
    double gpa;
    boolean isMajor;

    public StudentProfile(String firstname, String lastname, int graduateYear,double gpa,boolean isMajor){
        this.firstname = firstname;
        this.lastname = lastname;
        this.graduateYear = graduateYear;
        this. gpa = gpa;
        this. isMajor = isMajor;
    }

    public int expectedYearTograduate(){
        return ++this.graduateYear;
    }
}
