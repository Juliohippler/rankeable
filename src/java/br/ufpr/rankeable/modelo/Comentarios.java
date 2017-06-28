/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.modelo;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

/**
 *
 * @author julio
 */
public class Comentarios {
     private int id;
     private int id_usuario;
     private int id_topico;
    
    
    private String comentario;
   
      
    //@DateTimeFormat(pattern="dd/MM/yyyy")
    //private Calendar dataFinalizacao;

    //getters e setters
    public int getId() {
        return id;
    }

    public void setId_Comentario(int id) {
        this.id = id;
    }
     public int getId_Comentario() {
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
     public int getId_topico() {
        return id_topico;
    }

    public void setId_topico(int id_topico) {
        this.id_topico = id_topico;
    }

    public String getComentario() {
        return comentario;
    }
       
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
