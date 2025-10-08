import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> carPark = new HashSet<>();



        for (int i = 0; i < 3; i++) {
            int carNumber = i + 1;
            String nameCar;

            while (true) {
                System.out.println("Введите название машины №" + carNumber);
                nameCar = scanner.nextLine().trim();

                if (nameCar.isEmpty()) {
                    System.out.println("Введите название машины!");
                } else if (carPark.contains(nameCar)) {
                    System.out.println("Такая машина уже есть!");
                } else {
                    carPark.add(nameCar);
                    break;
                }
            }

            int speedCar;

            while (true) {
                System.out.println("Введите скорость машины №" + carNumber);
                if (scanner.hasNextInt()) {
                    speedCar = scanner.nextInt();

                    if (speedCar <= 0 || speedCar > 250) {
                        System.out.println("Значение скорости должно быть больше 0 и меньше 250!");
                    } else {
                        break;
                    }

                } else  {
                    System.out.println("Значением скорости может быть только целое число!");
                    scanner.next();
                }
            }

            scanner.nextLine();

            Car cars = new Car(nameCar, speedCar);
            Race.race(cars);

        }

        System.out.println(Race.Resuilt());

    }


}