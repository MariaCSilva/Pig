/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Maria
 */
public class PessoaTabelaModelo extends AbstractTableModel {
    List<Pessoa> pessoas = new ArrayList<>();
    
    public PessoaTabelaModelo(List<Pessoa> pessoas){
        this.pessoas = pessoas;
    }

    @Override
    public int getRowCount() {
      return pessoas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    public String getColumnName(int coluna){
        switch(coluna){
            case 0:return "nome";
            case 1:return "telefone";
            case 2:return "endereco";            
        }        
        return null;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Pessoa pessoa = new Pessoa();        
        pessoa = pessoas.get(linha);
        
        switch(coluna){
            case 0:return pessoa.getNome();
            case 1:return pessoa.getTelefone();
            case 2:return pessoa.getEndereco();
        }
        
        return null;
    }
    
    
    
}
