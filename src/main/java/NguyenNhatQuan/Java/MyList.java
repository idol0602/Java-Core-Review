package NguyenNhatQuan.Java;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private List<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return this.list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void add(T t) {
        if(list.contains(t)) {
            return;
        }
        list.add(t);
    }

    public void remove(T t) {
        list.remove(t);
    }

    public List<T> getAll() {
        return this.list;
    }
}
