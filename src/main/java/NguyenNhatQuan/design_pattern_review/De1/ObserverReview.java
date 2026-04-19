package NguyenNhatQuan.design_pattern_review.De1;

import java.util.ArrayList;
import java.util.List;

public class ObserverReview {

    interface Observer {
        void update(String suKien);
    }

    interface Publisher {
        void phatSuKien(String suKien);
        void addObserver(Observer observer);
        void removeObserver(Observer observer);
    }

    static class ChuyenXe implements Publisher {
        private List<Observer> observerList = new ArrayList<>();
        @Override
        public void phatSuKien(String suKien) {
            for(Observer o : observerList) {
                o.update(suKien);
            }
        }

        @Override
        public void addObserver(Observer observer) {
            observerList.add(observer);
        }

        @Override
        public void removeObserver(Observer observer) {
            observerList.remove(observer);
        }
    }

    static class DichVuSMS implements Observer {
        @Override
        public void update(String suKien) {
            System.out.println("GUI SMS");
        }
    }

    static class DichVuThongBaoApp implements Observer {
        @Override
        public void update(String suKien) {
            System.out.println("GUI Thong Bao App");
        }
    }

    static class DichVuGhiLichSu implements Observer {
        @Override
        public void update(String suKien) {
            System.out.println("Ghi Dich Vu Lich Su");
        }
    }

    public static void main(String[] args) {
        ChuyenXe chuyenXe = new ChuyenXe();
        DichVuSMS dichVuSMS = new DichVuSMS();
        DichVuThongBaoApp dichVuThongBaoApp = new DichVuThongBaoApp();
        DichVuGhiLichSu dichVuGhiLichSu = new DichVuGhiLichSu();
        chuyenXe.addObserver(dichVuSMS);
        chuyenXe.addObserver(dichVuThongBaoApp);
        chuyenXe.addObserver(dichVuGhiLichSu);
        chuyenXe.phatSuKien("CHUYEN_HOAN_THANH");
    }
}
