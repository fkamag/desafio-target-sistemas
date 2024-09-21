import java.util.Scanner;

public class VerifyString {

  public static void findLetterA() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Verificar quantas letras A tem em uma string");
    System.out.print("Digite uma string: ");
    String word = scanner.nextLine();
    int quantity = countLetterA(word);

    System.out.println("Nesta string temos " + quantity + " letras 'a'");

  }

  public static int countLetterA(String word) {

    String stringLowercase = word.toLowerCase();
    int counter = 0;

    for (int i = 0; i < stringLowercase.length(); i++) {
      if (stringLowercase.charAt(i) == 'a') {
        counter++;
      }
    }

    return counter;

  }

}
