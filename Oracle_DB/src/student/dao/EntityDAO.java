package student.dao;

public interface EntityDAO <T,I> {
    T create(T entity);
    T read(I id);
    T update(T entity);
    void delete(T entity);
}
