public abstract class Shape {
    public abstract double area ();
}
// Rectangle
class Rectangle extends Shape {
    double l1, l2;

    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public double area() {
        return l1 * l2;
    }
}

// Square
class Square extends Rectangle {
    public Square(double l) {
        super(l, l);
    }
}

// Triangle
class Triangle extends Shape {
    double b, h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double area() {
        return (b * h) / 2;
    }
}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}


