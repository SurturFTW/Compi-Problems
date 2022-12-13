interface Polygon {
    void getArea();
    void getSides() {   //default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }
}

class Rectangle implements Polygon {
    public void getArea() {
        boolean length = 6;     //int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }

    public void getSides() {
        System.out.println(I have 4 sides.);  //System.out.println("I have 4 sides.");
    }
}

class Square extends Polygon {   //class Square implements Polygon {
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is " + area);
    }
}

class q9 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea()    //r1.getArea();
        r1.getSides();

        Square s1 = new Square();
        s1.getArea();
        s1.getSides()   //s1.getSides();
    }
}

//HARD