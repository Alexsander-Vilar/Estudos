package Poo.Interface;

import java.util.Scanner;

class Calculadora implements OperacaoMatematica{

    @Override
        public void soma ( double operador1, double operador2){
            System.out.print("Digite o primeiro operador: ");
            operador1 = scan.nextDouble();
            System.out.print("Digite o segundo operador: ");
            operador2 = scan.nextDouble();
            System.out.println("Soma: " + (operador1 + operador2));
        }
        @Override
        public void subtracao ( double operador1, double operador2){
            System.out.println("Subtração: " + (operador1 - operador2));
        }
        @Override
        public void multiplicacao ( double operador1, double operador2){
            System.out.println("Multiplição: " + (operador1 * operador2));
        }

        @Override
        public void divisao ( double operador1, double operador2){
            System.out.println("Divisão: " + (operador1 + operador2));
        }

}
