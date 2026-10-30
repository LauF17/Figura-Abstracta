public class App {
    public static void main(String[] args) throws Exception {
        polimorfismo(new Triangulo(4,2,"triangulo"));
        polimorfismo(new Cuadrado(2,2,"cuadrado" ));
        polimorfismo(new Circulo(5,"circulo"))
    }
    public static void polimorfismo(Figura mifigura){
        System.out.println("tipo: " + mifigura.getTipo());
        System.out.println("Area: " + mifigura.area());
    }
}
