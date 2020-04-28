package sayuri.cicddemo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Employee extends BaseEntity<Integer> implements Serializable {

    @NotBlank
    @Size(max = 30)
    String name;

    @NotNull
    @Range(min = 14, max = 120)
    Integer age;
}
