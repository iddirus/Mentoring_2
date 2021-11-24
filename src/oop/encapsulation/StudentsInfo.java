package oop.encapsulation;

public class StudentsInfo {

    // encapsulation: data hiding
    // declare variables of class private
    // provide getter and setter methods for the private variables

    // declare some variables

    public int stId;

    private String stName;
    private String stAddress;
    private int phoneNumber;
    private double courseFee;

    // create constructor
    // syntax
    // access modifier className(){}

    // default
    public StudentsInfo(){
        System.out.println("this is default constructor");

    }
    // single parameterized
    public StudentsInfo(int stId){
        this.stId=stId;
    }

    public StudentsInfo(int stId, String stName, String stAddress) {
        this.stId = stId;
        this.stName = stName;
        this.stAddress = stAddress;
    }

    public StudentsInfo(int stId, String stName, String stAddress, int phoneNumber, double courseFee) {
        this.stId = stId;
        this.stName = stName;
        this.stAddress = stAddress;
        this.phoneNumber = phoneNumber;
        this.courseFee = courseFee;
    }

    // generate getter and setter

    // 1 . getter used to get the value, it is a return type method
    public String getStName(){
        return stName;
    }

    // 2 . setter method : used to set the value ; it is non return type method
    public void setStName(String stName){
        this.stName= stName;
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }
}
