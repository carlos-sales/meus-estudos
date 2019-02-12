package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Disciplina {
    
    private int idDisciplina;
    private String codigo;
    private String nome;
    private String professor;
    private double notaMinima;
    private int frequencia;
    
    public Disciplina(){ }
    
    public Disciplina(int idDisciplina, String cod, String nom, String pro, double not, int fre){
        this.idDisciplina = idDisciplina;
        this.codigo = cod;
        this.nome = nom;
        this.professor = pro;
        this.notaMinima = not;
        this.frequencia = fre;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String cod) {
        this.codigo = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public double getNotaMinima() {
        return notaMinima;
    }

    public void setNotaMinima(double notaMinima) {
        this.notaMinima = notaMinima;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int freq) {
        this.frequencia = freq;
    }
    
    public int salve(){
        
        ConectaBanco conecta = new ConectaBanco();
        
        String sql = "insert into Disciplina (Nome, Professor, NotaMinima, Frequencia) values ( ?, ?, ?, ?)";
        
        PreparedStatement pst = null;

        Connection reg = conecta.conecte();

        try {

            pst = reg.prepareStatement(sql, pst.RETURN_GENERATED_KEYS);
            
            pst.setString(1, this.getNome());
            pst.setString(2, this.getProfessor());
            pst.setDouble(3, this.getNotaMinima());
            pst.setInt(4, this.getFrequencia());
            
            ResultSet rs = pst.getGeneratedKeys();
            if (rs.next()) {
                this.setIdDisciplina(rs.getInt(1));
            }
             
            return pst.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }

        return 0;
    }
    
    public int edite(){
        ConectaBanco conecta = new ConectaBanco();
        
        String sql = "update disciplina set Nome=?, Professor=?, NotaMinima=?, Frequencia=? where idDisciplina=?";
        
        PreparedStatement pst = null;

        Connection reg = conecta.conecte();

        try {

            pst = reg.prepareStatement(sql);
            
            pst.setString(1, this.getNome());
            pst.setString(2, this.getProfessor());
            pst.setDouble(3, this.getNotaMinima());
            pst.setInt(4, this.getFrequencia());
            pst.setInt(5, this.getIdDisciplina());
             
            return pst.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na edição de dados.");
        }

        return 0;
    }

    public int delete() {
        
        ConectaBanco conecta = new ConectaBanco();
    
        String sql = "delete from disciplina where idDisciplina = ?";
        PreparedStatement pst = null;
        Connection reg = conecta.conecte();
        
        try {
            
            pst = reg.prepareStatement(sql);
            pst.setInt(1, this.getIdDisciplina());
            pst.execute();

            return pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        return 0;
    }

    public ResultSet listeDisciplinas() {

        String sql = "select * from Disciplina order by nome ";

        ConectaBanco conecta = new ConectaBanco();
        conecta.conecte();
        conecta.executeSQL(sql);
        ResultSet rs = conecta.rs;

        return rs;
    }
    
}
