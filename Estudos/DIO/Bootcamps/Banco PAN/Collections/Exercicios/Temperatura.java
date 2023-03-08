package Collections.Exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temperatura {
    public static void main(String[] args) {


        List<Double> temperaturasJaneiro = new ArrayList<Double>();
        temperaturasJaneiro.add(28.0);
        temperaturasJaneiro.add(25.0);
        temperaturasJaneiro.add(30.0);
        temperaturasJaneiro.add(20.0);
        temperaturasJaneiro.add(40.0);

        System.out.println("Temperaturas de Janeiro");
        System.out.println(temperaturasJaneiro);

        Iterator<Double> iterator = temperaturasJaneiro.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }
        double mediaJaneiro = soma / temperaturasJaneiro.size();

        System.out.println("Media de temperatura janeiro: " + mediaJaneiro + "C°");

        List<Double> temperaturasFevereiro = new ArrayList<Double>();
        temperaturasFevereiro.add(40.0);
        temperaturasFevereiro.add(38.0);
        temperaturasFevereiro.add(29.0);
        temperaturasFevereiro.add(30.0);
        temperaturasFevereiro.add(36.0);

        System.out.println("\nTemperaturas de Fevereiro");
        System.out.println(temperaturasFevereiro);

        Iterator<Double> iterator2 = temperaturasFevereiro.iterator();
        double soma2 = 0;
        while (iterator2.hasNext()) {
            double next = iterator2.next();
            soma2 += next;
        }
        double mediaFevereiro = soma2 / temperaturasFevereiro.size();

        System.out.println("Media de temperatura Fevereiro: " + mediaFevereiro + "C°");

        List<Double> temperaturasMarco = new ArrayList<Double>();
        temperaturasMarco.add(26.0);
        temperaturasMarco.add(25.0);
        temperaturasMarco.add(23.0);
        temperaturasMarco.add(30.0);
        temperaturasMarco.add(29.0);

        System.out.println("\nTemperaturas de Março");
        System.out.println(temperaturasMarco);

        Iterator<Double> iterator3 = temperaturasMarco.iterator();
        double soma3 = 0;
        while (iterator3.hasNext()) {
            double next = iterator3.next();
            soma3 += next;
        }
        double mediaMarco = soma3 / temperaturasMarco.size();

        System.out.println("Media de temperatura Março: " + mediaMarco + "C°");

        List<Double> temperaturasAbril = new ArrayList<Double>();
        temperaturasAbril.add(25.0);
        temperaturasAbril.add(26.0);
        temperaturasAbril.add(28.0);
        temperaturasAbril.add(30.0);
        temperaturasAbril.add(21.0);

        System.out.println("\nTemperaturas de Abril");
        System.out.println(temperaturasAbril);


        Iterator<Double> iterator4 = temperaturasAbril.iterator();
        double soma4 = 0;
        while (iterator4.hasNext()) {
            double next = iterator4.next();
            soma4 += next;
        }
        double mediaAbril = soma4 / temperaturasAbril.size();

        System.out.println("Media de temperatura Abril: " + mediaAbril + "C°");

        List<Double> temperaturasMaio = new ArrayList<Double>();
        temperaturasMaio.add(23.0);
        temperaturasMaio.add(20.0);
        temperaturasMaio.add(18.0);
        temperaturasMaio.add(30.0);
        temperaturasMaio.add(25.0);

        System.out.println("\nTemperaturas de Maio");
        System.out.println(temperaturasMaio);

        Iterator<Double> iterator5 = temperaturasMaio.iterator();
        double soma5 = 0;
        while (iterator5.hasNext()) {
            double next = iterator5.next();
            soma5 += next;
        }
        double mediaMaio = soma5 / temperaturasMaio.size();

        System.out.println("Media de temperatura Maio: " + mediaMaio + "C°");

        List<Double> temperaturasJunho = new ArrayList<Double>();
        temperaturasJunho.add(18.0);
        temperaturasJunho.add(22.0);
        temperaturasJunho.add(25.0);
        temperaturasJunho.add(19.0);
        temperaturasJunho.add(16.0);

        System.out.println("\nTemperaturas de Junho");
        System.out.println(temperaturasJunho);

        Iterator<Double> iterator6 = temperaturasJunho.iterator();
        double soma6 = 0;
        while (iterator6.hasNext()) {
            double next = iterator6.next();
            soma6 += next;
        }
        double mediaJunho = soma6 / temperaturasJunho.size();

        System.out.println("Media de temperatura Junho: " + mediaJunho + "C°\n");

        double mediaSemestral = (mediaJaneiro + mediaFevereiro + mediaMarco + mediaAbril + mediaMaio + mediaJunho) / 6;
        System.out.println("Media de temperatura Semestral: " + mediaSemestral + "C°");

    }
}
