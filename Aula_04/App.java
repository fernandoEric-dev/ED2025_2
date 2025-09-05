package Aula_04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Turma turma = new Turma("3SEM_ADS", 5);
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            try {
                System.out.println("\n[1] inserir \n[2] Buscar \n[3] Remover \n[4] Listar \n[5] Capacidade da Turma \n[0] Sair ");
                System.out.println("Opçao");
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.println("RA");
                        int ra = Integer.parseInt(sc.nextLine());

                        System.out.println("Nome");
                        String nome = sc.nextLine();

                        boolean status = turma.inserir(new Aluno(ra, nome));
                        System.out.println(status ? "Inserido com Sucesso" : "Falha ao Inserir");
                        break; // ERRO: Faltava o 'break' aqui

                    case 2:
                        System.out.println("RA");
                        int raBusca = Integer.parseInt(sc.nextLine()); // Renomeado para evitar conflito
                        Aluno a = turma.localizarRA(raBusca);
                        
                        // A lógica para mostrar o resultado estava faltando.
                        // Para "arrumar" a funcionalidade, é preciso mostrar o resultado.
                        if (a != null) {
                            System.out.println("Aluno encontrado: " + a.toString()); // Exemplo de como mostrar
                        } else {
                            System.out.println("Aluno não encontrado.");
                        }
                        break; // ERRO: Faltava o 'break' aqui

                        case 3:
                        System.out.println("RA");
                        ra = Integer.parseInt(sc.nextLine());
                        System.out.println(turma.remover(ra)? " Removido": "Não Localizado");
                        break;

                        case 4:
                        for(Aluno al: turma.listar()){
                            System.out.println(al.getRa()+ "l"+al.getNome());
                        }
                        System.out.println("Vagas Livres "+turma.capacidadeTurma());
                        break;

                        case 0:
                        System.out.println("Encerrado!");
                        default:
                        System.out.println("Opçao Invalida ");

                    
                        // O 'default' estava dentro do case 2, foi movido para fora
                        break;
                }
            } catch (NumberFormatException e) {
                // Adicionado para evitar que o programa quebre se o usuário não digitar um número
                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
                opcao = -1; // Garante que o loop continue
            }
        // ERRO: As chaves estavam fechando o laço no lugar errado
        } while (opcao != 0);
        
        System.out.println("Programa encerrado.");
        sc.close();
    }
}