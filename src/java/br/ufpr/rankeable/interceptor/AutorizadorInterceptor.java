/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.interceptor;

import java.text.ParseException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import java.lang.IllegalStateException;



public class AutorizadorInterceptor extends HandlerInterceptorAdapter {
  
    @Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object controller) throws Exception {
        String uri = request.getRequestURI();
        if (uri.endsWith("/loginForm")
                || uri.endsWith("/efetuaLogin")
                || uri.contains("/resources")) {
            return true;
        }
        if (request.getSession()
                .getAttribute("usuario") != null) {
            return true;
        }
        response.sendRedirect("/Trabalho/loginForm");
        return false;
    }
}
