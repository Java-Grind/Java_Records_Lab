package org;

public class Validation_Main {
    record Email(String value) {
        Email {
            if (value == null || !value.contains("@")) {
                throw new IllegalArgumentException("Email must contain @");
            }
            value = value.trim().toLowerCase();
        }
    }

    public static void main(String[] args) {
        Email email = new Email("  HELLO@JAVA.GRIND  ");
        System.out.println("Normalized: " + email.value());
        try {
            new Email("not-an-email");
        } catch (IllegalArgumentException exception) {
            System.out.println("Rejected: " + exception.getMessage());
        }
    }
}
