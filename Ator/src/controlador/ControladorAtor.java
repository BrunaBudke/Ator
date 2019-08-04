/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import tela.manutencao.ManutencaoAtor;
import dao.AtorDao;
import javax.swing.JOptionPane;
import modelo.Ator;
import tela.manutencao.ManutencaoAtor;
/**
 *
 * @author Administrador
 */
public class ControladorAtor {

   
    public static void inserir(ManutencaoAtor man){
        Ator objeto = new Ator();
        objeto.setNome_real(man.jtfNomeReal.getText());
        objeto.setNome_artistico(man.jtfNomeArtistico.getText());
        
        boolean resultado = AtorDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoAtor man){
        Ator objeto = new Ator();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfNome_artistico.getText()));
        objeto.setNome_artistico(man.jtfNome_real.getText());
        objeto.setCodigo(man.jtfCodigo.getText());
        
        boolean resultado = DaoAtor.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
