package ua.lviv.lgs;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Item {
    private Integer id;
    private Integer total;
    private Set<Cart> carts = new HashSet<>();

    public Item(){}

    public Item(Integer total) {
        this.total = total;
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

    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id.equals(item.id) && total.equals(item.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", total=" + total +
                ", carts=" + carts +
                '}';
    }
}
