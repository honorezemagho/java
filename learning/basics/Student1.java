public class Student1 {
    public static void main(String[] args) {
       StudentProfile student1 = new StudentProfile("free", "fred",2017,3.7,false);
       System.out.println("The expected year to graduate is " + student1.expectedYearTograduate());
    }
}
