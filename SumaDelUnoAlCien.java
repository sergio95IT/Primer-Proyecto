package com.cfgs.dam;

public class SumaDelUnoAlCien {

    public static int suma(int a, int i){
        for (i = 1; i<=100; i++){
            a += i;
        }
        return a;
    }
    public static void main(String[] args) {
	int sum = 0;
	int contador = 1;

	System.out.println("El resultado de la suma es: "+ SumaDelUnoAlCien.suma(sum,contador));
    }


}
