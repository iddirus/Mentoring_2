package oop.encapsulation;

public class TestStudentsInfo {

    public static void main(String[] args) {
        StudentsInfo studentsInfo = new StudentsInfo();
        studentsInfo.stId=100;
        System.out.println("student id is " +studentsInfo.stId); // variable is public we can call it from another class
        // System.out.println(studentsInfo.); not possible for the private variables

        // call the private variable
        studentsInfo.setStName("Adam");
        System.out.println("student name "+studentsInfo.getStName());
        studentsInfo.setStAddress("NJ");
        System.out.println("st address is "+studentsInfo.getStAddress());
        studentsInfo.setPhoneNumber(254215452);
        System.out.println("st phone number is "+studentsInfo.getPhoneNumber());
        studentsInfo.setCourseFee(3500.00);
        System.out.println("st course fee is "+studentsInfo.getCourseFee());



    }
}
