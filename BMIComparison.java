import java.util.Scanner;

public class BMIComparison {

    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String remark;

    BMIComparison(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void calcBMI() {
        bmi = weight / (height * height);
    }

    public void setRemark() {
        if (bmi < 18.5) {
            remark = "Under Weight";
        }

        else if (bmi < 25) {
            remark = "Normal weight";
        }

        else if (bmi < 30) {
            remark = "Over weight";
        }

        else {
            remark = "Obese";
        }
    }

    public String getDetails() {
        return name + " | " + bmi + " | " + remark;
    }    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of person: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println();

        BMIComparison[] details = new BMIComparison[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter the name of the person " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter the height of the person " + (i + 1) + ": ");
            double height = sc.nextDouble();

            System.out.print("Enter the weight of the person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            sc.nextLine();

            details[i] = new BMIComparison(name, height, weight);

            details[i].calcBMI();
            details[i].setRemark();

            System.out.println();


        }

        sortByBMI(details);

        for(BMIComparison person : details) {
            System.out.println(person.getDetails());
        }
    }

    public static void sortByBMI(BMIComparison[] details) {
        int n = details.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (details[j].bmi > details[j + 1].bmi) {
                    BMIComparison temp = details[j];
                    details[j] = details[j + 1];
                    details[j + 1] = temp;
                }
            }
        }
    }
}
