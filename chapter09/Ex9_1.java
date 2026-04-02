public class Ex9_1{
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("|   Rectangle    |      width     |     height     |      area      |     perimeter    |");
        System.out.println("________________________________________________________________________________________");
        System.out.printf("|  rectangle 1   |%16.2f|%16.2f|%16.2f|%16.2f|", rectangle1.width, rectangle1.height, rectangle1.getArea(), rectangle1.getPerimeter());
        System.out.println("");
        System.out.printf("|  rectangle 2   |%16.2f|%16.2f|%16.2f|%16.2f|", rectangle2.width, rectangle2.height, rectangle2.getArea(), rectangle2.getPerimeter());
    }
}

class Rectangle{
    double width = 1;
    double height = 1;

    public Rectangle(){
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }
}
/* Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9. 
Display the width, height, area, and perimeter of each rectangle in this order. */