public class App {
    public static void main(String[] args) throws Exception {
        Turma turma = new Turma(3, "3SEM_ADS");

        Aluno a1 = new Aluno(1, "Francisco");
        Aluno a2 = new Aluno(1, "Gabriel");
        Aluno a3 = new Aluno(1, "Yago");

        System.out.println(turma.capacidadeTurma());
        System.out.println(turma.inserir(a1));
        System.out.println(turma.inserir(a2));
        System.out.println(turma.inserir(a3));
        System.out.println(turma.inserir(a3));
        System.out.println(turma.inserir(a3));
        System.out.println(turma.capacidadeTurma());

    }
}
