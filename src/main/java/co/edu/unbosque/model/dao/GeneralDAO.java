package co.edu.unbosque.model.dao;

import java.util.List;

public interface GeneralDAO <T, K>{
    public T create(T t);
    public T update(T t);
    public T delete(T t);
    public T find(K id);
    public List<T> findAll();
}
