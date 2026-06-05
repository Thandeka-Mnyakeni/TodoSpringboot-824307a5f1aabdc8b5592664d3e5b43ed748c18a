package com.example.todo_backend.service;

import com.example.todo_backend.entities.TodoItem;

import java.util.List;

public interface TodoService {

    TodoItem findById(Long id);

    List<TodoItem> findAll();  

    void deleteById(Long id);

    TodoItem createTodoItem( TodoItem item );

    TodoItem findByCompleted(Boolean value);

    TodoItem addNoteToTodoItem( Long id,  String note );
}

// create a new rest endpoint that take param id and body string to save a new note to an existing todo item, return the edited item back. implement the method  in the service to do this. 