import java.util.ArrayList;

class ForEach {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Benz");
        cars.add("Thor");
        cars.add("Audi");
        cars.add("Benz");

        for(String car : cars){
            System.out.println(car);
        }
    }
}
