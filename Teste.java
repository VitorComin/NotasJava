package Trabalho;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.trabalhofinal.model.*;
import java.util.*;

public class Teste
{
    Disciplina disciplina;
    Aluno aluno;
    Trabalho trabalho;
    Notas Notas;
    Prova prova;



    @Test
    public void ANotaFinal()
    {
        disciplina = new Disciplina("Programacao");
        aluno = new Aluno("Leo");
        trabalho = new Trabalho(7, 7, disciplina);
        prova = new Prova(7, 7, disciplina);
        Notas = new Notas(disciplina, aluno, Arrays.asList(trabalho), Arrays.asList(prova));

       Number notaFinal = Notas.ANotaFinal();

       assertEquals(notaFinal, 7);
    }

    @Test
    public void Aprovado() {
        disciplina = new Disciplina("Programacao");
        aluno = new Aluno("Leo");
        trabalho = new Trabalho(7, 7, disciplina);
        prova = new Prova(7, 7, disciplina);
        Notas = new Notas(disciplina, aluno, Arrays.asList(trabalho), Arrays.asList(prova));

        String status = Notas.retornaStatus();

        assertEquals("Aprovado", status);
    }

    @Test
    public void Reprovado() {
        disciplina = new Disciplina("Programacao");
        aluno = new Aluno("Leo");
        trabalho = new Trabalho(7, 3, disciplina);
        prova = new Prova(6, 3, disciplina);
        Notas = new Notas(disciplina, aluno, Arrays.asList(trabalho), Arrays.asList(prova));

        String status = Notas.retornaStatus();

        assertEquals("Reprovado", status);
    }
}
