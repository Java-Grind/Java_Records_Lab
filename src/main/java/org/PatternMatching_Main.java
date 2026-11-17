package org;

public class PatternMatching_Main {
    sealed interface Event permits UserCreated, OrderPaid {}
    record UserCreated(String name) implements Event {}
    record OrderPaid(long orderId, int amount) implements Event {}

    public static void main(String[] args) {
        Event[] events = {new UserCreated("Ana"), new OrderPaid(17, 120)};
        for (Event event : events) {
            String message = switch (event) {
                case UserCreated(String name) -> "Welcome, " + name;
                case OrderPaid(long orderId, int amount) -> "Order " + orderId + ": " + amount;
            };
            System.out.println(message);
        }
    }
}
