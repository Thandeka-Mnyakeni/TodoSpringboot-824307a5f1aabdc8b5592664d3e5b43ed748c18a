package com.example.todo_backend.api;

import com.example.todo_backend.entities.TodoItem;
import com.example.todo_backend.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;


@RestController
@AllArgsConstructor
@RequestMapping("/toDoService")
public class TodoRest {

    private final TodoService toDoService;

    @GetMapping("/")
    @Operation(description = "find all")
    public List<TodoItem> findAll(){
        return toDoService.findAll();
    }

    @GetMapping(value = "/{id}")
    @Operation(description = "find by id")
    public TodoItem getById(@PathVariable("id") Long id){
        return toDoService.findById( id );
    }

    @GetMapping(value ="/{id}")
    @Operation(description = "find by completed")
    public TodoItem findByCompleted(@RequestBody Long id) {
        if (Objects.isNull(id)) {
            throw new RuntimeException("Todo item is incomplete");
        }
        return toDoService.findByCompleted( id );
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(description = "create new todo item")
    public TodoItem create(@RequestBody TodoItem todoItem){
        if (Objects.isNull( todoItem )){
            throw new RuntimeException("Todo item is null");
        }
        return toDoService.createTodoItem( todoItem );
    }

    @DeleteMapping(value = "/{id}")
    @Operation(description = "delete by id")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id){
        toDoService.deleteById(id);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public class BadRequestException {}

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class RequestNotFoundException {}

}
