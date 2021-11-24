package oop.abstraction;

public class Airbus extends StealthAirCraft implements Plane,SuperSonicPlane{

    // declare variable
    int doors;
    int engineQty = 4;

    // declare method
    public void airbusPlaneEngineQty() {
        System.out.println("this is airbus plane engine qty method");
    }


    public void planeCockPit() {
        System.out.println("Airbus plane has cockPit");
    }

    public void planeRudder() {
        System.out.println("Airbus plane has rudder");
    }

    public void planeEngine() {
        System.out.println("Airbus plane has engine");
    }

    public void planeFuselage() {
        System.out.println("Airbus plane has fuselage");
    }

    public void superSonic() {
        System.out.println("Airbus plane has super sonic feature");
    }

    public void highSpeed() {
        System.out.println("Airbus plane has high Speed");
    }

    public void invisibilityToRadar() {
        System.out.println("Airbus plane has invisibility To Radar");
    }

    public void surveillanceCamera() {
        System.out.println("Airbus plane has surveillance Camera");
    }

    public void autoPilot() {
        System.out.println("Airbus plane has auto Pilot");
    }
}
