public class Rectangulo extends Figura {
    private int base, altura;
    public Rectangulo (String tipo, int base, int altura) {
        super(tipo);
        this.setBase (base);
        this.setAltura (altura);
    }
    public int getAltura() {
        return altura;
    }
    public int getBase() {
        return base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public double area(){
        return (double) this.base * this.altura ;
    }
}