package Entitites;

public class Aluno {
    int matricula;
    int idade;
    String nome;

    public Aluno(int matricula, int idade, String nome){
        this.idade = idade;
        this.matricula = matricula;
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public String getNome(){
        return this.nome;
    }
    public String toString(){
        return "A luno" + this.nome + " de idade " + this.idade + " e matricula " + this.matricula;
    }



}
