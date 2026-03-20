package LinkedList;

import java.util.LinkedList;

class AddLast {
    public static void main(String[] args) {
        
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        colors.addLast("Red");

        for(String color : colors)
        {
            System.out.println(color);
        }
    }
}
