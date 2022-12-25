package P05FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVat = e -> e*1.2;
        Function<String,Double> convertor = e-> Double.parseDouble(e);
        Consumer<Double> printer = e-> System.out.printf("%.2f%n",e);

        List<Double>inputList = Arrays.stream(scanner.nextLine().split(", "))
                .map(convertor)
                .map(addVat)
                .collect(Collectors.toList());

        System.out.println("Prices with VAT:");
        inputList.forEach(printer);
    }
}
