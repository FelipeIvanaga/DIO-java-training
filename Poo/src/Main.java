import com.felipeivanaga.dominio.Bootcamp;
import com.felipeivanaga.dominio.Curso;
import com.felipeivanaga.dominio.Dev;
import com.felipeivanaga.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java mod 1");
        curso1.setCargaHorario(4);
        curso1.setDescricao("primeiro passos no java");

        Curso curso2 = new Curso();
        curso2.setTitulo("Java mod 2");
        curso2.setCargaHorario(7);
        curso2.setDescricao("criando a primeira api com Spring");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Avancando no java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev devTyler = new Dev();
        devTyler.setNome("Tyler Durden");
        devTyler.inscreverBootcamp(bootcamp);
        System.out.println("Tyler esta Inscrito em: " + devTyler.getConteudosInscritos());
        System.out.println("Tyler concluiu: " + devTyler.getConteudosConcluidos());
        System.out.println("XP: " + devTyler.calcularTotalXp());

        Dev devBob = new Dev();
        devBob.setNome("Robert");
        devBob.inscreverBootcamp(bootcamp);
        devBob.progredir();
        devBob.progredir();
        System.out.println("Robert esta Inscrito em: " + devBob.getConteudosInscritos());
        System.out.println("Robert concluiu: " + devBob.getConteudosConcluidos());
        System.out.println("XP: " + devBob.calcularTotalXp());


    }
}
