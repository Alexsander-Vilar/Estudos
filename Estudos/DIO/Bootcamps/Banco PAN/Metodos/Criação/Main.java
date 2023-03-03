package Metodos.Criação;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nCalculadora\n");
        Calculadora.soma(10, 5.5);
        Calculadora.subitracao(10, 5.5);
        Calculadora.multiplicacao(10, 5.5);
        Calculadora.divisao(10, 5.5);

        System.out.println("\nMensagem\n");
        Mensagem.mensagemInformada(10);
        Mensagem.mensagemInformada(15);
        Mensagem.mensagemInformada(22);
        Mensagem.mensagemInformada(100);



        System.out.println("\nEmprestimo\n");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(5000,5);
    }

}
