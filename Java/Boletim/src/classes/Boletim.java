package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Boletim {
    
    private int idBoletim;
    private int idAluno;
    private int idDisciplina;
    private double nota;
    private int frequencia;
    
    public Boletim(){}
    
    public Boletim(int alu, int dis, double not, int fre){
        this.idAluno = alu;
        this.idDisciplina = dis;
        this.nota = not;
        this.frequencia = fre;
    }
    
    public int getIdBoletim() {
        return idBoletim;
    }

    public void setIdBoletim(int idboletim) {
        this.idBoletim = idboletim;
    }
    
    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idalu) {
        this.idAluno = idalu;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDi) {
        this.idDisciplina = idDi;
    }
    
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    
    public int salve(){
        
        ConectaBanco conecta = new ConectaBanco();
        
        String sql = "insert into boletim (PK_idAluno, PK_idDisciplina, Nota, Frequencia) values (?, ?, ?, ?)";
        
        PreparedStatement pst = null;

        Connection reg = conecta.conecte();

        try {

            pst = reg.prepareStatement(sql, pst.RETURN_GENERATED_KEYS);
            
            pst.setInt(1, this.getIdAluno());
            pst.setInt(2, this.getIdDisciplina());
            pst.setDouble(3, this.getNota());
            pst.setInt(4, this.getFrequencia());
            
            ResultSet rs = pst.getGeneratedKeys();
            if (rs.next()) {
                this.setIdBoletim(rs.getInt(1));
            }
             
            return pst.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }

        return 0;
    }
    
    public int edite(){
        ConectaBanco conecta = new ConectaBanco();
        
        String sql = "update boletim set Nota=?, Frequencia=? where idBoletim=?";
        
        PreparedStatement pst = null;

        Connection reg = conecta.conecte();

        try {

            pst = reg.prepareStatement(sql);
            
            pst.setDouble(1, this.getNota());
            pst.setInt(2, this.getFrequencia());
            pst.setInt(3, this.getIdBoletim());
             
            return pst.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na edição de dados.");
        }

        return 0;
    }

    public int delete() {
        
        ConectaBanco conecta = new ConectaBanco();
    
        String sql = "delete from boletim where idBoletim = ?";
        PreparedStatement pst = null;
        Connection reg = conecta.conecte();
        
        try {
            
            pst = reg.prepareStatement(sql);
            pst.setInt(1, this.getIdBoletim());
            pst.execute();

            return pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        return 0;
    }
    
    public void delete_all(int i){
        ConectaBanco conecta = new ConectaBanco();
    
        String sql = "delete from boletim where PK_idAluno =" + i; 
        PreparedStatement pst = null;
        Connection reg = conecta.conecte();
        
        try {
            
            pst = reg.prepareStatement(sql);
            pst.execute();

            pst.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
    }
    
    public ModeloTabela preenchaTabela(int i){
        
        ConectaBanco conecta = new ConectaBanco();
        
        conecta.conecte();
        
        String[] colunas = new String[]{"Cod", "Aluno", "Disciplina", "Nota", "Falta(s)"};

        ArrayList dados = new ArrayList();
 
        conecta.executeSQL( "select b.idboletim, a.Nome, d.Nome, b.Nota, b.Frequencia from boletim as b \n" +
                            "inner join aluno as a on a.idAluno = b.PK_idAluno  \n" +
                            "inner join disciplina as d on d.idDisciplina = b.PK_idDisciplina where PK_idAluno=" + i);
 
        if( i!=0 ){
            try {
            conecta.rs.first();
                do {                           
                    dados.add( new Object[]{
                        conecta.rs.getInt("b.idboletim"),
                        conecta.rs.getString("a.Nome"),
                        conecta.rs.getString("d.Nome"),
                        conecta.rs.getDouble("b.Nota"),
                        conecta.rs.getInt("b.Frequencia")
                    });              
                } while (conecta.rs.next());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro");
            }
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        return modelo;
        
    }
    
    public ArrayList<Integer> i_aluno = new ArrayList<>();
    
    public JComboBox preencheCB(char c) {

        String sql;
        String sql2;
        
        if(c == 'a'){
            sql = "select * from aluno";
            sql2 = "idALuno";
        } else {
            sql = "select * from disciplina";
            sql2 = "idDisciplina";
        }
        
        ConectaBanco conecta = new ConectaBanco();
        conecta.conecte();
        conecta.executeSQL(sql);
        
        ResultSet rs = conecta.rs;
        JComboBox cbb = new JComboBox();
        
        try{
            
            cbb.addItem("");
            while(rs.next()){
                cbb.addItem(rs.getInt(sql2) + " - " + rs.getString("nome"));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        
        return cbb;
    }
    
    public int freq(){
        
        String sql = "SELECT SUM(frequencia) FROM boletim WHERE PK_idAluno=" + Integer.toString(this.getIdAluno());   
                
        ConectaBanco conecta = new ConectaBanco();
        
        conecta.conecte();
        
        ResultSet rs = conecta.rs;
        conecta.executeSQL(sql);
            
        int soma = 0;   
        
        try{
            
            conecta.rs.first();
            soma = conecta.rs.getInt("SUM(frequencia)");
           
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "102: Ocorreu um erro");
        }
        
        return soma;
    }
    
    public boolean apv_freq(){
        
        String sql = "SELECT SUM(Frequencia) FROM disciplina WHERE idDisciplina=" + Integer.toString(this.getIdDisciplina());
        
        ConectaBanco conecta = new ConectaBanco();
        
        conecta.conecte();
        
        ResultSet rs = conecta.rs;
        conecta.executeSQL(sql);
        
        int n_aula = 0;
        
        try{
            
            conecta.rs.first();
            n_aula = conecta.rs.getInt("SUM(Frequencia)");
           
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "103: Ocorreu um erro");
        }
        
        if ( (n_aula * 0.25) > this.freq() ) return false;
        else return true;
    
    }
    
    public int qtd_nota(){
        
        String sql = "SELECT COUNT(Nota) FROM boletim where PK_idAluno=" + Integer.toString(this.getIdAluno());
        
        ConectaBanco conecta = new ConectaBanco();
        
        conecta.conecte();
        
        ResultSet rs = conecta.rs;
        conecta.executeSQL(sql);
            
        int soma = 0;   
        
        try{
            
            conecta.rs.first();
            soma = conecta.rs.getInt("COUNT(Nota)");
           
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "101: Ocorreu um erro");
        }
        
        return soma;
    }
    
    public double gera_media(){
        String sql = "SELECT SUM(Nota) FROM boletim WHERE PK_idAluno=" + Integer.toString(this.getIdAluno());   
                
        ConectaBanco conecta = new ConectaBanco();
        
        conecta.conecte();
        
        ResultSet rs = conecta.rs;
        conecta.executeSQL(sql);
            
        double soma = 0;   
        
        try{
            
            conecta.rs.first();
            soma = conecta.rs.getInt("SUM(Nota)");
           
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "101: Ocorreu um erro");
        }
        
        return soma/this.qtd_nota();
    }
    
    public boolean apv_media(){
        
        int media=6;
        
        if ( this.gera_media()/this.qtd_nota() < media ) return false;
        else return true;
    
    }
    
    public int getIdSelecionado(int i, char c){
        
        String sql = null;
        String sql2 = null;
        
        i_aluno.clear();
        
        if ( c == 'a' ){
            sql = "select * from aluno";
            sql2 = "idAluno";
        } else if (c == 'd'){
            sql = "select * from disciplina";
            sql2 = "idDisciplina";
        }
        
        ConectaBanco conecta = new ConectaBanco();
        conecta.conecte();
        conecta.executeSQL(sql);
        
        ResultSet rs = conecta.rs;
        
        try{
            while(rs.next()){
                i_aluno.add( rs.getInt(sql2) );
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        //i-1
        return i_aluno.get(i-1);
    
    }

}
