package run;

import house.House;

public class Main {
    public static void main(String[] args) {
       // House myHouse = new House();
        House friendHouse = new House("red", 100.0, 3, 2);
       // myHouse.setColor("blue");
       // System.out.println("My House says: my color is " + myHouse.getColor());
        System.out.println("Friend House says: " + friendHouse.toString());
        System.out.println("I'm new here");
    }


}