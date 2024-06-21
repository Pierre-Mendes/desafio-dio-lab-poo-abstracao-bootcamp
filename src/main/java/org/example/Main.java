package org.example;

import domain.Bootcamp;
import domain.Curso;
import domain.Dev;
import domain.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fulano:" + devFulano.getConteudosInscritos());
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fulano:" + devFulano.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fulano:" + devFulano.getConteudosConcluidos());
        System.out.println("XP:" + devFulano.calcularTotalXp());

        System.out.println("-------");

        Dev devBeutrano = new Dev();
        devBeutrano.setNome("Joao");
        devBeutrano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Beutrano:" + devBeutrano.getConteudosInscritos());
        devBeutrano.progredir();
        devBeutrano.progredir();
        devBeutrano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Beutrano:" + devBeutrano.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Beutrano:" + devBeutrano.getConteudosConcluidos());
        System.out.println("XP:" + devBeutrano.calcularTotalXp());
    }
}