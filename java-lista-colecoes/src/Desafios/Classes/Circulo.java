package Desafios.Classes;

public class Circulo implements Forma{

    private double area;
    private double raio;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * ((Math.pow ((getArea() / 2),2)));
    }
}
