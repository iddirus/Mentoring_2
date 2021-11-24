package oop.inheritance;

public class MobilePhone {

    // create some properties of any mobile phone/variable and method
    // 1.variable
    public int mobilePhonePrice=1000;
    public String mobilePhoneColor="Black";
    public String mobilePhoneScreenResolution="UHD";

    private String mobilePhoneRam;

    // declare methods (mobile phone properties)
    public void camera(){
        System.out.println("mobile phone have camera");
    }
    public void clearDisplay(){
        System.out.println("mobile phone have clear Display ");
    }
    public void NFLApp(){
        System.out.println("mobile phone have NFL");
    }
    public void waterResistance(){
        System.out.println("mobile phone have water resistance feature");
    }
    // create constructor


    public MobilePhone() { // default
        System.out.println("this is mobile phone class default constructor");
    }

    public MobilePhone(int mobilePhonePrice) { // single parameterized
        this.mobilePhonePrice = mobilePhonePrice;
    }
    // multi parameterized
    public MobilePhone(int mobilePhonePrice, String mobilePhoneColor, String mobilePhoneScreenResolution, String mobilePhoneRam) {
        this.mobilePhonePrice = mobilePhonePrice;
        this.mobilePhoneColor = mobilePhoneColor;
        this.mobilePhoneScreenResolution = mobilePhoneScreenResolution;
        this.mobilePhoneRam = mobilePhoneRam;
    }

    // getter and setter method for the private variable

    public String getMobilePhoneRam(){
        return mobilePhoneRam;
    }
    public void setMobilePhoneRam(String mobilePhoneRam){
        this.mobilePhoneRam= mobilePhoneRam;
    }


}
