package com.lcwd.todo.controller;

import com.lcwd.todo.models.Todo;
import com.lcwd.todo.services.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/todos")
public class TodoController {


    Logger logger = LoggerFactory.getLogger(TodoController.class);
    @Autowired
    private TodoService todoService;
    Random random = new Random();

    // create

    @PostMapping()
    public ResponseEntity<Todo> createTodoHandler(
            @RequestBody Todo todo
    ){


        // create todo

//        String str = null;  // null pointer exception
//        logger.info("{}",str.length());

//        Integer.parseInt("8199hsjsjs");


        int id = random.nextInt(999999);
        todo.setId(id);
        // create date with system default current date
        Date currentDate =new Date();
        logger.info("Current Date : {}",currentDate);
        todo.setAddedDate(currentDate);
        logger.info("Creating todo");
        logger.info("todo date {}",todo.getTodoDate());
        //call service to create todo
        Todo todo1 = todoService.createTodo(todo);
        return new ResponseEntity<>(todo1, HttpStatus.CREATED);

    }

    // get all todo method

    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodoHandler(){
        List<Todo> allTodos = todoService.getAllTodos();
        return new ResponseEntity<>(allTodos, HttpStatus.OK);
    }

    // get single todo

    @GetMapping("/{todoId}")
    public ResponseEntity<Todo> getSingleTodoHandler(
            @PathVariable("todoId")  int todoId)
    {
           Todo getTodo = todoService.getTodo(todoId);
           return new ResponseEntity<>(getTodo,HttpStatus.OK);
    }

    // update todo
    @PutMapping("/{todoId}")
    public ResponseEntity<Todo> updateTodoHandler(
            @RequestBody Todo todoWithNewDetails,
            @PathVariable("todoId") int todoId
    ){
       Todo newTodo =  todoService.updateTodo(todoId,todoWithNewDetails);
       return new ResponseEntity<>(newTodo,HttpStatus.OK);
    }

    @DeleteMapping("/{deleteId}")
    public ResponseEntity<String> deleteTodo(
            @PathVariable("deleteId") int deleteId
    )
    {
        todoService.deleteTodo(deleteId);
        return ResponseEntity.ok("Todo Successfully Deleted");
    }

    // exception handler

//    @ExceptionHandler(NullPointerException.class)
//    public ResponseEntity<String> nullPointerException(NullPointerException ex)
//    {
//        System.out.println(ex.getMessage());
//        System.out.println("Null Pointer Exception generated");
//        return new ResponseEntity("Null Pointer Exception generated :: "+ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//        //return "Null Pointer Exception generated :: "+ex.getMessage();
//    }

//    @ExceptionHandler(NumberFormatException.class)
//    @ExceptionHandler(value ={NullPointerException.class,NumberFormatException.class} )
//    public ResponseEntity<String> numberFormatException(Exception ex)
//    {
//        System.out.println(ex.getMessage());
//        System.out.println("Number Format Exception generated");
//        return new ResponseEntity("Number Format Exception generated :: "+ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//        //return "Null Pointer Exception generated :: "+ex.getMessage();
//    }

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> genericException(Exception ex)
//    {
//        System.out.println(ex.getMessage());
//        System.out.println("Generic Exception");
//        return new ResponseEntity<>("Generic Exception",HttpStatus.INTERNAL_SERVER_ERROR);
//    }

}
