package NguyenNhatQuan.designPattern.State;

public class Context {
    State state;
    Context(State state) {
        this.state = state;
    }
    void setState(State state) {
        this.state = state;
    }
    void next() {

    }
}
