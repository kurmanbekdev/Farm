import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        animal();
    }
    private static void animal () {
            Cow cow = new Cow(234, 3, "Мал");
            Cow cow1 = new Cow(300, 4, "Мал");
            Cow cow2 = new Cow(600, 2, "Бука");
            Cow cow3 = new Cow(650, 3, "Бука");
            Cow cow4 = new Cow(240, 4, "Мал");
            Cow[] cow5 = {cow, cow1, cow2, cow3, cow4};
            Cow[] cow6 = {cow4};
            Sheep sheep = new Sheep(14, 1, "Козу", "Misha");
            Sheep sheep1 = new Sheep(26, 3, "Кой", "Misha");
            Sheep sheep2 = new Sheep(32, 4, "Кой", "Саша");
            Sheep[] sheep3 = {sheep, sheep1, sheep2};
            Sheep[] sheep4 = {sheep};
            House house = new House(400, 2, "Ат", "Кашка");
            House house1 = new House(600, 3, "Ат", "Мустанк");
            House[] horse2 = {house, house1};
            House[] horse3 = {house};
            new Farm();

            Farm farm1 = new Farm("Жайыт", "Ariet", cow5, sheep4, horse3);
            Farm farm2 = new Farm("Жайыт", "Dastan", cow6, sheep3, horse2);
            System.out.println(farm1);
            System.out.println(farm2);
        }
    }


