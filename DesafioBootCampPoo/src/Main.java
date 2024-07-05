import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        System.out.printf(curso1.getDescricao());

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());

      //  System.out.println(mentoria.toString());

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(2);
        curso2.setDescricao("Cursos de Springboot");
        curso2.setTitulo("Curso de SpringBoot");

       // System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("DEscrição bootcamp Java DEveloper");
        bootcamp.getConteudos().add(curso1);

        Dev devNina = new Dev();
        devNina.setNome("nina");
        devNina.inscreverBootcamp(bootcamp);
        devNina.progedir();

        System.out.println("Conteudos inscritos" + devNina.getConteudosInscritos());

    }
}