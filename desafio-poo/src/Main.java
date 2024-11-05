import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

      


        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraia(8);

        
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraia(5);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("mentoria curso java");
        mentoria.setData(LocalDate.now());


      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Jva eveloper");
      bootcamp.setDescricao("Bootcamp Java Developer");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria);

      Dev devJuliane = new Dev();

      devJuliane.setNome("Juliane");
      devJuliane.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos inscritos juliane: "+ devJuliane.getConteudosInscritos());
      System.out.println("--------------------");
      devJuliane.progredir();
      devJuliane.progredir();
      System.out.println("Conteudos inscritos juliane: "+ devJuliane.getConteudosInscritos());
      System.out.println("Conteudos concluido juliane: "+ devJuliane.getConteudosConcluidos());
      System.out.println("XP: "+devJuliane.calcularTotalXp());
      System.out.println("--------------------");
      Dev devJuli = new Dev();

      devJuli.setNome("Juli");
      devJuli.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos inscritos juli: "+ devJuli.getConteudosInscritos());
      System.out.println("--------------------");
      devJuli.progredir();
      devJuli.progredir();
      devJuli.progredir();
      System.out.println("Conteudos inscritos juli: "+ devJuli.getConteudosInscritos());
      System.out.println("Conteudos concluido juli: "+ devJuli.getConteudosConcluidos());
      System.out.println("XP: "+devJuli.calcularTotalXp());
      

    }
}
