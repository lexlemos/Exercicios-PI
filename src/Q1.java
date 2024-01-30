import java.util.*;
import java.lang.Math;

public class Q1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x, y;
    double soma = 0;
    System.out.println("Insira o primeiro número: ");
    x = sc.nextInt();
    System.out.println("Insira o segundo número: ");
    y = sc.nextInt();
    
    soma = (Math.sqrt(Math.pow(x,2))) - (Math.sqrt(Math.pow(y,2)));
    System.out.printf("A diferença entre o maior e o menor número é igual a: %.2f", soma);
}
}