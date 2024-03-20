package Entitites;

import java.util.ArrayList;

public class Classe {
    ArrayList<Aluno> sala;

    public Classe(){

    }

    public Classe(ArrayList<Aluno> listaClasse) {
        this.sala = listaClasse;
    }
    public void addAluno(int matricula, int idade, String nome){
        Aluno aluno =new Aluno(matricula, idade, nome);
    this.sala.add(aluno);
    }

    public String nomePorMatricula(int matricula) {
        for (Aluno c : this.sala) {
            if (c.getMatricula() == matricula) {
                return c.getNome();
            }
        }
        return "null";
    }



}
