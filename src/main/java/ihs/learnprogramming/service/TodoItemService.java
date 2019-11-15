package ihs.learnprogramming.service;

import ihs.learnprogramming.model.TodoData;
import ihs.learnprogramming.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem toAdd);

    void removeItem(int id);

    TodoItem getItem(int id);

    void updateItem(TodoItem toUpdate);

    TodoData getData();

}
