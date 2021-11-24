package oop.abstraction;

public interface Plane {

    // interface is a prototype/ guideline for future use or development
    // we can not declare variable but we can declare and assign value
    // interface is 100% abstract
    // means: we can not declare methods with body, we can only declare methods without body
    // we can not create object of cla ss in interface


    // create variables

    String plane= "Boeing";

    // declare variable and assign value

    String brand= "B347";
    int seats= 450;
    int turbineEngine= 4;
    int wings=2;
    // declare plane methods with body

    // public void planerName(){}

    // declare plane methods without body

    public void planeCockPit();
    public void planeRudder();
    public void planeEngine();
    public void planeFuselage();













}
