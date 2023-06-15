package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {

    @Test
    public void debil_cuando_tiene_menos_de_ocho_Letras() {
        Assert.assertEquals(DEBIL, PasswordUtil.assessPassword("0303456"));
    }

    @Test
    public void debil_cuando_tiene_solo_letras() {
        Assert.assertEquals(DEBIL, PasswordUtil.assessPassword("password"));
    }

    @Test
    public void masomeno_cuando_tiene_letras_y_numeros() {
        Assert.assertEquals(MASOMENO, PasswordUtil.assessPassword("Hola1234"));
    }

    @Test
    public void buenarda_cuando_tiene_letras_numeros_y_simbolos() {
        Assert.assertEquals(BUENARDA, PasswordUtil.assessPassword("Hola1234!#$"));
    }
}
