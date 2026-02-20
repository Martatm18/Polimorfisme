void main() {

    Shape [] v = new Shape[4];

    v[0] = new Rectangle(5,3);
    v[1] = new Circle(5);
    v[2] = new Square(5);
    v[3] = new Circle(120);

    double res = sum(v);

    System.out.println("El resultat de la suma és:");
    System.out.println("sum: " + res);

    System.out.println("Abans d'ordenar:");
    print(v);

    sort(v);  // Ordenem per àrea ascendent

    System.out.println("Despres d'ordenar:");
    print(v);
}
public static double sum(Shape[] v){
    double res = 0;

    for(Shape s: v){
        res += s.area();
    }
    return res;
}

public static void print(Shape[] v) {
    for (Shape s : v) {
        System.out.println(s.getClass().getSimpleName() + " - area: " + s.area());
    }
}

public static void sort(Shape[] v) {
    Arrays.sort(v, Comparator.comparingDouble(Shape::area));
}