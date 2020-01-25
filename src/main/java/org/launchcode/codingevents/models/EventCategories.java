package org.launchcode.codingevents.models;


import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

@Entity
public class EventCategories {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public EventCategories (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public EventCategories() {}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



//    public interface EventCategoryRepository extends CrudRepository<Event, Integer> {}
}
