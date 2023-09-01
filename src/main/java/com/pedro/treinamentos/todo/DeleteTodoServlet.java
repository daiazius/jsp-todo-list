package com.pedro.treinamentos.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete-to.do")
public class DeleteTodoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String todo = request.getParameter("todo");
        String category = request.getParameter("category");
        _todoService.removeTodo(new Todo(todo, category));
        response.sendRedirect("/list-todos.do");
    }

    private final TodoService _todoService = new TodoService();

}
