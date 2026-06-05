package com.example.todo_backend.repository;

import com.example.todo_backend.entities.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

    Optional<TodoItem> findById(Long id);

    //todo find all items by completion status
    Optional<TodoItem> findAll(long completed);

    //todo implement a find by completion status use this above example as a starting point
    TodoItem findByCompleted(Long id);
}
