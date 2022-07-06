package Trabalho;

public class Prova {

    private Integer nota;
    private Integer peso;
    private Disciplina disciplina;

    public Prova(Integer nota, Integer peso, Disciplina disciplina) {
        this.nota = nota;
        this.peso = peso;
        this.disciplina = disciplina;
    }
    
    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
