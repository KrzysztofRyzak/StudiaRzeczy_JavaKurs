package Projekt_Prog.dao;

import java.util.List;

public abstract class AbstractDAO<T> {
    public abstract List<T> readItems();

    public abstract T readItem(int id);

    public abstract void createItem(T item);

    public abstract void updateItem(T item);

    public abstract void deleteItem(int id);
}
