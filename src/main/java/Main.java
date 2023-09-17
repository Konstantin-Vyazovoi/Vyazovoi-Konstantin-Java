import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String text = scanner.nextLine();
        System.out.println(HelloAlg.getGreeting(text));
        System.out.println("Введите массив чисел: ");
        String[] massive = scanner.nextLine().split(",");
        List<Integer> nums = new ArrayList<>();
        for (String s : massive) {
            try {
                int num = Integer.parseInt(s.trim());
                if (num % 3 == 0) nums.add(num);
            } catch (NumberFormatException e) {
                System.out.println("В массиве должны быть только числа");
            }
        }
        System.out.println(nums);
    }

}
