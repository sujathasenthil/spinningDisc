package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cdObj = new CD("Dinosaur",100,"Horror");
        DVD dvdObj = new DVD("SpiderMan",120,"Action");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(cdObj.rotationSpeed());
        System.out.println(dvdObj.rotationSpeed());
        BaseDisc avatar = new CD("Avatar",100,"Family");
        BaseDisc titanic = new DVD("Titanic",120,"Adults") ;
        System.out.println(avatar.Contents());
        System.out.println(titanic.Contents());
        System.out.println(cdObj.Contents());
        System.out.println(dvdObj.Contents());
        VinylRecords vinylrecord1 = new VinylRecords("Vinyl1",20,"Family");
        System.out.println(vinylrecord1.rotationSpeed());
        FloppyDisk floppyDisk1 = new FloppyDisk("Floppydisk1",45,"Adults");
        System.out.println(floppyDisk1.rotationSpeed());
        Wheel carwheel = new Wheel();
        System.out.println(carwheel.rotationSpeed());


    }
}
