import Dominio.Bootcamp;
import Dominio.Curso;
import Dominio.Dev;
import Dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Prepare-se para a jornada.");
        curso1.setDescricao("Introdução a plataforma");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Princiupios do desenvolvimetno de software.");
        curso2.setDescricao("Introdução a linguagem e ferramentas basicas.");
        curso2.setCargaHoraria(14);

        Curso curso3 = new Curso();
        curso3.setTitulo("Conhecendo a linguagem de programação.");
        curso3.setDescricao("Aprendendo a liguagem e seus recursos.");
        curso3.setCargaHoraria(25);

        Curso curso4 = new Curso();
        curso4.setTitulo("Dominando algoritimo Básico com desafios de código java.");
        curso4.setDescricao("Serão realizadas atividades praticas basicas");
        curso4.setCargaHoraria(5);

        Curso curso5 = new Curso();
        curso5.setTitulo("Programação orientada a objetos java.");
        curso5.setDescricao("Iniciação a programação orientada ao objeto.");
        curso5.setCargaHoraria(16);

        Curso curso6 = new Curso();
        curso6.setTitulo("Tratamento com banco de dados SQL e NoSQL.");
        curso6.setDescricao("Iniciação ao SQL e NoSQL.");
        curso6.setCargaHoraria(8);

        Curso curso7 = new Curso();
        curso7.setTitulo("Ganhando produtividade com spring framework.");
        curso7.setDescricao("Iniciação a protocolos de comunicação.");
        curso7.setCargaHoraria(18);

        Curso curso8 = new Curso();
        curso8.setTitulo("Dominando algoritimo intermediarios com desafios de código java.");
        curso8.setDescricao("Serão realizadas atividades praticas intermediarias");
        curso8.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Piramides de teste e TDD.");
        mentoria1.setDescricao("Entenda a importancia dostestes e o metodo TDD");
        mentoria1.setData(LocalDate.of(2023, 02, 28));

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Solid e boas praticas.");
        mentoria2.setDescricao("Entenda os 5 principios de programação orientada oa objeto e boas praticas de programação");
        mentoria2.setData(LocalDate.of(2023, 03, 07));

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("Overview de Computação em Nuvem.");
        mentoria3.setDescricao("Entenda os pricipais metodos de programação na nuvem");
        mentoria3.setData(LocalDate.of(2023, 03, 14));

        Mentoria mentoria4 = new Mentoria();
        mentoria4.setTitulo("Engenharia de Confiabilidade de Site (SRE).");
        mentoria4.setDescricao("Engenharia de Confiabilidade de Sites, é uma disciplina que incorpora aspectos da engenharia" +
                " de software e os aplica a resolução de problemas de operações de TI");
        mentoria4.setData(LocalDate.of(2023, 03, 21));

        Mentoria mentoria5 = new Mentoria();
        mentoria5.setTitulo("Como Trabalhamos e Como Entregamos Performance.");
        mentoria5.setDescricao("Metodos para programar com performace.");
        mentoria5.setData(LocalDate.of(2023, 03, 28));

        Mentoria mentoria6 = new Mentoria();
        mentoria6.setTitulo("Dicas para se Tornar um Desenvolvedor (a) de Sucesso!");
        mentoria6.setDescricao("Dicas de carreira");
        mentoria6.setData(LocalDate.of(2023, 04, 05));


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Banco PAN Java Developern");
        bootcamp.setDescricao("O primeiro programa do Banco PAN em parceria com a DIO chega com uma trilha completa" +
                " em Java Spring Boot e 5 mil bolsas de estudo disponíveis. É indicado para pessoas de baixa renda" +
                " e de grupos sub representados que estão em busca de sua primeira formação no universo da tecnologia," +
                " entretanto, qualquer pessoa interessada pode participar.");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(curso5);
        bootcamp.getConteudos().add(curso6);
        bootcamp.getConteudos().add(curso7);
        bootcamp.getConteudos().add(curso8);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);
        bootcamp.getConteudos().add(mentoria3);
        bootcamp.getConteudos().add(mentoria4);
        bootcamp.getConteudos().add(mentoria5);
        bootcamp.getConteudos().add(mentoria6);


        Dev devAlexsander = new Dev();
        devAlexsander.setNome("Alexsander");
        devAlexsander.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Alexsander: " + devAlexsander.getConteudosInscritos());
        devAlexsander.progredir();
        devAlexsander.progredir();
        devAlexsander.progredir();
        devAlexsander.progredir();
        devAlexsander.progredir();
        devAlexsander.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alexsander: " + devAlexsander.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alexsander: " + devAlexsander.getConteudosConcluidos());
        System.out.println("XP:" + devAlexsander.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-------");

        Dev deveFlavio = new Dev();
        deveFlavio.setNome("Flavio");
        deveFlavio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Flavio: " + deveFlavio.getConteudosInscritos());
        deveFlavio.progredir();
        deveFlavio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos  Flavio: " + deveFlavio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Flavio: " + deveFlavio.getConteudosConcluidos());

        System.out.println("-------");

        Dev deveHenrique = new Dev();
        deveHenrique.setNome("Henrique");
        deveHenrique.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Henrique: " + deveHenrique.getConteudosInscritos());
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        deveHenrique.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos  Henrique: " + deveHenrique.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Henrique: " + deveHenrique.getConteudosConcluidos());

        System.out.println("-------");

        Dev deveBruna = new Dev();
        deveBruna.setNome("Bruna");
        deveBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruna: " + deveBruna.getConteudosInscritos());
        deveBruna.progredir();
        deveBruna.progredir();
        deveBruna.progredir();
        deveBruna.progredir();
        deveBruna.progredir();
        deveBruna.progredir();
        deveBruna.progredir();
        deveBruna.progredir();
        deveBruna.progredir();
        deveBruna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos  Bruna: " + deveBruna.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Bruna: " + deveBruna.getConteudosConcluidos());

    }
}

