package org.colleg.practice2.task3;

public class Main {
    public static void main(String[] args) {
        PictureBuilder usaBuilder = new UsaPictureBuilder();
        Size size = new Size();
        size.setHeight((short) 100);
        size.setWidth((short) 200);

        usaBuilder.setBasicParams("Freedom", (short) 2022, "John Doe");
        usaBuilder.setSizeParams(size);
        usaBuilder.setColorParams(new String[]{"Red", "Blue"}, true, "Oil");
        usaBuilder.setCategoryParams("Modern", "Abstract");

        Picture usaPicture = usaBuilder.build();

        System.out.println("Usa Picture:");
        System.out.println("Name: " + usaPicture.getName());
        System.out.println("Year: " + usaPicture.getYear());
        System.out.println("Author: " + usaPicture.getAuthor());
        System.out.println("Theme: " + usaPicture.getTheme());
        System.out.println("Category: " + usaPicture.getCategory());
        System.out.println("Colors: " + String.join(", ", usaPicture.getColors()));
        System.out.println("Size (Height x Width): " + usaPicture.getSize().getHeight() + " x " + usaPicture.getSize().getWidth());
        System.out.println("With Frames: " + (usaPicture.isWithFrames() ? "Yes" : "No"));
        System.out.println("Canvas: " + usaPicture.getCanvas());

        PictureBuilder ukraineBuilder = new UkrainePictureBuilder();

        ukraineBuilder.setBasicParams("Freedom in Ukraine", (short) 2023, "Ivan Franko");
        ukraineBuilder.setSizeParams(size);
        ukraineBuilder.setColorParams(new String[]{"Yellow", "Blue"}, true, "Canvas");
        ukraineBuilder.setCategoryParams("Historical", "Portrait");

        Picture ukrainePicture = ukraineBuilder.build();

        System.out.println("\nUkraine Picture:");
        System.out.println("Name: " + ukrainePicture.getName());
        System.out.println("Year: " + ukrainePicture.getYear());
        System.out.println("Author: " + ukrainePicture.getAuthor());
        System.out.println("Theme: " + ukrainePicture.getTheme());
        System.out.println("Category: " + ukrainePicture.getCategory());
        System.out.println("Colors: " + String.join(", ", ukrainePicture.getColors()));
        System.out.println("Size (Height x Width): " + ukrainePicture.getSize().getHeight() + " x " + ukrainePicture.getSize().getWidth());
        System.out.println("With Frames: " + (ukrainePicture.isWithFrames() ? "Yes" : "No"));
        System.out.println("Canvas: " + ukrainePicture.getCanvas());
    }
}