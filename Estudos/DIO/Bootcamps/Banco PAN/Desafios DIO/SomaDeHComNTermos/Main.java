package SomaDeHComNTermos;

import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:

            // Vai dividir 1 pelo valor de i e ir somando seus resultados pelo numero de vezes de n.
            // (1/1 = 1) + (1/2 = 0,5)= .,5 + (1/3=0.333) + (1/4=0.25)=0.583 + 1.5 = 2.08
            // este metodo se repete o valor de n.
            h = h + (1.0 / i);
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:

        System.out.print(Math.round(h));
    }
}

