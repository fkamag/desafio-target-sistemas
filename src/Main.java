import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    label:
    while (true) {
      System.out.println("Desafios Estágio em Desenvolvimento");
      System.out.println("Qual desafio quer rodar");
      System.out.println("1 - Fibonacci");
      System.out.println("2 - Verificar se String tem letra 'a'");
      System.out.println("3 - Desafio Soma");
      System.out.println("4 - Desafio Progressão");
      System.out.println("0 - Sair");
      System.out.print("Digite a opção escolhida: ");
      String option = scanner.nextLine();

      switch (option) {
        case "1":
          Fibonacci.verifyNumber();
          break;
        case "2":
          VerifyString.findLetterA();
          break;
        case "3":
          DesafioSoma.soma();
          break;
        case "4":
          DesafioProgressao.progressao();
          break;
        case "0":
          break label;
      }
    }

    System.out.println("Grato por utilizar o sistema");
    scanner.close();

  }

}
