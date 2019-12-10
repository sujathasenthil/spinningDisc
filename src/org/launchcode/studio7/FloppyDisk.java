package org.launchcode.studio7;

public class FloppyDisk extends BaseDisc implements Disc {

    public FloppyDisk(String title,int length, String genre){
        super(title,length,genre);
    }

    @Override
    public String rotationSpeed() {
        return "A Floppy Disk spins at a rate of 300 - 600 rpm";
    }
}
