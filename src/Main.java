public class Main {
    public static void main(String[] args) {
        int d=0;

            for(int i = 100; i<1000;i++){
            if(i%5 == 0 && i%6 == 0){
                System.out.print(i + " ");
                d++;
                if(d%10 == 0){
                    System.out.println("\n");
                }
            }
        }
    }
}