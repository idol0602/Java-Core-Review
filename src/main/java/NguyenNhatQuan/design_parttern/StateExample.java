package NguyenNhatQuan.design_parttern;

public class StateExample {

    static class Context {
        private State state;

        Context(State state) {
            this.state = state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public void next() {
            state.next(this);
        }
    }

    interface State {
        void next(Context context);
    }

    static class OrderState implements State {
        @Override
        public void next(Context context) {
            System.out.println("Cur State is Order, are changing to Pay State");
            context.setState(new PaidState());
        }
    }

    static class PaidState implements State {
        @Override
        public void next(Context context) {
            System.out.println("Cur State is Paid, are changing to Ship State");
            context.setState(new ShippedState());
        }
    }

    static class ShippedState implements State {
        @Override
        public void next(Context context) {
            System.out.println("Cur State is Shipped");
        }
    }

    public static void main(String[] args) {
        Context context = new Context(new OrderState());
        context.next();
        context.next();
        context.next();
    }
}
