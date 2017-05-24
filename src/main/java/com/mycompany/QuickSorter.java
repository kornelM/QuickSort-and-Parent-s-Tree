package com.mycompany;

/**
 * Created by kornel on 23.05.17.
 */
public class QuickSorter {
    private int array[];
    private int length;

    public void sort (int[] table){

        if (table.length == 0 || table == null){
            return;
        }
        else{
            this.array = table;
            length = table.length;
            quickSort(0, length - 1);
        }
    }

    private void quickSort(int bottom, int top){
        int i = bottom;
        int j = top;

        int middle = array[bottom + (top - bottom)/2];
        System.out.println(middle);

        do
        {
            while (array[i] < middle)
                i++;
            while (array[j] > middle)
                j--;
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }while (i <=j );

       // call quickSort() method recursively
        if (bottom < j)
            quickSort(bottom, j);
        if (i < top)
            quickSort(i, top);
    }


    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
