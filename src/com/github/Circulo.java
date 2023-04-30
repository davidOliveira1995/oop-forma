package com.github;

public class Circulo extends Figura {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area() {
        return 0;
    }

    public double getDiametro() {
        return raio * 3.14 * 2;
    }

    @Override
    public String toString() {
        return "--- Circulo ---\n" +
                "raio: " + raio +
                "\nCor: " + getCor();
    }
}
