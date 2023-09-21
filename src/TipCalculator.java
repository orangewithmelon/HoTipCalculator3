import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many people are eating? ");
        int numPeople = scan.nextInt();
        System.out.print("What are the costs for items you ordered? If you are done, type -1: ");
        double costs = scan.nextDouble();
        double total = 0.0;

        while (costs != -1) {
            total += costs;
            System.out.print("What are the costs for items you ordered? If you are done, type -1: ");
            costs = scan.nextDouble();
        }

        System.out.print("How much percent do you want to tip? ");
        int tip = scan.nextInt();
        double aIT = total * (tip/100.0);
        double perPerson = aIT/numPeople;
        perPerson = Math.round(perPerson * 100)/100;

        System.out.println("Total bill ");
        System.out.print("Each person has to tip " + (perPerson) + "$.");
    }
}
