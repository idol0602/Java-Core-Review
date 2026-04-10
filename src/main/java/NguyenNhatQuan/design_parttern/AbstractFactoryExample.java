package NguyenNhatQuan.design_parttern;

public class AbstractFactoryExample {

    interface Button {
        void render();
    }

    interface CheckBox {
        void render();
    }

    static class DarkButton implements Button {
        @Override
        public void render() {
            System.out.println("Dark Button");
        }
    }

    static class DarkCheckBox implements CheckBox {
        @Override
        public void render() {
            System.out.println("Dark Checkbox");
        }
    }

    interface UIFactory {
        Button createButton();
        CheckBox createCheckbox();
    }

    static class DarkFactory implements UIFactory {
        @Override
        public Button createButton() {
            return new DarkButton();
        }

        @Override
        public CheckBox createCheckbox() {
            return new DarkCheckBox();
        }
    }

    public static void main(String[] args) {
        UIFactory factory = new DarkFactory();
        factory.createButton().render();
        factory.createCheckbox().render();
    }
}
