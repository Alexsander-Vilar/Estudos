import java.util.Scanner;

import static java.lang.System.*;

public class EX1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        String nome;
        int idade;

        while (true) {

            System.out.println("Nome: ");
            nome = scan.next();

            System.out.println("Idade: ");

            idade = scan.nextInt();

            if (nome.equals("0"))break;

        }
        System.out.println("Continua aqui..... ");
    }
}
