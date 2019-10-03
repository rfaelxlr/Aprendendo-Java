
package model;

import java.util.Comparator;

/**
 *
 * @author rafa
 */
public class Aluno {
    //atributos
    private int matricula;
    private String nome;
    private double p1;
    private double p2;
    
    //construtor

    public Aluno(int matricula, String nome, double p1, double p2) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
  

    //getter e setter

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", p1=" + p1 + ", p2=" + p2 + '}';
    }
    
    

    // comparação por nome
    public static Comparator<Aluno> Alfabetica = (Aluno a1, Aluno a2) -> {
        String nomeAluno1 = a1.getNome().toUpperCase();
        String nomeAluno2 = a2.getNome().toUpperCase();
        
        // ordem ascendente
        return nomeAluno1.compareTo(nomeAluno2);
    };
      //
}
