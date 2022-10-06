//(Simulation: heads or tails) Write a program that simulates flipping a coin one
//million times and displays the number of heads and tails.
public class fiveFourty {
    public static void main(String[] args) {
        int head = 0; //1
        int tail = 0; //2
        for(int i = 1; i <= 1000000; i++){
            int random = (int) (Math.random()*2);
            if(random == 1){
                head += 1;
            }
            if(random == 0){
                tail += 1;
            }
        }
        System.out.println("Head: " + head + "\nTail: " + tail);
    }
}
