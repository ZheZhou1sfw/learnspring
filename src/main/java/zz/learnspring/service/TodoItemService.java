package zz.learnspring.service;

import zz.learnspring.model.TodoData;
import zz.learnspring.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem toAdd);

    void removeItem(int id);

    TodoItem getItem(int id);

    void updateItem(TodoItem toUpdate);

    TodoData getData();
}
