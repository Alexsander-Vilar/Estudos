package Metodos.metodos.criacao;

public class Emprestimo {

    public static int seDuasParcelas() {
        return 2;
    }
    public static int seTresParcelas() {
        return 3;
    }
    public static double aTaxaDuasParcelas() {
        return 0.3;
    }
    public static double aTaxaTresParcelas() {
        return 0.45;
    }
    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {

            double valorFinal = valor + (valor * seDuasParcelas());
            System.out.println("Valor final do emprestimo se parcelado em dua vezes: " + valorFinal);

        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * seTresParcelas());
            System.out.println("Valor final do emprestimo se parcelado em dua vezes: " + valorFinal);

            } else {
            System.out.println("Quantidade de parcelas não aceitas! ");
        }



        }
    }

