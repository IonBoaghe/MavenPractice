package Home;

public class Task7 {
    public static void main(String[] args) {
        int num = 7;
        int test = 1000;
        // this condition will check if 1<1000 then the num veriable will improve his value with 7
        for (int i=1; i < test; i++){
            num += 7;

            // this condition will check if the value of num >100 then the system will break, because we need to display max number 98
            if (num >100){
                break;
            }
            System.out.print(num + " ");

        }
    }
}
