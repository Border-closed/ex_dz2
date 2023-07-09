import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, 
//когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class task4 {
    public static void main(String[]args) {
        //System.out.println(printYourText());
        printYourText();
     }
 
     public static void printYourText(){
         Scanner in = new Scanner(System.in);
         System.out.print("Введите текст: ");
         String text = in.nextLine();
         if (text.isEmpty()) {
            System.out.println("Вы ввели пустую строку");
            printYourText();
         } else {
            System.out.println("Вы ввели строку: " + text);
         }
         in.close();
     }
}
