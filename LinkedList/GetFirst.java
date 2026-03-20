package LinkedList;

import java.util.LinkedList;

class GetFirst {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");

        System.out.println(colors.getFirst());
    }    
}
