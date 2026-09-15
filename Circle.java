package Lec10_Abstraction.CircleDraw;

import java.util.*;

public class Circle implements Drawable, Colorable {

    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling the circle with red");
    }
}
