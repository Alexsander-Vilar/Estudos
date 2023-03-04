package PositivosEMedia;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double valor = 0;
        double num = 0;

        System.out.println("Digite seis valores\n");

        for (int i = 0; i < 6; i++) {

            System.out.print("Digite um valor: ");
            num = leitor.nextDouble();

            if (num > 0) {
                cont++;
                valor = valor + num;
            }
        }
        media = valor / cont;
        System.out.println("\n" + cont + " valores positivos\n");
        System.out.println(String.format("%.1f", media));
    }
}
