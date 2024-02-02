package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Laptop {
    @Id
    private int id;
    private String model;
    @ManyToMany(mappedBy ="Laptop")
    private List<Laptop> laptops;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public Laptop(int id, String model, List<Laptop> laptops) {
        this.id = id;
        this.model = model;
        this.laptops = laptops;
    }

    public Laptop() {
    }
}
