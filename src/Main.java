public static void Main(String[] args) {

    Shape [] v = new Shape[4];

    v[0] = new Rectangle(5,3);
    v[1] = new Circle(5);
    v[2] = new Square(5);
    v[3] = new Circle(120);

    double res = sum(v);

    System.out.println("sum: " + res);

}
 //print
//suma
// sort

public static double sum(Shape[] v){
    double res = 0;

    for(Shape s: v){
        res += s.area();
    }
    return res;
}