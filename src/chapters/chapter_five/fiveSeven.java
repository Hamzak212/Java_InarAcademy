//Suppose that the tuition for a university is $10,000 this year and increases 5% every year. In one year, the tuition
//will be $10,500. Write a program that computes the tuition in ten years and the
//total cost of four years’ worth of tuition after the tenth year
public class fiveSeven {
    public static void main(String[] args) {
        int tuition = 10000;
        int total_cost = 0;


        for (int year = 1; year < 15; year++) {
            tuition += tuition * 0.05;

            if(year == 10){
                System.out.println("Your Tuition is " + tuition + "$ in " + year + " years!");
            }

            if(year > 10 && year < 15){
                total_cost = tuition + total_cost;
            }

        }
            System.out.println("Your Tuition After 10 Years(4 Years): " + total_cost);

    }
}

