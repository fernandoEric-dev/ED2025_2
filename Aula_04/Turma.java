package Aula_04;

public class Turma {
    // 1 turma tem N alunos

    private Aluno alunos[]; // Vetor de Alunos 1->N
    private String semestre;
    private int capacidade; // Quantidade máxima
    private int tamanho; // Quantidade Atual

    // Construtor
    public Turma(String semestre, int capacidade) {
        if (capacidade <= 0) {
            // Capacidade inválida
            throw new IllegalArgumentException("Capacidade Invalida");
        } else {
            // Definindo o tamanho do vetor
            this.alunos = new Aluno[capacidade];
            this.semestre = semestre;
            this.tamanho = 0;
        }
    }

    // Método para inserir um aluno
    public boolean inserir(Aluno aluno) {
        if (tamanho == alunos.length) {
            return false; // Vetor cheio
        } else {
            alunos[tamanho++] = aluno;
            return true; // Aluno inserido com sucesso
        }
    }

    // Método para listar todos os alunos
    public Aluno[] listar() {
        Aluno[] copia = new Aluno[tamanho];
        for (int i = 0; i < tamanho; i++) {
            copia[1] = alunos[i]; // Corrigido: deve ser copia[i] e não copia[1]
        }
        return copia;
    }
    public boolean remover(int ra){
        for(int i=0; i< tamanho; i++){
            if (alunos[i].getRa() == ra) {
                alunos[i] = alunos[tamanho-1];
                alunos[tamanho-1]=null;
                tamanho--;
                return true;
                
            }
        }
        return false;
    }

    public Aluno localizarRA(int ra){
        for(int i=0; i<tamanho; i++){
            if (alunos[i].getRa() == ra) {
                return alunos[i];
            }
        }
        return null;
    }
    // Método para obter a capacidade restante na turma
    public int capacidadeTurma() {
        return alunos.length - tamanho;
    }
}
