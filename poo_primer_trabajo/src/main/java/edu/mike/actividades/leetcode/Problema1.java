package edu.mike.actividades.leetcode;


public class Problema1 {

    public static void main(String[] args) {
        String cadena = "Hola mundo";
        String cadenaBuena = "";
        int i = cadena.length();
        
        while(i!= 0){
            cadenaBuena +=""+cadena.charAt(i-1);
            i--;
        }
         System.out.println(cadenaBuena);

    }


    
}
