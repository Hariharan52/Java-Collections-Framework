import java.util.ArrayList;

class ForLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Benz");
        cars.add("Thor");
        cars.add("Audi");
        cars.add("Benz");

        for(int i=0;i<cars.size();i++)
        {
            System.out.println(cars.get(i));
        }
    }
}
