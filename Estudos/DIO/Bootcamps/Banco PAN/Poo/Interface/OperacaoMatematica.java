package Poo.Interface;

import java.util.Scanner;

public interface OperacaoMatematica {

        Scanner scan = new Scanner(System.in);
        void soma ( double operador1, double operador2);
        void subtracao ( double operador1, double operador2);
        void multiplicacao ( double operador1, double operador2);
        void divisao ( double operador1, double operador2);

}
