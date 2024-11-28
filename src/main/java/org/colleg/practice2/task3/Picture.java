package org.colleg.practice2.task3;
public class Picture {
    private String name;
    private short year;
    private String author;
    private String theme;
    private String category;
    private String[] colors;
    private Size size;
    private boolean isWithFrames;
    private String canvas;

    public Picture(String name, short year, String author, String theme, String category,
                   String[] colors, Size size, boolean isWithFrames, String canvas) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.theme = theme;
        this.category = category;
        this.colors = colors;
        this.size = size;
        this.isWithFrames = isWithFrames;
        this.canvas = canvas;
    }

    // Геттери та сеттери для всіх полів
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public short getYear() {
        return year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String[] getColors() {
        return colors;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setWithFrames(boolean isWithFrames) {
        this.isWithFrames = isWithFrames;
    }

    public boolean isWithFrames() {
        return isWithFrames;
    }

    public void setCanvas(String canvas) {
        this.canvas = canvas;
    }

    public String getCanvas() {
        return canvas;
    }
}
