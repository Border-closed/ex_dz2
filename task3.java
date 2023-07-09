import java.io.FileNotFoundException;

public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 0;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
       // } catch (Throwable ex) {
        //    System.out.println("Что-то пошло не так..."); убрал, есть более прикладные эксепшены
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException e) {
            System.out.println("Пытаетесь разделить на 0");
        }
     }
     public static void printSum(Integer a, Integer b) { // убрал throws FileNotFoundException тут не запрашивается доступ к файлу
        System.out.println(a + b); 
     }
     
}
