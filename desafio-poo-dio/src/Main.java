import br.com.dio.desafio.dominio.Mentoria;
import br.comn.dio.desafio.dominio.Bootcamp;
import br.comn.dio.desafio.dominio.Curso;
import br.comn.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descricao bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKarine = new Dev();
        devKarine.setNome("Karine");
        devKarine.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Karine " + devKarine.getConteudosInscritos());
        devKarine.progredir();
        System.out.println("Conteudos Inscritos Karine " + devKarine.getConteudosInscritos());
        System.out.println("Conteudos concluidos Karine " + devKarine.getConteudosConcluidos());
        System.out.println("XP: " + devKarine.calcularTotalXp());

        System.out.println("------------------");

        Dev devRoberto = new Dev();
        devRoberto.setNome("Roberto");
        devRoberto.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Roberto " + devRoberto.getConteudosInscritos());
        devRoberto.progredir();
        devRoberto.progredir();
        System.out.println("Conteudos Inscritos Roberto " + devRoberto.getConteudosInscritos());
        System.out.println("Conteudos concluidos Roberto " + devRoberto.getConteudosConcluidos());
        System.out.println("XP:" + devRoberto.calcularTotalXp());





    }
}

