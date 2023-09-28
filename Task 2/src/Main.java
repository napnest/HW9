import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами

        a=inputNumber();
        checkParity();
    }
    static int a;
    static int inputNumber(){
        System.out.println("Введите целое число: ");
        return new Scanner(System.in).nextInt();
    }
    static void checkParity(){
        System.out.print("Введенное число четное: ");
        System.out.println(a%2==0);
    }
}
