package sayuri.cicddemo.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity<K extends Number> implements Persistable<K> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    K id;

    @Version
    Integer ver;

    @CreatedDate
    LocalDateTime createdAt;

    @Override
    public K getId() {
        return this.id;
    }

    @Override
    public boolean isNew() {
        return ver == null;
    }
}
