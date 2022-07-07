package Trabalho;

public class Prova {

    private Integer notas;
    private Integer peso;
    private Disciplina disciplina;

    public Prova(Integer notas, Integer peso, Disciplina disciplina) {
        this.notas = notas;
        this.peso = peso;
        this.disciplina = disciplina;
    }
    
    public Integer getNotas() {
        return notas;
    }

    public void setNotas(Integer notas) {
        this.notas = notas;
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
