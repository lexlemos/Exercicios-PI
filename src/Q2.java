import java.util.*;
import java.lang.Math;
/*Faça um algoritmo que leia um número e mostre uma mensagem indicando se este
número é par ou ímpar e se é positivo ou negativo */
public class Q2{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    System.out.println("Insira o número: ");
    x = sc.nextInt();
    
    if(x < 0){
        System.out.print("é negativo! ");
    }else{
        System.out.print("é positivo ");
    }
    if(x %2 == 0){
        System.out.println("e é par!");
    }else{
        System.out.println("e é impar!");
    }
}
}