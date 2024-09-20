import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    while (true) {
      System.out.println("Desafios Estágio em Desenvolvimento");
      System.out.println("Qual desafio quer rodar");
      System.out.println("1 - Fibonacci");
      System.out.println("0 - Sair");
      System.out.print("Digite a opção escolhida: ");
      String option = scanner.nextLine();

      if (option.equals("1")) {
        System.out.println("Executar Fibonacci");
      } else if (option.equals("0")) {
        break;
      }
    }

    System.out.println("Grato por utilizar o sistema");

  }

}
