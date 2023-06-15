package com.platzi.javatests.util;

public class PasswordUtil {

    public enum SecurityLevel {
        DEBIL, MASOMENO, BUENARDA;
    }

    public static SecurityLevel assessPassword(String password) {
        if (password.length() < 8)
            return SecurityLevel.DEBIL;

        if (password.matches("[a-zA-Z]+"))
            return SecurityLevel.DEBIL;

        if (password.matches("[a-zA-Z0-9]+"))
            return SecurityLevel.MASOMENO;

        return SecurityLevel.BUENARDA;
    }
}
