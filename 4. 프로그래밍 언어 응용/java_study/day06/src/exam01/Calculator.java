package exam01;

public abstract class Calculator {

    int num = 10;

    public abstract int add(int num1, int num2);
    public abstract int minus(int num1, int num2);


     void commonMethod(){
        System.out.println("공통 메서드");
    }

}
