package Poo;

public class Carro {

    String cor;
    String modelo;
    double capacidadeTanque;

    Carro() {

    }
    Carro(String cor, String modelo, double capacidadeTanque) {
     this.cor = cor;
     this.modelo = modelo;
     this.capacidadeTanque = capacidadeTanque;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

}
