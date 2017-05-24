package com.mycompany;


/**
 * Created by kornel on 23.05.17.
 */
public class Main {
    public static void main(String[] args) {

        int[] intTable = {5,3,5,8,2,3,0,1,6,7,7};
        printTable(intTable);

        QuickSorter quickSorter = new QuickSorter();
        quickSorter.sort(intTable);


       // MyQuickSort sorter = new MyQuickSort();
        //sorter.sort(intTable);


        System.out.println();
        printTable(intTable);


    }



    public static void printTable (int[] table)
    {
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i]);
            System.out.print(", ");
        }
    }
}
