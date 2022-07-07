package Trabalho;

import java.util.*;

public class Notas {

    private Disciplina disciplina;
    private Aluno aluno;
    private List<Trabalho> trabalho;
    private List<Prova> prova;

    public Notas( Disciplina disciplina, Aluno aluno, List<Trabalho> trabalho, List<Prova> prova) {
        this.disciplina = disciplina;
        this.aluno = aluno;
        this.trabalhos = trabalho;
        this.prova = prova;
    }
    public Float Notas() {
        Integer notaTrabalho = 0;
        Integer notaProva = 0;
        Integer pesoTrabalho = 0;
        Integer pesoProva = 0;
        Integer pesoFinal = 0;
        Integer notaFinal = 0;


        for (Trabalho trabalho : this.getTrabalho()) {
             notaTrabalho += trabalho.getNotas().intValue();
             pesoTrabalho = trabalho.getPeso().intValue();
        }
        for (Prova prova : this.getProva()){
            notaProva += prova.getNotas().intValue();
            pesoProva = prova.getPeso().intValue();
        }

        pesoFinal = (pesoProva + pesoTrabalho)  / 2;
        notaFinal = notaProva + notaTrabalho;

        return notaTrabalho;
    }

    public String retornaStatus(){
        Integer notaFinal = 0;
        notaFinal = this.getTrabalho().get(0).getNotas().intValue() + this.getProva().get(0).getNotas().intValue();
        if (notaFinal >= 5) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }

    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Trabalho> getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(List<Trabalho> trabalho) {
        this.trabalho = trabalho;
    }

    public List<Prova> getProva() {
        return prova;
    }

    public void setProva(List<Prova> prova) {
        this.prova = prova;
    }
}
