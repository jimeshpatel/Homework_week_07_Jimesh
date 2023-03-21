package javaprograms;

/**
 * Wall Area
 * Write a class with the name Wall. The class needs two fields (instance variables) with name
 * width and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters
 * (no-arg  constructor). The second constructor has parameters width and height of type double
 * and it needs to  initialize the fields. In case the width is less than 0 it needs to set the
 * width field value to 0, in case the  height parameter is less than 0
 * it needs to set the height field value to 0.
 */
public class Programme15 {
    double width;
    double height;

    public static void main(String[] args) {
        Programme15 wall = new Programme15(5, 4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }

    public Programme15() {                  //constructor (same name as class name) with no args
    }

    public Programme15(double width, double height) {   //constructor (must have same name as class name) with args
        if (width > 0 && height < 0) {
            this.width = width;
            this.height = 0;
        } else if (width < 0 && height > 0) {
            this.height = height;
            this.width = 0;
        } else if (width < 0 && height < 0) {
            this.width = 0;
            this.height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {                                //if else syntax
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }
}
