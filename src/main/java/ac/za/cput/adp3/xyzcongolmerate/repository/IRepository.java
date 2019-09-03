package ac.za.cput.adp3.xyzcongolmerate.repository;

import java.util.Set;

public interface IRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
    Set<T> getAll();
}
