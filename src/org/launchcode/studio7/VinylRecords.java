package org.launchcode.studio7;

public class VinylRecords extends BaseDisc implements Disc {
    public VinylRecords(String title,int length, String genre){
        super(title,length,genre);
    }

    @Override
    public String rotationSpeed() {
        return "A Vinyl Record spins at a rate of 45 rpm";
    }
}
