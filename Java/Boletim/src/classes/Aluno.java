package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Aluno {
    
    private int idAluno;
    private String nome;
    private String matricula;
    private String curso;
    private int idade;
 
    public Aluno(){ }
    
    public Aluno(int idaluno, String nom, String mat, String cur, int ida) {
        this.idAluno = idaluno;
        this.nome = nom;
        this.matricula = mat;
        this.curso = cur;
        this.idade = ida;
    }

    public int getIdAluno(){
        return idAluno;
    }
    
    public void setIdAluno(int id){
        this.idAluno = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String ma) {
        this.matricula = ma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String cu) {
        this.curso = cu;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idad) {
        this.idade = idad;
    }
    
    //Grava dados referente a Aluno no Banco de Dados
    public int salve(){
        
        ConectaBanco conecta = new ConectaBanco();
        
        String sql = "insert into aluno (Nome, Matricula, Curso, Idade) values ( ?, ?, ?, ?)";
        
        PreparedStatement pst = null;

        Connection reg = conecta.conecte();

        try {

            pst = reg.prepareStatement(sql, pst.RETURN_GENERATED_KEYS);
            
            pst.setString(1, this.getNome());
            pst.setString(2, this.getMatricula());
            pst.setString(3, this.getCurso());
            pst.setInt(4, this.getIdade());
            
            ResultSet rs = pst.getGeneratedKeys();
            if (rs.next()) {
                this.setIdAluno(rs.getInt(1));
            }
             
            return pst.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }

        return 0;
    }
    
    //Editar aluno selecionado
    public int edite(){
        ConectaBanco conecta = new ConectaBanco();
        
        String sql = "update aluno set Nome=?, Matricula=?, Curso=?, Idade=? where idAluno=?";
        
        PreparedStatement pst = null;

        Connection reg = conecta.conecte();

        try {

            pst = reg.prepareStatement(sql);
            
            pst.setString(1, this.getNome());
            pst.setString(2, this.getMatricula());
            pst.setString(3, this.getCurso());
            pst.setInt(4, this.getIdade());
            pst.setInt(5, this.getIdAluno());
             
            return pst.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na edição de dados.");
        }

        return 0;
    }
    
    //Deleta aluno selecionado
    public int delete() {
        
        ConectaBanco conecta = new ConectaBanco();
    
        String sql = "delete from aluno where idAluno = ?";
        PreparedStatement pst = null;
        Connection reg = conecta.conecte();
        
        try {
            
            pst = reg.prepareStatement(sql);
            pst.setInt(1, this.getIdAluno());
            pst.execute();

            return pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        return 0;
    }

}
