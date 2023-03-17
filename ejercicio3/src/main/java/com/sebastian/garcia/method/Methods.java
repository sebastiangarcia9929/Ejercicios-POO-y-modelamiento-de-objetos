package com.sebastian.garcia.method;

public class Methods {

    int i,j;
    int aux;
    int number;
    public void bubble(int randomNumber[]){
        for (i = 0; i < randomNumber.length; i++) {
            for (j = 0; j < randomNumber.length - 1; j++) {
                if (randomNumber[j] > randomNumber[j + 1]) {
                    aux = randomNumber[j];
                    randomNumber[j] = randomNumber[j + 1];
                    randomNumber[j + 1] = aux;
                }
            }

        }
    }
    public void quick_sort(int array[],int low, int n){
        int lo = low;
        int hi = n;
        if (lo >= n) {
            return;
        }
        int middle = array[(lo + hi) / 2];
        while (lo < hi) {
            while (lo<hi && array[lo] < middle) {
                lo++;
            }
            while (lo<hi && array[hi] > middle) {
                hi--;
            }
            if (lo < hi) {
                int T = array[lo];
                array[lo] = array[hi];
                array[hi] = T;
            }
        }
        if (hi < lo) {
            int T = hi;
            hi = lo;
            lo = T;
        }
        quick_sort(array, low, lo);
        quick_sort(array, lo == low ? lo+1 : lo, n);
    }

    public void show(int arrayNumbers[]){

        for (i = 0; i < arrayNumbers.length; i++) {
            number = arrayNumbers[i];
            System.out.print(number);
            if (i < arrayNumbers.length-1) {
                System.out.print(",");
            }
        }

    }
}

