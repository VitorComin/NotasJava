package Trabalho;

import java.util.*;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos;
    private List<Notas> Notas;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Notas> getNotas() {
        return Notas;
    }

    public void setNotas(List<Notas> Notas) {
        this.Notas = Notas;
    }
}
