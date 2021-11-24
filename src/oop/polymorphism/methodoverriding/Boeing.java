package oop.polymorphism.methodoverriding;

public class Boeing extends Concorde implements Plane {
    @Override
    public void superSonicSpeed() {
        System.out.println("Boeing has a super sonic speed ");
    }

    @Override
    public void planeCockPit() {
        System.out.println("boeing have a cockpit feature");

    }

    @Override
    public void planeRudder() {

    }

    @Override
    public void planeEngine() {

    }

    @Override
    public void planeFuselage() {

    }
}
