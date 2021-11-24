package oop.polymorphism.methodoverriding;

public class Test {

    public static void main(String[] args) {
        // create an object of jet class
        Jet jet = new Jet();
        jet.superSonicSpeed();
        jet.landingGear();
        // create object of boeing class
        Boeing boeing = new Boeing();
        boeing.superSonicSpeed();
        boeing.planeCockPit();
    }


}
