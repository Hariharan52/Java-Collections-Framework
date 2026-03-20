package ListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ListSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            nums.add(sc.nextInt());
        }
        Collections.sort(nums);
        System.out.println("Sorted Elements:");
        for(int num:nums)
        {
            System.out.println(num);
        }
    }
}
