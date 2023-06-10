package Poo.ex1;

public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(60);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println("Valor para encher o tanque: R$" + carro1.totalValorTanque(6.85));

        Carro carro2 = new Carro("cinza", "Mercedes-Benz Classe C", 66);

        System.out.println(carro2.toString());
        System.out.println("Valor para encher o tanque: R$" + carro2.totalValorTanque(6.85));
    }
}
