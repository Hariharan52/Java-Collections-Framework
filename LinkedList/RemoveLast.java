package LinkedList;

import java.util.LinkedList;

class RemoveLast {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");

        colors.removeLast();
        for(String color : colors)
        {
            System.out.println(color);
        }
    }
}
