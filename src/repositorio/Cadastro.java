
package repositorio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author rafa_
 */
public class Cadastro implements ICadastro {
   
    List<Aluno> alunos = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    @Override
    public void inserirAluno(Aluno aluno) {
        int c=0;
        if (alunos.isEmpty()) {
            this.alunos.add(aluno);
        } else {
            for(Aluno matricula: alunos){
                if (matricula.getMatricula() == aluno.getMatricula()) {
                    System.out.println("Aluno já cadastrado");
                    break;
                } else {
                    c++;
                    
                }
            }
            if(this.alunos.size() == c){
                this.alunos.add(aluno);
            }
        }
        
        
    }

    @Override
    public void listarAluno() {
        if (alunos.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            Collections.sort(alunos,Aluno.Alfabetica);
            for(Aluno str: alunos){
                System.out.println(str.toString());
	   }
        }
    }

    @Override
    public void consultarAluno(int matricula) {
        int c = 0;
        if (alunos.isEmpty()) {
            System.out.println("Agenda vazia!");
        } else {
            for(Aluno obj: alunos){
                if (obj.getMatricula() == matricula) {
                    System.out.println(obj.toString());
                } else {
                    c++;
                }
            }
        }
        if(alunos.size()==c){
            System.out.println("Matricúla inválida");
        }
    }

    @Override
    public void atualizarAluno(int matricula) {
        double p1,p2;
        int c = 0;
        if (alunos.isEmpty()) {
            System.out.println("Agenda vazia!");
        } else {
            for(Aluno obj: alunos){
                if (obj.getMatricula() == matricula) {
                    System.out.println("Atualize as notas ->");
                    System.out.print("P1: ");
                    p1 = Double.parseDouble(input.nextLine());
                    obj.setP1(p1);
                    System.out.print("P2: ");
                    p2 = Double.parseDouble(input.nextLine());
                    obj.setP2(p2);
                    break;
                } else {
                    c++;
                }
            }
        }
        if(alunos.size()==c){
            System.out.println("Matricúla inválida");
        }
        }

    @Override
    public void removerAluno(int matricula) {
       
        int c = 0;
        if (alunos.isEmpty()) {
            System.out.println("Agenda vazia!");
        } else {
            for(Aluno obj: alunos){
                if (obj.getMatricula() == matricula) {
                    this.alunos.remove(obj);
                    System.out.println("Aluno removido com sucesso!");
                    break;
                    
                }
            }
        }
       
    }

    @Override
    public void listarAprovados() {
        List<Aluno> aprovados = new ArrayList<>();
        double media;
       if (alunos.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            for(Aluno obj: alunos){
                media = (obj.getP1()+obj.getP2())/2;
                if (media >=7) {
                    aprovados.add(obj);
                } 
                
	   }
            
        }
        System.out.println("Aprovados: ");
        System.out.println(aprovados.toString());
    }

    @Override
    public void listarReprovados() {
        List<Aluno> reprovados = new ArrayList<>();
        double media;
       if (alunos.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            for(Aluno obj: alunos){
                media = (obj.getP1()+obj.getP2())/2;
                if (media <7) {
                    reprovados.add(obj);
                } 
                
	   }
            
        }
        System.out.println("Reprovados: ");
        System.out.println(reprovados.toString());
    }

    
    }


    
    
    

