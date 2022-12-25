package P04StreamsFilesDirectories.lab;

import java.io.Serializable;

public class Cube implements Serializable {
    String	Color;
       double Width;
        double	Height;
         double Depth;

    public Cube(String color, double width, double height, double depth) {
        Color = color;
        Width = width;
        Height = height;
        Depth = depth;
    }
}
