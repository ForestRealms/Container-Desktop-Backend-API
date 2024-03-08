package container.desktop.api.repository;

import container.desktop.api.entity.Entity;

import java.util.List;
import java.util.Optional;

public interface Repository<T extends Entity> {
    List<T> findAll();
    T save(T entity);
    void delete(T entity);
    T saveAndFlush(T entity);
}
