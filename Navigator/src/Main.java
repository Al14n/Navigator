import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние в км.");
        car.rasstoyanie = scanner.nextInt();

        while (car.rasstoyanie > 0){
            car.setSpeed();
            car.rasstoyanie = car.rasstoyanie - (car.speed/60);

            System.out.println("Текущая скорость " + car.speed + " км/ч");
            System.out.println("Расстояние осталось " + car.rasstoyanie + " км");
            System.out.println("Время осталось " + (double)car.rasstoyanie/car.speed + " ч");
            System.out.println(" ");

        }




    }
}