package ua.lviv.lgs;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Cart {
    private Integer id;
    private Integer total;
    private String name;
    private Set<Item> items = new HashSet<>();;

    public Cart (){}

    public Cart(Integer total, String name) {
        this.total = total;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id.equals(cart.id) && total.equals(cart.total) && name.equals(cart.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, name);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", total=" + total +
                ", name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
