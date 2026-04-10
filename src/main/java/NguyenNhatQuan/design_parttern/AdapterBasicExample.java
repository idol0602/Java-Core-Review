package NguyenNhatQuan.design_parttern;

public class AdapterBasicExample {
    interface Printer {
        void print();
    }

    static class OldPrinter {
        public void printOld() {
            System.out.println("Old Printer printing...");
        }
    }

    static class NewPrinter implements Printer {
        private OldPrinter oldPrinter;

        public NewPrinter(OldPrinter oldPrinter) {
            this.oldPrinter = oldPrinter;
        }

        @Override
        public void print() {
            oldPrinter.printOld();
        }
    }

    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        NewPrinter newPrinter = new NewPrinter(oldPrinter);
        newPrinter.print();
    }
}
