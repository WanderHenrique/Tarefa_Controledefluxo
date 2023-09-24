import java.util.Scanner;

public class Media {

  public static void main(String[] args) {
    // Declaramos as variáveis
    double nota1, nota2, nota3, nota4;
    double media;

    // Lemos as notas do aluno
    Scanner scanner = new Scanner(System.in);
    nota1 = scanner.nextDouble();
    nota2 = scanner.nextDouble();
    nota3 = scanner.nextDouble();
    nota4 = scanner.nextDouble();

    // Calculamos a média das notas
    media = (nota1 + nota2 + nota3 + nota4) / 4;

    // Imprimimos a média do aluno
    System.out.println("A média do aluno é: " + media);

    // Verificamos se o aluno está aprovado, de recuperação ou reprovado
    if (media >= 7) {
      System.out.println("O aluno está aprovado.");
    } else if (media >= 5) {
      System.out.println("O aluno está de recuperação.");
    } else {
      System.out.println("O aluno está reprovado.");
    }
  }
}
