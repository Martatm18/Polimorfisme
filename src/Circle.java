class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}