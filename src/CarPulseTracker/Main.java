package CarPulseTracker;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> garage = Arrays.asList(
            new Car("911 Carrera", "Porsche", 379, 8),
            new Car("Model S Plaid", "Tesla", 1020, 9),
            new Car("MP4-12C", "McLaren", 592, 10),
            new Car("Mustang GT", "Ford", 450, 9)
        );

        System.out.println("🚗 Welcome to Pulse Racer Showdown!");
        boolean playing = true;

        while (playing) {
            System.out.println("\nChoose two cars to race:");
            for (int i = 0; i < garage.size(); i++) {
                System.out.println(i + ": " + garage.get(i).getModel());
            }

            System.out.print("Enter first car number: ");
            int first = scanner.nextInt();
            System.out.print("Enter second car number: ");
            int second = scanner.nextInt();

            Car carA = garage.get(first);
            Car carB = garage.get(second);

            System.out.println("\n🏁 Racing " + carA.getModel() + " vs " + carB.getModel());

            Car winner = carA.getHorsepower() > carB.getHorsepower() ? carA : carB;
            System.out.println("🔥 Winner: " + winner.describe());

            System.out.print("\nPlay again? (y/n): ");
            playing = scanner.next().equalsIgnoreCase("y");
        }

        System.out.println("👋 Thanks for playing!");
    }
}