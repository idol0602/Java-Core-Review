package NguyenNhatQuan.Bai12;

public class Storage<T> {
    private T item;

    public void add(T item) {
        this.item = item;
    }

    public void delete() {
        this.item = null;
    }

    public boolean isEmpty() {
        return this.item == null;
    }

    public T getItem() {
        return this.item;
    }

}
