import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Введите размер списка: ");
        int listSize = Integer.parseInt(sc.nextLine());

        System.out.println("Введите верхнюю границу для значений: ");
        int upperBound = Integer.parseInt(sc.nextLine());

        logger.log("Создаём и наполняем список");

        List<Integer> list = new Random().ints(listSize, 1, upperBound)
                .boxed().collect(Collectors.toList());

        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите порог для фильтра: ");
        int threshold = Integer.parseInt(sc.nextLine());

        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(threshold);
        List<Integer> result = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }

}
