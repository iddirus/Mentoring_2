package oop.abstraction;

public class TestGE {

    public static void main(String[] args) {
        // create object of general electric then call by object name
        GeneralElectric generalElectric = new GeneralElectric();
        generalElectric.planeRudder();
        generalElectric.planeEngine();
        generalElectric.planeFuselage();
        // call variables
        System.out.println("general electric seats are "+generalElectric.seats);
        System.out.println("general electric turbine engine number is " +generalElectric.turbineEngine);

        System.out.println("************************************************************");

        // create object of airbus class
        Airbus airbus = new Airbus();
        airbus.airbusPlaneEngineQty();
        airbus.planeCockPit();
        airbus.planeEngine();
        System.out.println(airbus.engineQty);
        airbus.superSonic();
        System.out.println("***************************************");
        airbus.autoPilot();
        airbus.invisibilityToRadar();
        airbus.infrared();
        System.out.println("plane price is "+airbus.stealthAirCraftTypePrice);



    }
}
