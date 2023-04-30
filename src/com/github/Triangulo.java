package com.github;

public class Triangulo extends Figura {

    private double base;
    private double altura;


    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        return "--- Triangulo ---" +
                "\nBase: " + base +
                "\nAltura: " + altura +
                "\nCor: " + getCor();
    }
}
