/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.controllers;


import br.ufpr.rankeable.dao.JdbcTopicosDao;

import br.ufpr.rankeable.modelo.Topico;
import java.io.IOException;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
//import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author julio
 */
@Controller
public class TopicosController {
    @RequestMapping("/novoTopico")
    public String form(){
        return "topicos/formulario";
    }
    
    @RequestMapping("/adicionaTopico")
    public String adicionar(Topico topico, BindingResult result){        
        if (result.hasErrors()){
            return "topicos/formulario";
        }
        
        JdbcTopicosDao dao = new JdbcTopicosDao();
        dao.adiciona(topico);
        return "redirect:listaTopicos";
    }
    
      @RequestMapping("/listaTopicos")
    public String listar(Model model) {
        JdbcTopicosDao dao = new JdbcTopicosDao();
        List<Topico> topicos = dao.getLista();
        model.addAttribute("topicos",topicos);
        return "topicos/lista";
    }
     @RequestMapping("mostraTopico")
    public String mostra(Topico topico, Model model){
        JdbcTopicosDao dao = new JdbcTopicosDao();
        model.addAttribute("topico",dao.buscaPorId(topico.getId()));
        return "topicos/mostra";
    }
    
    @RequestMapping("alteraTopico")
    public String altera(Topico topico) {
        JdbcTopicosDao dao = new JdbcTopicosDao();
        dao.altera(topico);
        return "redirect:listaTopicos";
    }
    
     @RequestMapping("removeTopico")
    public String remover(Topico topico) {
        JdbcTopicosDao dao = new JdbcTopicosDao();
        dao.remove(topico);       
        return "redirect:listaTopicos";
    }
}
