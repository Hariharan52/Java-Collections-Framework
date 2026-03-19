import java.util.ArrayList;

class RemoveMethod {
     public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add("Volvo");

    cars.remove(1);
    System.out.println(cars);
     }
}
