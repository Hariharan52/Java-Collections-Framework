package LinkedList;

import java.util.LinkedList;

class AddFirst {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.addFirst("Thor Rox");

        for(String car : cars)
        {
            System.out.println(car);
        }
    }
    
}
