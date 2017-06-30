<%-- 
    Document   : menu
    Created on : 09/06/2017, 21:52:39
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <body>
    <h2>Página inicial de Fórum</h2>
    <p>Bem vindo, ${usuario.nome} </p> 
    <p>Seu ID é, ${usuario.id}</p>
    <a href="listaTopicos?id_usuario=${usuario.id}">Clique aqui para ir aos Tópicos do Fórum</a> 
    <a href="logout"> Clique aqui para sair</a>
  </body>
</html>
