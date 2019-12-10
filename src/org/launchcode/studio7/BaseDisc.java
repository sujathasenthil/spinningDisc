package org.launchcode.studio7;

public class BaseDisc {
    private String title;
    private String genre;
    private int length;

    public BaseDisc(String title,int length, String genre){
        this.title = title;
        this.length = length;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public String Contents() {
        return
                "Title='" + this.getTitle() + '\'' +
                        ", Genre='" + this.getGenre() + '\'' +
                        ", Length=" + this.getLength() ;
    }
}
