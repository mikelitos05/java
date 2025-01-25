package edu.mike.actividades.leetcode;

import java.util.Arrays;

public class Problema1Semanal {

    public static void main(String[] args) {
        int[] nums = {-7, -2, 2, 15};
        
        int[] resultado = new int[nums.length];
        int izquierda = 0;
        int derecha = nums.length - 1;
        int indice = derecha;

        while (izquierda<=derecha) {
            int cuadradoIzquierda = nums[izquierda] * nums[izquierda];
            int cuadradoDerecha = nums[derecha] * nums[derecha];
            
            if (cuadradoIzquierda > cuadradoDerecha) {
                resultado[indice] = cuadradoIzquierda;
                izquierda++;
            } else {
                resultado[indice] = cuadradoDerecha;
                derecha--;
            }
            indice--;
        }
        System.out.println(Arrays.toString(resultado));
        
    }

}

