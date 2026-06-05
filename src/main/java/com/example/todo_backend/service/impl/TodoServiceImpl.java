package com.example.todo_backend.service.impl;

import com.example.todo_backend.entities.TodoItem;
import com.example.todo_backend.repository.TodoItemRepository;
import com.example.todo_backend.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoItemRepository todoRepository;

    @Override
    public TodoItem findById(Long id) {
        if (todoRepository.findById( id ).isPresent()) {
            todoRepository.findById( id ).get();
        }
    }

    @Override
    public List<TodoItem> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }

    @Override
    public TodoItem createTodoItem(TodoItem item) {
        return todoRepository.save( item );
    }

    @Override
    public TodoItem findByCompleted(Boolean value){
        return todoRepository.findByCompleted(value);
    }

    @Override
    public TodoItem addNoteToTodoItem(Long id, String note) {
        return null;
    }

}
