package codeforces;

import java.util.*;

class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int faces = 0;

        for (int i = 0; i < n; i++) {
            String poly = scanner.next();
            
            switch (poly) {
                case "Tetrahedron":
                    faces += 4;
                    break;
                case "Cube":
                    faces += 6;
                    break;
                case "Octahedron":
                    faces += 8;
                    break;
                case "Dodecahedron":
                    faces += 12;
                    break;
                case "Icosahedron":
                    faces += 20;
                    break;
            }
        }
        System.out.println(faces);
        scanner.close();
    }
}