import java.util.Scanner;

public class BMIComparison {
    public static void main(String[] args) {
        
        System.out.println("Enter the details of the person 1.");
        double person1BMI = getBMI();

        System.out.println("Enter the details of person 2.");
        double person2BMI = getBMI();

        // We can use an array and get detail of as many persons as we want.

        System.out.println("Person 1 BMI: " + person1BMI);
        System.out.println("Person 2 BMI: " + person2BMI);

        if(person1BMI < person2BMI) {
            System.out.println("Person 1 has less bmi compared to person 2");
        }

        else {
            System.out.println("Person 2 has less BMI compared to person 1.");
        }

    }

    public static double getBMI() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight of the person: ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter the height of the person: ");
        double height = sc.nextDouble();

        return weight / (height * height);
    }
    
}
