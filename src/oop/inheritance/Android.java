package oop.inheritance;

public class Android extends MobilePhone {

    // create variable
    public int androidPhonePrice=1200;
    public String androidPhoneColor="Silver";
    public String androidPhoneScreenResolution="HD";

    private String androidPhoneRam;

    public void getMobilePhoneInfo(){
        System.out.println(super.mobilePhoneColor); // calling variable
        super.waterResistance();
    }

    // generate some constructor

    // default
    public Android() {
        super(); // calling the parent/ super class constructor
        System.out.println("this is android class default constructor");
    }
    // single

    public Android(int androidPhonePrice) {
        this.androidPhonePrice = androidPhonePrice;
    }
    // multi parameterized

    public Android(int androidPhonePrice, String androidPhoneColor, String androidPhoneScreenResolution, String androidPhoneRam) {
        this.androidPhonePrice = androidPhonePrice;
        this.androidPhoneColor = androidPhoneColor;
        this.androidPhoneScreenResolution = androidPhoneScreenResolution;
        this.androidPhoneRam = androidPhoneRam;
    }
    // getter ans setter

    public String getAndroidPhoneRam() {
        return androidPhoneRam;
    }

    public void setAndroidPhoneRam(String androidPhoneRam) {
        this.androidPhoneRam = androidPhoneRam;
    }

    // declare some Android proprieties/ method
    public void touchControl() {
        System.out.println("Android have touch control feature");
    }

    public void connectivity() {
        System.out.println("Android have connectivity feature");
    }

    public void storage() {
        System.out.println("Android have storage feature");
    }

}
