package exam01;

public class Ex15 {
    public static void main(String[] args) {
        int total = 0;
        for(int num = 1; num <= 100; num++){
            total += num;
            /*
            if(num == 50){
                break;
            }
            */
        }
        System.out.println(total);
    }
}
