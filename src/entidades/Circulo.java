package entidades;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
