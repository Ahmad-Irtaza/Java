//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long currentPopulation;
        double growthRate;
        double estimatedPopulation;
        int years;
        System.out.print("Enter the current world population: ");
         currentPopulation = scanner.nextLong();


        System.out.print("Enter the annual population growth rate: ");
        growthRate = scanner.nextDouble() / 100.0;


        System.out.print("Enter the number of years: ");
         years = scanner.nextInt();


        for (int i = 1; i <= years; i++) {
            estimatedPopulation =  currentPopulation * Math.pow((1 + growthRate) , years);
            System.out.println("Estimated population after " + i + " years: " + estimatedPopulation);
        }

        scanner.close();
    }

}
