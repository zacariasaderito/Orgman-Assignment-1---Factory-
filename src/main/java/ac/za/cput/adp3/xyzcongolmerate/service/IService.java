package ac.za.cput.adp3.xyzcongolmerate.service;

import java.util.Set;

public interface IService<T, ID> {
    T create(T d);
    T read(ID id);
    T update(T t);
    void delete(ID id);
    Set<T> getAll();
}
