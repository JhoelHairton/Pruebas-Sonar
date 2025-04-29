package service;

import java.util.Arrays;

public class AnagramaCheckerImpl implements AnagramaChecker {
    @Override
    public boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        char[] arr1 = palabra1.toLowerCase().toCharArray();
        char[] arr2 = palabra2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
