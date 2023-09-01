package com.pedro.treinamentos.login;

import com.pedro.treinamentos.todo.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        String name = request.getParameter("name");

        String password = request.getParameter("password");

        if(_loginService.isUserValid(name, password)) {
            request.getSession().setAttribute("name", name);
            response.sendRedirect("/list-todos.do");
        }
        else {
            request.setAttribute("errorMessage", "Invalid credentials");

            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
    }

    private final LoginService _loginService = new LoginService();

    private final TodoService _todoService = new TodoService();

}

