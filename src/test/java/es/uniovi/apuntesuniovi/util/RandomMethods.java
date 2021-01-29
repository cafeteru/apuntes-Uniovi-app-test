package es.uniovi.apuntesuniovi.util;

public class RandomMethods {
    public static Integer randomInteger(int min, int max) {
        return (int) (new java.util.Random().nextFloat() * (++max - min) + min);
    }

    public static String randomString(int length) {
        String res = "";
        for (int i = 0; i < length; i++) {
            res += (char) randomInteger('A', 'Z').intValue();
        }
        return res;
    }
}
