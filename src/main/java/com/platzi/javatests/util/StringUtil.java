package com.platzi.javatests.util;

public class StringUtil {
    public static String repeat(String str, int veces) {

        if (veces < 0) {
            throw new IllegalArgumentException("No puede ejecutar repeticiones con números negativos.");
        }

        String result = "";

        for (int i = 0; i < veces; i++) {
            result += str;
        }
        return result;
    }

    public static boolean isEmpty(String str) {
         if (str == null || str.trim().equals("")) {
             return true;
         }

         return false;
    }
}
