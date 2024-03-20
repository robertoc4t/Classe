import Entitites.Aluno;
import Entitites.Classe;

import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList<>();
        Classe c = new Classe(lista);


        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Bem-Vindo:\n1.Cadastrar nova classe\n2.Inserir um aluno a uma sala existente" +
                "\n3.Buscar aluno\n4.Fechar"));

        while (escolha != 4) {
            while (escolha != 1 && escolha != 2 && escolha != 3) {
                escolha = Integer.parseInt(JOptionPane.showInputDialog("Por favor escolha uma das opções abaixo:\n1.Cadastrar nova classe\n2.Inserir um aluno a uma sala existente" +
                        "\n3.Buscar aluno\n4.Fechar"));
            }
            switch (escolha) {
                case 1:

                    int quantAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos que vão ser cadastrados:"));
                    for (int k = 0; k < quantAlunos; k++) {
                        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula:"));
                        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno:"));
                        String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
                        Aluno aluno = new Aluno(matricula, idade, nome);
                        lista.add(aluno);
                    }
                    break;


                case 2:
                    int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula:"));
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno:"));
                    String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
                    Aluno aluno = new Aluno(matricula, idade, nome);
                    lista.add(aluno);

                    break;
                case 3:
                    int matricule = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula:"));
                    System.out.println(c.nomePorMatricula(matricule));
                    break;




            }
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Por favor escolha uma das opções abaixo:\n1.Cadastrar nova classe\n2.Inserir um aluno a uma sala existente" +
                    "\n3.Buscar aluno\n4.Fechar"));

        }
        JOptionPane.showMessageDialog(null,"Popopo por hoje é só pessoal");
    }


}
