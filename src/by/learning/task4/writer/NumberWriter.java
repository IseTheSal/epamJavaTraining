package by.learning.task4.writer;

public class NumberWriter {

    public static void printReport(boolean result){
        if(result){
            System.out.println("Среди заданных чисел есть хотя бы 2 четных числа");
        } else{
            System.out.println("Среди заданных чисел меньше 2 четных чисел");
        }
    }
}
