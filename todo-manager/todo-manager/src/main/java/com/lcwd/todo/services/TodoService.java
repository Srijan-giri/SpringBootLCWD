package com.lcwd.todo.services;

import com.lcwd.todo.exceptions.ResourceNotFoundException;
import com.lcwd.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Component
@Service
public class TodoService {
    
    // create todo
    
    List<Todo> todos = new ArrayList<Todo>();
    Logger logger = LoggerFactory.getLogger(TodoService.class);
    
    public Todo createTodo(Todo todo) {
        // create..

        todos.add(todo);
        logger.info("Todos {}",this.todos);
        return todo;
    }

    public List<Todo> getAllTodos() {
        return this.todos;
    }

    public Todo getTodo(int todoId) {
//        Todo todo =  this.todos.stream().filter(t->todoId==t.getId()).findAny().get();
        Todo todo =  this.todos.stream().filter(
                t->todoId==t.getId()).findAny().
                orElseThrow(
                        ()->new ResourceNotFoundException("Todo not found with given ID", HttpStatus.NOT_FOUND)
                );
        logger.info("TODO : {}",todo);
        return todo;
    }


    public Todo  updateTodo(int todoId, Todo todo) {
       List<Todo> newUpdateList =  todos.stream().map(t->{
            if(t.getId() == todoId){
                // perform todo
                t.setTitle(todo.getTitle());
                t.setContent(todo.getContent());
                t.setStatus(todo.getStatus());
                return t;
            }
            else{
                return t;
            }
        }).collect(Collectors.toList());

       this.todos = newUpdateList;
       todo.setId(todoId);
       return todo;
    }

    public void deleteTodo(int todoId) {
       List<Todo> newList =  todos.stream().filter(t->t.getId()!=todoId).collect(Collectors.toList());
       todos = newList;
       logger.info("Deleting Todo");
    }
}
