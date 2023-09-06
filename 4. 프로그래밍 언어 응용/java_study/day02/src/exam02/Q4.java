package exam02;

public class Q4 {
    public static void main(String[] args) {

        for(int i = 2; i<= 9; i++){
            if(i % 2 == 1) {
                System.out.printf("-------%d단 -------%n", i);

                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d X %d = %d%n", i, j, i * j);
                }
            }
        }
    }
}
