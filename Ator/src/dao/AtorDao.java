/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Ator;
/**
 *
 * @author Administrador
 */
public class AtorDao {
     public static boolean inserir(Ator objeto) {
        String sql = "INSERT INTO ator (nome_real, nome_artistico) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome_real());
            ps.setString(2, objeto.getNome_artistico());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
     
      public static void main(String[] args) {
        Ator objeto = new Ator();
        objeto.setNome_real(" Arlette Pinheiro Esteves da Silva Torres");
        objeto.setNome_artistico("Fernanda Montenegro");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
