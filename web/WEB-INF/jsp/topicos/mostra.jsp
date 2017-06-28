<%-- 
    Document   : mostra
    Created on : 08/06/2017, 11:33:11
    Author     : julio

--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<html>
<body>
  <h3>Alterar Topico - ${topico.id}</h3>
  <form action="alteraTopico" method="post">

    <input type="hidden" name="id" value="${topico.id}" />
  
    Descrição:<br />
    <textarea name="descricao" cols="100" rows="5"> ${topico.descricao} </textarea>
    <br />      

  
    <input type="submit" value="Alterar" />
  </form>
</body>
</html>
