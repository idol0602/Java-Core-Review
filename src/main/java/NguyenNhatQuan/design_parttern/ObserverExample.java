package NguyenNhatQuan.design_parttern;

import java.util.ArrayList;
import java.util.List;

public class ObserverExample {

    interface Observer {
        void update(Message message);
    }

    interface Publisher {
        void addObserver(Observer observer);
        void removeObserver(Observer observer);
        void notifyObservers(Message message);
    }

    static class Message {
        private String content;

        public Message(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }

    static class User implements Observer {
        private String name;

        public User(String name) {
            this.name = name;
        }

        @Override
        public void update(Message message) {
            System.out.println(name + " received: " + message.getContent());
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static class Manager implements Publisher {
        private List<Observer> observers = new ArrayList<>();
        @Override
        public void addObserver(Observer observer) {
            observers.add(observer);
        }
        @Override
        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers(Message message) {
            observers.forEach(o -> {
                o.update(message);
            });
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        User user1 = new User("Quan");
        User user2 = new User("An");
        User user3 = new User("Binh");

        manager.addObserver(user1);
        manager.addObserver(user2);
        manager.addObserver(user3);

        manager.notifyObservers(new Message("Hello"));

        manager.removeObserver(user2);

        manager.notifyObservers(new Message("Kick!!!"));
    }
}
