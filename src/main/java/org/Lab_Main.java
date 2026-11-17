package org;

public class Lab_Main {
    record User(long id, String name, String role) {}

    public static void main(String[] args) {
        System.out.println("Starting Lab Main");
        User user = new User(42, "Mila", "admin");
        System.out.println("id: " + user.id());
        System.out.println("name: " + user.name());
        System.out.println("record: " + user);
    }
}
