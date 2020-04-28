package sayuri.cicddemo.service.impl;

import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import sayuri.cicddemo.repository.BaseCrudRepository;

import java.util.Optional;

class AbstractCrudService<T, K> {

    protected final BaseCrudRepository<T, K> repository;

    public AbstractCrudService(BaseCrudRepository<T, K> repository) {
        this.repository = repository;
    }

    public Optional<T> findOne(Predicate predicate) {
        return Optional.empty();
    }

    public Iterable<T> findAll(Predicate predicate) {
        return repository.findAll();
    }

    public Iterable<T> findAll(Predicate predicate, Sort sort) {
        return repository.findAll(predicate, sort);
    }

    public Iterable<T> findAll(Predicate predicate, OrderSpecifier<?>... orderSpecifiers) {
        return repository.findAll(predicate, orderSpecifiers);
    }

    public Iterable<T> findAll(OrderSpecifier<?>... orderSpecifiers) {
        return repository.findAll(orderSpecifiers);
    }

    public Page<T> findAll(Predicate predicate, Pageable pageable) {
        return repository.findAll(predicate, pageable);
    }

    public long count(Predicate predicate) {
        return repository.count(predicate);
    }

    public boolean exists(Predicate predicate) {
        return repository.exists(predicate);
    }

    public <S extends T> S save(S s) {
        return repository.save(s);
    }

    public <S extends T> Iterable<S> saveAll(Iterable<S> iterable) {
        return repository.saveAll(iterable);
    }

    public Optional<T> findById(K k) {
        return repository.findById(k);
    }

    public boolean existsById(K k) {
        return repository.existsById(k);
    }

    public Iterable<T> findAll() {
        return repository.findAll();
    }

    public Iterable<T> findAllById(Iterable<K> iterable) {
        return repository.findAllById(iterable);
    }

    public long count() {
        return repository.count();
    }

    public void deleteById(K k) {
        repository.deleteById(k);
    }

    public void delete(T t) {
        repository.delete(t);
    }

    public void deleteAll(Iterable<? extends T> iterable) {
        repository.deleteAll(iterable);
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
