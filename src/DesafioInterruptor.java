import java.util.Scanner;

public class DesafioInterruptor {

  public static void verify() {

    Scanner scanner = new Scanner(System.in);
    int salaA = 0, salaB = 0, salaC = 0;
    System.out.println("Desafio dos Interruptores X Lâmpadas");
    System.out.println("Temos os interruptores 1, 2 e 3 que ligam lâmpadas nas salas A, B e C aleatoriamente");
    System.out.println("Siga alguns passos abaixo que vou identificar qual interruptor liga qual sala");
    System.out.println("-*-*-* Etapas *-*-*-");
    System.out.println("Escolha mentalmente qual interruptor acende qual sala");
    scanner.nextLine();
    System.out.println("Agora acenda o interruptor 1 e aguarde 5 minutos");
    scanner.nextLine();
    System.out.println("Desligue o interruptor 1, ligue o interruptor 2 e vá até a sala A");
    scanner.nextLine();
    System.out.println("A lâmpada do sala A está acesa? Digite < S / N >");
    while (true) {
      String option = scanner.next().toLowerCase();
      if (option.equals("s")) {
        salaA = 2;
        break;
      } else if (option.equals("n")) {
        while (true) {
          System.out.println("A lâmpada está quente? Digite < S / N >");
          String option2 = scanner.next().toLowerCase();
          if (option2.equals("s")) {
            salaA = 1;
            break;
          } else if (option2.equals("n")) {
            salaA = 3;
            break;
          }
        }
        break;
      }
    }
    if (salaA == 1) {
      System.out.println("Vá para a sala B");
      scanner.nextLine();
      while (true) {
        System.out.println("A lâmpada do sala B está acesa? Digite < S / N >");
        String option = scanner.next().toLowerCase();
        if (option.equals("s")) {
          salaB = 2;
          salaC = 3;
          break;
        } else if (option.equals("n")) {
          salaB = 3;
          salaC = 2;
          break;
        }
      }
    } else if (salaA == 2) {
      System.out.println("Retorne para sala dos interruptores, desligue interruptor 2, ligue interruptor 1 e vá para sala B");
      scanner.nextLine();
      while (true) {
        System.out.println("A lâmpada do sala B está acesa? Digite < S / N >");
        String option = scanner.next().toLowerCase();
        if (option.equals("s")) {
          salaB = 1;
          salaC = 3;
          break;
        } else if (option.equals("n")) {
          salaB = 3;
          salaC = 1;
          break;
        }
      }
    } else {
      System.out.println("Vá para a sala B");
      scanner.nextLine();
      while (true) {
        System.out.println("A lâmpada do sala B está acesa? Digite < S / N >");
        String option = scanner.next().toLowerCase();
        if (option.equals("s")) {
          salaB = 2;
          salaC = 1;
          break;
        } else if (option.equals("n")) {
          salaB = 1;
          salaC = 2;
          break;
        }
      }
    }

    System.out.println("A sala A é ligada através do interruptor " + salaA);
    System.out.println("A sala B é ligada através do interruptor " + salaB);
    System.out.println("A sala C é ligada através do interruptor " + salaC);

  }

}
