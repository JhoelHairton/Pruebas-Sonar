package service;

import org.junit.Assert;
import org.junit.Test;

public class AnagramaCheckerTest {
    private final AnagramaChecker checker = new AnagramaCheckerImpl();

    @Test
    public void testSonAnagramas_CasoPositivo() {
        Assert.assertTrue(checker.sonAnagramas("congreso", "sogrecon"));
    }

    @Test
    public void testSonAnagramas_CasoNegativo() {
        Assert.assertFalse(checker.sonAnagramas("hola", "mundo"));
    }

    @Test
    public void testSonAnagramas_MayusculasMinusculas() {
        Assert.assertTrue(checker.sonAnagramas("Java", "avaj"));
    }

    @Test
    public void testSonAnagramas_LongitudDiferente() {
        Assert.assertFalse(checker.sonAnagramas("abc", "abcd"));
    }
}
