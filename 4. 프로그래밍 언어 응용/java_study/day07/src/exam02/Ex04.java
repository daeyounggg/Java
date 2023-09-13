package exam02;

import java.util.function.BinaryOperator;

public class Ex04 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

    }
}
