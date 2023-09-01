package com.pedro.treinamentos.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo("1", "1"));
        todos.add(new Todo("2", "2"));
        todos.add(new Todo("3", "3"));
    }

    public List<Todo> retrieveTodos() {
        return todos;
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public void removeTodo(Todo todo) {
        todos.remove(todo);
    }

}
