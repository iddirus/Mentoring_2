package oop.inheritance;

public class Samsung extends Android{
    // this is multi level inheritance

    // create variable
    public int samsungPhonePrice=1400;
    public String samsungPhoneColor="White";
    public String samsungPhoneScreenResolution="3200 pixel";

    private String samsungPhoneRam;

    // create constructor


    public Samsung() {
    }

    public Samsung(int samsungPhonePrice) {
        this.samsungPhonePrice = samsungPhonePrice;
    }

    public Samsung(int samsungPhonePrice, String samsungPhoneColor, String samsungPhoneScreenResolution, String samsungPhoneRam) {
        this.samsungPhonePrice = samsungPhonePrice;
        this.samsungPhoneColor = samsungPhoneColor;
        this.samsungPhoneScreenResolution = samsungPhoneScreenResolution;
        this.samsungPhoneRam = samsungPhoneRam;
    }

    // getter and setter method

    public String getSamsungPhoneRam() {
        return samsungPhoneRam;
    }

    public void setSamsungPhoneRam(String samsungPhoneRam) {
        this.samsungPhoneRam = samsungPhoneRam;
    }

    // declare some samsung phone proprieties

    public void fingerPrintLock() {
        System.out.println("Samsung have finger Print Lock feature");
    }

    public void bluetooth() {
        System.out.println("Samsung have bluetooth feature");
    }

    public void runTwoAppsAtOnce() {
        System.out.println("Samsung have runTwoAppsAtOnce feature");
    }




}
