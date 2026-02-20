public abstract class Shape {
    public abstract double area ();
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


