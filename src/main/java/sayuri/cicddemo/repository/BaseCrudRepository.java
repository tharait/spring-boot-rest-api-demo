package sayuri.cicddemo.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseCrudRepository<T, K> extends CrudRepository<T, K>, QuerydslPredicateExecutor<T> {
}
