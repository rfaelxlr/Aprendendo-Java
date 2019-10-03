
package repositorio;

import model.Aluno;

/**
 *
 * @author rafa_
 */
public interface ICadastro {
    
    public void inserirAluno(Aluno aluno);
    public void listarAluno();
    public void consultarAluno(int matricula);
    public void atualizarAluno(int matricula);
    public void removerAluno(int matricula);
    public void listarAprovados();
    public void listarReprovados();
    
    
    
}
