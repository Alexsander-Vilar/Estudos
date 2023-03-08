package Collections.Exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {

        List<String> perguntas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Telefonou para a vitima: ");
        perguntas.add(scan.next());
        System.out.print("Esteve no local do crime: ");
        perguntas.add(scan.next());
        System.out.print("Morava proximo a vitima: ");
        perguntas.add(scan.next());
        System.out.print("Devia a vitima: ");
        perguntas.add(scan.next());
        System.out.print("Trabalhou com a vitima: ");
        perguntas.add(scan.next());

        int count = 0;
        Iterator<String> contador = perguntas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }
        switch (count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}
