package org.colleg.practice2.task3;
public class UsaPictureBuilder extends PictureBuilder{
    public void setBasicParams(String name, short year, String author) {
        picture.setName(name);
        picture.setYear(year);
        picture.setAuthor(author);
    }

    @Override
    public void setSizeParams(Size size) {
        picture.setSize(size);
    }

    @Override
    public void setColorParams(String[] colors, boolean isWithFrames, String canvas) {
        picture.setColors(colors);
        picture.setWithFrames(isWithFrames);
        picture.setCanvas(canvas);
    }

    @Override
    public void setCategoryParams(String theme, String category) {
        picture.setTheme(theme);
        picture.setCategory(category);
    }
}
