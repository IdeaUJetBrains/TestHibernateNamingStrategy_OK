package entities;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Olga Pavlova on 11/13/2015.
 */
@Entity
public class Foo {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
