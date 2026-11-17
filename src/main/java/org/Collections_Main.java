package org;

import java.util.HashSet;
import java.util.Set;

public class Collections_Main {
    record Coordinates(int x, int y) {}

    public static void main(String[] args) {
        Set<Coordinates> visited = new HashSet<>();
        visited.add(new Coordinates(10, 20));
        visited.add(new Coordinates(10, 20));
        visited.add(new Coordinates(20, 10));
        System.out.println("Visited: " + visited);
        System.out.println("Unique coordinates: " + visited.size());
    }
}
