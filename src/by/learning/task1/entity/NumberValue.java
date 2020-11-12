package by.learning.task1.entity;

import java.util.Scanner;

public class NumberValue {

    private int a;

    public NumberValue(int a) {
        this.a = a;
    }

    public NumberValue() {
    }

    public int getA() {
        return a;
    }

    public void writeFromConsole() {
        while (true) {
            System.out.println("Input number: ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()){
                setA(scanner.nextInt());
                break;
            } else {
                System.out.println("Incorrect input. Try again.");
            }
        }
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "NumberValue{" +
                "a=" + a +
                '}';
    }
}
