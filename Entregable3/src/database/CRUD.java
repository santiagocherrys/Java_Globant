package database;

import java.util.List;

public interface CRUD {
    //Object is a generic, can return anything that can be a n object
    public Object insert(Object obj);
    public List<Object> findAll();
    public boolean  update(Object obj);
    public boolean delete(Object obj);
}
