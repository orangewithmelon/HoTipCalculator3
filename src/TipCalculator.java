import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        System.out.print("What are the costs for items you ordered? If you are done, type -1: ");
        double costs = scan.nextDouble();
        double total = 0.0;

        while (costs != -1) {
            total += costs;
            System.out.print("What are the costs for items you ordered? If you are done, type -1: ");
            costs = scan.nextDouble();
        }

        System.out.print("What is the tip percentage? (0-100): ");
        int tip = scan.nextInt();
        double aIT = total * (tip/100.0);
        double perPerson = aIT/numPeople;
        perPerson = (int)((perPerson + 0.5) * 100)/100.0;
        double costPPBT = total/numPeople;


        System.out.println("---------------------------------------------------------------");
        System.out.println("Total bill before tip: " + (total) + "$");
        System.out.println("Total percentage: " + tip + "$");
        System.out.println("Total tip: " + aIT + "$");
        System.out.println("Total bill with tip: " + (aIT + total) + "$");
        System.out.println("Per person cost before tip: " + costPPBT + "$");
        System.out.println("Each person has to tip " + (perPerson) + "$.");
        System.out.println("Total cost per person: " + (perPerson + costPPBT) + "$");
    }
}
