package edu.mike.actividades.actividad2.process;


import edu.mike.actividades.actividad2.data.Data;

public class NameValidator {
    
    

    public static boolean validateName(String name){

        for (String nombre : Data.nombres) {
            if (name.equals(nombre)) {
                return true;
            }
        }
        return false;




    }


}
