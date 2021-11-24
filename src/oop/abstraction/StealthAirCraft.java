package oop.abstraction;

public abstract class StealthAirCraft {

    // abstract class is not fully 100% abstract unlike interface
    // in abstract class we can declare variable and also declare and assign value
    // we can create regular method and methods without body
    // we can create an object of an abstract class also

    // create variable

    String stealthAirCraftType;
    int stealthAirCraftTypePrice=200000000;

    // create abstract methods without body

    public abstract void highSpeed();
    public abstract void invisibilityToRadar();
    public abstract void surveillanceCamera();
    public abstract void autoPilot();

    // regular method with body

    public void infrared() {
        System.out.println("Stealth Air Craft  has infrared feature");
    }




}
