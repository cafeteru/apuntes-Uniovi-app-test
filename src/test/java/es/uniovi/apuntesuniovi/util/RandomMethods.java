package es.uniovi.apuntesuniovi.util;

public class RandomMethods {
  public static Integer randomInteger(int min, int max) {
    return (int) (new java.util.Random().nextFloat() * (++max - min) + min);
  }

  public static String randomUsername() {
    return "uo" + RandomMethods.randomInteger(10_000, 99_999);
  }

  public static String dni() {
    int dni = randomInteger(10_000_000, 99_999_999);
    String code = "TRWAGMYFPDXBNJZSQVHLCKET";
    return "" + dni + code.charAt(dni % 23);
  }
}
