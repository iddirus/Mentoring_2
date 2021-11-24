package oop.inheritance;

public class Sony extends Android{

    public int sonyPhonePrice=800;
    public String sonyPhoneColor="red";
    public String sonyPhoneScreenResolution="1200 pixel";

    private String sonyPhoneRam;

    // create constructor

    public Sony() {
    }

    public Sony(int sonyPhonePrice) {
        this.sonyPhonePrice = sonyPhonePrice;
    }

    public Sony(int sonyPhonePrice, String sonyPhoneColor, String sonyPhoneScreenResolution, String sonyPhoneRam) {
        this.sonyPhonePrice = sonyPhonePrice;
        this.sonyPhoneColor = sonyPhoneColor;
        this.sonyPhoneScreenResolution = sonyPhoneScreenResolution;
        this.sonyPhoneRam = sonyPhoneRam;
    }

    // getter and setter method


    public String getSonyPhoneRam() {
        return sonyPhoneRam;
    }

    public void setSonyPhoneRam(String sonyPhoneRam) {
        this.sonyPhoneRam = sonyPhoneRam;
    }

    // declare sony phone proprieties

    public void battery() {
        System.out.println("Sony have a good battery");
    }

    public void processor() {
        System.out.println("Sony have processor feature");
    }

    public void largeDisplay() {
        System.out.println("Sony have  large Display feature");
    }


}
