package oop.inheritance;

public class Test {

    public static void main(String[] args) {
        // create object of mobile phone
        MobilePhone mobilePhone= new MobilePhone();
        mobilePhone.camera();
        mobilePhone.clearDisplay();
        System.out.println("mobile phone price " + mobilePhone.mobilePhonePrice);
        // create object of android class
        Android android = new Android();
        android.waterResistance();
        android.connectivity();
        android.touchControl();
        System.out.println("Android phone color is "+android.androidPhoneColor);

        // create object of samsung
        Samsung samsung = new Samsung();
        samsung.storage();
        samsung.touchControl();
        samsung.NFLApp();
        samsung.clearDisplay();
        samsung.bluetooth();

        // create object of sony class
        Sony sony = new Sony();
        sony.waterResistance();
        sony.camera();
        sony.connectivity();
        sony.touchControl();
        sony.largeDisplay();
        sony.processor();

    }
}
