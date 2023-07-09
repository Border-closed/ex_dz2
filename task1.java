import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
//и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, 
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class task1{
    public static void main(String[]args) {
       printYouNumber();
    }

    public static void printYouNumber(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (in.hasNextInt()) {
            int num = in.nextInt();
        } else {
            System.out.print("Вы ввели не целое число: ");
            printYouNumber();
        }
        in.close();
    }
}