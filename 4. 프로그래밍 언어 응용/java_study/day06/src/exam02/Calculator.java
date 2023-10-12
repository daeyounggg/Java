package exam02;

public interface Calculator {
    int num = 10; // public static final -> 정적 상수
    int add(int num1, int num2); // 앞에 public abstract만 자동 추가
}