package Metodos.metodos.retornos;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nExercicio Retornos:\n");

        double areaQuadrado = Quadrialateros.area(2.5);
        System.out.println("Área do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrialateros.area(5, 2.5);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrialateros.area(5, 2.5,10);
        System.out.println("Área do trapezio: " + areaTrapezio);

        double areaLosango = Quadrialateros.area(5f, 10f);
        System.out.println("Área do losango: " + areaLosango);


    }

}
