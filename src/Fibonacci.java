import java.util.Scanner;

public class Fibonacci {

  public void verifyNumber() {
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Verificar se um número faz parte da sequência Fibonacci iniciada em 0 e 1");
      System.out.print("Digite um número: ");
      int number = scanner.nextInt();

      if (isFibonacci(number)) {
        System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
      } else {
        System.out.println("O número " + number + " não pertence à sequência de Fibonacci");
      }

    } catch (Exception e) {
      throw new RuntimeException("Entre com um número válido");
    }

  }

  public static boolean isFibonacci(int number) {
    if (number < 0) {
      return false;
    }
    int first = 0;
    int second = 1;
    while (second < number) {
      int third = second;
      second = first + second;
      first = third;
    }
    return second == number || first == number;
  }

}
