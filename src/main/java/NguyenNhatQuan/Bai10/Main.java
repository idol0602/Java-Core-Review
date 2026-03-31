package NguyenNhatQuan.Bai10;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            return "Hello";
        }).thenApply((s)-> {
            return s + " World";
        }).thenAccept(System.out::println).join();
    }
}
