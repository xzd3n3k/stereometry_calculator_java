package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = printMenu();
        while (menu!=0){
            switch (menu) {
                case 1 -> {
                    clearConsoleScreen();
                    int object_menu = printObjectMenu();
                    while (object_menu!=0) {
                        switch (object_menu) {
                            case 1 -> {
                                clearConsoleScreen();
                                System.out.print("""
                                        Krychle
                                        V = aˆ3
                                        S = 6 * aˆ2
                                                                            
                                        zadejte stranu a:""");
                                try {
                                    double side_a = scanner.nextDouble();

                                    System.out.println();
                                    System.out.println();

                                    double capacity = Math.pow(side_a, 3);
                                    double area = 6 * (side_a * side_a);

                                    System.out.println("Objem krychle: " + capacity + "\nObsah krychle: " + area);
                                } catch (Exception e) {
                                    System.out.println("Neplatna hodnota!");
                                }
                                System.out.print("\n\nStisknete enter pro pokracovani...");
                                scanner.nextLine();
                                scanner.nextLine();
                                clearConsoleScreen();
                            }
                            case 2 -> {
                                clearConsoleScreen();
                                System.out.print("""
                                        Kvadr
                                        V = a * b * c
                                        S = 2 * (ab + ac + bc)
                                                                            
                                        zadejte stranu a:""");
                                try {
                                    double side_a = scanner.nextDouble();
                                    System.out.print("zadejte stranu b:");
                                    double side_b = scanner.nextDouble();
                                    System.out.print("zadejte stranu c:");
                                    double side_c = scanner.nextDouble();

                                    System.out.println();
                                    System.out.println();

                                    double capacity = side_a * side_b * side_c;
                                    double area = 2 * (side_a * side_b + side_a * side_c + side_b * side_c);

                                    System.out.println("Objem kvadru: " + capacity + "\nObsah kvadru: " + area);
                                } catch (Exception e) {
                                    System.out.println("Neplatna hodnota!");
                                }
                                System.out.print("\n\nStisknete enter pro pokracovani...");
                                scanner.nextLine();
                                scanner.nextLine();
                                clearConsoleScreen();
                            }
                            case 3 -> {
                                clearConsoleScreen();
                                System.out.print("""
                                        Valec
                                        V = π * rˆ2 * v
                                        S = 2πr * (r + v)
                                                                            
                                        zadejte polomer:""");
                                try {
                                    double radius = scanner.nextDouble();
                                    System.out.print("zadejte vysku:");
                                    double height = scanner.nextDouble();

                                    System.out.println();
                                    System.out.println();

                                    double capacity = Math.PI * (radius * radius) * height;
                                    double area = 2 * Math.PI * radius * (radius + height);

                                    System.out.println("Objem valce: " + capacity + "\nObsah valce: " + area);
                                } catch (Exception e) {
                                    System.out.println("Neplatna hodnota!");
                                }
                                System.out.print("\n\nStisknete enter pro pokracovani...");
                                scanner.nextLine();
                                scanner.nextLine();
                                clearConsoleScreen();
                            }
                            case 4 -> {
                                clearConsoleScreen();
                                System.out.print("""
                                        Kuzel
                                        V = 1/3π * rˆ2 * v
                                        S = πr * (r + s)
                                                                            
                                        zadejte polomer:""");
                                try {
                                    double radius = scanner.nextDouble();
                                    System.out.print("zadejte vysku:");
                                    double height = scanner.nextDouble();
                                    System.out.print("zadejte polomer plaste:");
                                    double side = scanner.nextDouble();

                                    System.out.println();
                                    System.out.println();

                                    double capacity = (1 / 3) * Math.PI * (radius * radius) * height;
                                    double area = Math.PI * radius * (radius + side);

                                    System.out.println("Objem kuzele: " + capacity + "\nObsah kuzele: " + area);
                                } catch (Exception e) {
                                    System.out.println("Neplatna hodnota!");
                                }
                                System.out.print("\n\nStisknete enter pro pokracovani...");
                                scanner.nextLine();
                                scanner.nextLine();
                                clearConsoleScreen();
                            }
                            case 5 -> {
                                clearConsoleScreen();
                                System.out.print("""
                                        Koule
                                        V = 4/3π * rˆ3
                                        S = 4π * rˆ2
                                                                            
                                        zadejte polomer:""");
                                try {
                                    double radius = scanner.nextDouble();

                                    System.out.println();
                                    System.out.println();

                                    double capacity = (4 / 3) * Math.PI * (Math.pow(radius, 3));
                                    double area = 4 * Math.PI * (radius * radius);

                                    System.out.println("Objem koule: " + capacity + "\nObsah koule: " + area);
                                } catch (Exception e) {
                                    System.out.println("Neplatna hodnota!");
                                }
                                System.out.print("\n\nStisknete enter pro pokracovani...");
                                scanner.nextLine();
                                scanner.nextLine();
                                clearConsoleScreen();
                            }
                            case 6 -> {
                                clearConsoleScreen();
                                System.out.print("""
                                        Trojboky hranol
                                        V = Sp * v
                                        S = 2 * Sp + Spl
                                                                            
                                        zadejte hranu:""");
                                try {
                                    double edge = scanner.nextDouble();
                                    System.out.print("zadejte vysku:");
                                    double height = scanner.nextDouble();

                                    System.out.println();
                                    System.out.println();

                                    double sp = (Math.sqrt(3) / 4) * (edge * edge);
                                    double capacity = sp * height;
                                    double area = ((2 * sp) + 3 * edge * height);

                                    System.out.println("Objem hranolu: " + capacity + "\nObsah hranolu: " + area);
                                } catch (Exception e) {
                                    System.out.println("Neplatna hodnota!");
                                }
                                System.out.print("\n\nStisknete enter pro pokracovani...");
                                scanner.nextLine();
                                scanner.nextLine();
                                clearConsoleScreen();
                            }
                            case 7 -> {
                                clearConsoleScreen();
                                System.out.print("""
                                        Ctyrboky jehlan
                                        V = 1/3 * Sp * v
                                        S = Sp + Spl
                                                                            
                                        zadejte hranu:""");
                                try {
                                    double edge = scanner.nextDouble();
                                    System.out.print("zadejte stranu:");
                                    double side = scanner.nextDouble();

                                    System.out.println();
                                    System.out.println();

                                    double v = (side * side) - (Math.pow((edge / 2), 2));
                                    v = Math.sqrt(v);
                                    double v2 = (v * v) - (Math.pow((edge / 2), 2));
                                    v2 = Math.sqrt(v2);
                                    double height = v2;

                                    System.out.println("vyska " + height);
                                    double pol = (edge + (2 * side)) / 2;
                                    double obs = pol * (Math.pow((pol - side), 2)) * (pol - edge);
                                    obs = Math.sqrt(obs);

                                    double capacity = (1 / 3) * (edge * edge) * height;
                                    double area = (edge * edge) + 4 * (obs);

                                    System.out.println("Objem jehlanu: " + capacity + "\nObsah jehlanu: " + area);
                                } catch (Exception e) {
                                    System.out.println("Neplatna hodnota!");
                                }
                                System.out.print("\n\nStisknete enter pro pokracovani...");
                                scanner.nextLine();
                                scanner.nextLine();
                                clearConsoleScreen();
                            }
                            default -> {
                                clearConsoleScreen();
                                System.out.println("Neplatna moznost, stisknete enter pro pokracovani...!");
                                scanner.nextLine();
                                clearConsoleScreen();
                            }
                        }
                        object_menu = printObjectMenu();
                    }
                    clearConsoleScreen();
                }
                case 2 -> {
                    clearConsoleScreen();
                    System.out.print("Unpublished Work © 2022 Petra Spackova");
                    String a = "\n";
                    a = a.repeat(10);
                    System.out.println(a + "Stisknete enter pro navrat do hlavniho menu...");
                    scanner.nextLine();
                    clearConsoleScreen();
                }
                default -> {
                    System.out.println("Neplatna moznost!");
                    System.out.println("Stisknete enter pro navrat do hlavniho menu...");
                    scanner.nextLine();
                    clearConsoleScreen();
                }
            }
            menu = printMenu();
        }
        System.exit(0);
    }

    public static void clearConsoleScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    public static int printMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                [1] Vzorecky a kalkulacka
                [2] O aplikaci
                [0] Ukoncit aplikaci""");
        return scanner.nextInt();
    }

    public static int printObjectMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                [1] Krychle
                [2] Kvadr
                [3] Valec
                [4] Kuzel
                [5] Koule
                [6] Trojboky hranol
                [7] Ctyrboky jehlan
                [0] Zpet""");
        return scanner.nextInt();
    }
}
