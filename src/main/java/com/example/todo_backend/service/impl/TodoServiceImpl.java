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
        return null;
        //todo implement this find by id
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
        return null;
    }

    //implement a find by completion method p.s. don't forget the interface
    @Override
    public TodoItem findByCompleted(Long id){
        return todoRepository.findByCompleted(id);
    }

}
