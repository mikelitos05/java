package edu.mike.actividades.actividad2.process;


import edu.mike.actividades.actividad2.data.Data;

public class NameValidator {
    
    
    /**
     * Metodo que se encarga de validar si el nombre ingresado es valido
     */
    public static boolean validateName(String name){

        for (String nombre : Data.nombres) {
            if (name.equals(nombre)) {
                return true;
            }
        }
        return false;




    }


}
