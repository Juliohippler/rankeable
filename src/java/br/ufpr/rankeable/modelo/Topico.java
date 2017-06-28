/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.modelo;

import java.util.Calendar;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author julio
 */
public class Topico {
     private int id;
     private int id_usuario;
    

    private String descricao;   
      
    //@DateTimeFormat(pattern="dd/MM/yyyy")
    //private Calendar dataFinalizacao;

    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Usuario() {
        return id_usuario;
    }

    public void setId_Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDescricao() {
        return descricao;
    }
       
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
