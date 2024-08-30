package projetos.gerenciadorDeSeminario.teste;

import projetos.gerenciadorDeSeminario.dominio.Aluno;
import projetos.gerenciadorDeSeminario.dominio.Local;
import projetos.gerenciadorDeSeminario.dominio.Professor;
import projetos.gerenciadorDeSeminario.dominio.Seminario;

public class AssociacaoTeste {
    private static Local local;

    public static void main(String[] args) {
        Local local = new Local("Comunidade Lagoinha");
        Aluno aluno1 = new Aluno("Wellyton", 19);
        Aluno aluno2 = new Aluno("Thiago", 19);
        Aluno aluno3 = new Aluno("Nicolas", 19);
        Aluno aluno4 = new Aluno("Isaque", 18);

        Professor professor1 = new Professor("Ana", "Algoritmos");
        Aluno[] alunosSeminario = {aluno1, aluno2, aluno3, aluno4};
        Seminario seminario = new Seminario("Laços de repetição", alunosSeminario, local);

        Seminario[] seminariosDisponiveis  = {seminario};

        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprima();
    }
}
