package application;


import entities.ContractStack;
import entities.StackTad;

public class Program {

    public static void main(String[] args) {
        ContractStack<Integer> array = new StackTad<>();

        array.push(10);
        array.push(20);

        System.out.println(array.isEmpty());
        System.out.println("Top: " + array.top());
        System.out.println("Size: " + array.size());
        System.out.println("Last Element: " + array.pop());
        System.out.println("Top: " + array.top());
        System.out.println("Size: " + array.size());
    }
}
