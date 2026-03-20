package ListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ListReverseSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            colors.add(sc.next());
        }
        Collections.sort(colors,Collections.reverseOrder());
        System.out.println("Sorted Elements:");
        for(String color:colors)
        {
            System.out.println(color);
        }
    }
}
