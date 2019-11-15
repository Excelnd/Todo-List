package ihs.learnprogramming.controller;

import ihs.learnprogramming.model.TodoData;
import ihs.learnprogramming.model.TodoItem;
import ihs.learnprogramming.service.TodoItemService;
import ihs.learnprogramming.util.Mappings;
import ihs.learnprogramming.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoItemController {

    // -- fields --
    private final TodoItemService todoItemService;

    // -- constructors --
    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    // -- model attributes --
    @ModelAttribute
    public TodoData todoData() {
        return todoItemService.getData();
    }

    // -- handler methods --
    // http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }

    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute TodoItem todoItem) {
        return "redirect:/" + Mappings.ITEMS;
    }
}
