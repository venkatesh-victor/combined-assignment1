import java.util.Scanner;

public class AverarageWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalWeight = 0;

        for(int i = 0; i < 10; i++) {
            System.out.print("Enter the weight of person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            totalWeight += weight; 
        }

        System.out.println("The average weight of 10 people is " + totalWeight / 10);
    }
}
