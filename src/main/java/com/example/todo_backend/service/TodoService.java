package com.example.todo_backend.service;

import com.example.todo_backend.entities.TodoItem;

import java.util.List;

public interface TodoService {

    TodoItem findById(Long id);

    List<TodoItem> findAll();  

    void deleteById(Long id);

    TodoItem createTodoItem( TodoItem item );

    TodoItem findByCompleted(Long id);
}

