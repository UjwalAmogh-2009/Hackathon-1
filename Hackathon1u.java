    import java.util.Scanner;

public class Hackathon1u{

    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int familyMembers;
        double waterConsumed;
        int houseNumber;
        char usageStatus;

        System.out.print("Enter number of family members: ");
        familyMembers = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        waterConsumed = sc.nextDouble();

        System.out.print("Enter house number: ");
        houseNumber = sc.nextInt();

        System.out.print("Enter water usage status(Good/Bad): ");
        usageStatus = sc.next().charAt(0);

        System.out.println("--- Household Details ---");
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + usageStatus);

        double bill;

        if (waterConsumed <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water Bill: Rs." + bill);

        // 1c) Method
        System.out.print("Enter morning water usage: ");
        int morningUsage = sc.nextInt();

        System.out.print("Enter evening water usage: ");
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total Water Consumption: " + total + " litres");

        sc.close();
    }
}