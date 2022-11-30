package com.bilgeadam.q2;

import java.util.ArrayList;

public class Q201 {
	
    public static String tekrar(int[] arr){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int tekrar = 0;
      
        String sonuç;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                	numbers.add(arr[j]);
                } 
            }
        }
        if(!numbers.isEmpty()){
            for(int i = 0; i < arr.length; i++) { 
                if(arr[i] == numbers.get(0)){
                    tekrar++;
                }
            }
        } 
        if(tekrar != 0){
            sonuç = ""+ numbers.get(0) +" " + tekrar + " kez tekrar ediyor";
        }
        else{
            sonuç = "Tekrar eden sayı bulunamamıştır.";
        }
        return sonuç;
    }


    public static void main(String[] args) {

        int sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };

        System.out.println(tekrar(sayiDizisi));


    }
}