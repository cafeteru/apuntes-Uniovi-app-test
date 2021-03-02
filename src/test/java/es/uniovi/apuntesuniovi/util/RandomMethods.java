package es.uniovi.apuntesuniovi.util;

public class RandomMethods {
  public static Integer randomInteger(int min, int max) {
    return (int) (new java.util.Random().nextFloat() * (++max - min) + min);
  }

  public static String randomUsername() {
    return "uo" + RandomMethods.randomInteger(10_000, 99_999);
  }

  public static String dni() {
    int numberDni = randomInteger(10_000_000, 99_999_999);
    String letterDni = "TRWAGMYFPDXBNJZSQVHLCKET";
    return "" + numberDni + letterDni.charAt(numberDni % 23);
  }

  public static String nie() {
    int numberDni = randomInteger(1_000_000, 29_999_999);
    String letterDni = "TRWAGMYFPDXBNJZSQVHLCKET";
    if (numberDni < 10_000_000) {
      return "X" + numberDni + letterDni.charAt(numberDni % 23);
    }
    String stringDni = String.valueOf(numberDni);
    if (stringDni.charAt(0) == '1') {
      return "Y" + stringDni.substring(1) + letterDni.charAt(numberDni % 23);
    }
    return "Z" + stringDni.substring(1) + letterDni.charAt(numberDni % 23);
  }
}
