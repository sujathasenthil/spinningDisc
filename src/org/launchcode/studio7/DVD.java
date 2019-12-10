package org.launchcode.studio7;

public class DVD extends BaseDisc implements Disc{
    public DVD(String title,int length, String genre){
        super(title,length,genre);
    }

    @Override
    public String rotationSpeed() {
        return "A DVD Spins at a rate 570 - 1600 rpm ";
    }

}
