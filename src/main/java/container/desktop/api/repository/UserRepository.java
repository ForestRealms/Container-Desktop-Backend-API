package container.desktop.api.repository;

import container.desktop.api.entity.User;

import java.util.Optional;

public interface UserRepository<U extends User> extends Repository<U> {
    Optional<U> findByUsername(String username);
    Optional<U> findById(Long Id);
    void deleteById(Long id);
    void deleteByUsername(String username);
}
