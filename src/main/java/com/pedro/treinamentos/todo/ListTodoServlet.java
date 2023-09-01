package com.pedro.treinamentos.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/list-todos.do")
public class ListTodoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("todos", _todoService.retrieveTodos());
        request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request, response);
    }

    private final TodoService _todoService = new TodoService();

}
