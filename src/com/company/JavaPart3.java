package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaPart3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное число: ");
        int x = scanner.nextInt();
        try {
            if(x < 0)
                throw new Exception("отрицательные числа запрещены");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        ArrayList<Range> bag = new ArrayList<Range>(3);
        bag.add(new Range(0,17));
        bag.add(new Range(18,65));
        bag.add(new Range(66,null));
        for(int i = 0; i < bag.size(); i++) {
            Range range = bag.get(i);
            if (range.isIn(x)) {
                System.out.println(range.getName());
                return;
            }
        }
    }
}
