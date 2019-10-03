
package cadastroaluno;

import java.util.Scanner;
import model.Aluno;
import repositorio.Cadastro;
import repositorio.ICadastro;

/**
 *
 * @author rafa
 */
public class Main {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ICadastro c = new Cadastro();
        int option = 0;
        int matricula;
        String nome;
        Boolean condição = true;
        
        
        
        do{
            System.out.println("=== CADASTRO DE ALUNOS ===");
            System.out.println("Opções:");
            System.out.println("1: Inserir aluno");
            System.out.println("2: Listar alunos por ordem alfabética");
            System.out.println("3: Consultar aluno");
            System.out.println("4: Atualizar aluno");
            System.out.println("5: Remover aluno");
            System.out.println("6: Listar alunos aprovados");
            System.out.println("7: Listar alunos reprovados");
            System.out.println("8: Sair");
            System.out.print("Opção: ");
            option = input.nextInt();
            input.nextLine();
            
            switch(option){
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    nome = input.nextLine();
                    System.out.print("Digite o número da matricula: ");
                    matricula = Integer.parseInt(input.nextLine());
                    System.out.print("Digite a nota da primeira prova: ");
                    double p1 = input.nextDouble();
                    System.out.print("Digite a nota da segunda prova: ");
                    double p2 = input.nextDouble();
                    Aluno a = new Aluno(matricula,nome,p1,p2);
                    c.inserirAluno(a);
                    break;
                    
                case 2:
                    c.listarAluno();
                    break;
                case 3:
                    System.out.print("Digite o numero da matricula: ");
                    matricula = Integer.parseInt(input.nextLine());
                    c.consultarAluno(matricula);
                    break;
                case 4:
                    System.out.print("Digite o numero da matricula: ");
                    matricula = Integer.parseInt(input.nextLine());
                    c.atualizarAluno(matricula);
                    break;
                case 5:
                    System.out.print("Digite o numero da matricula: ");
                    matricula = Integer.parseInt(input.nextLine());
                    c.removerAluno(matricula);
                    break;
                case 6:
                    c.listarAprovados();
                    break;
                case 7:
                    c.listarReprovados();
                    break;
                case 8:
                    condição = false;
                    break;
                
                
                
            }
            
        }while(condição == true);
        
    }
    
}
