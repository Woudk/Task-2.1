package org.colleg.practice2.task3;

public abstract class PictureBuilder {
    protected Picture picture;

    public PictureBuilder() {
        picture = new Picture(null, (short) 0, null, null, null, null, null, false, null);
    }

    public abstract void setBasicParams(String name, short year, String author);

    public abstract void setSizeParams(Size size);

    public abstract void setColorParams(String[] colors, boolean isWithFrames, String canvas);

    public abstract void setCategoryParams(String theme, String category);

    public Picture build() {
        return picture;
    }
}
