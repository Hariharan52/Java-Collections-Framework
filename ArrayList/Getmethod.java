import java.util.ArrayList;;
public class Getmethod {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");

        System.out.println(cars.get(1));
    }
}
