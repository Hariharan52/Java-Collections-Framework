import java.util.ArrayList;

class SetMethod {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Ford");

        cars.set(3,"Benz");
        System.out.println(cars);
    }   
}
