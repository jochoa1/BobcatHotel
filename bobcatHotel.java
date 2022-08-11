import java.util.Scanner;


public class bobcatHotel{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int yes = 1 , no = 1; 
        double roomCost = 0;
        double mealCost = 0;
        double memberDiscount = 0;
        double aaaDiscount = 0;

        System.out.println("ROOM OPTIONS");
        System.out.println("1. Single @ $50.50 per night");
		System.out.println("2. Double @ $75.00 per night");
		System.out.println("3. Queen @ 100.75 per night");
		System.out.println("4. King @ $150.25 per night");
		System.out.println("5. Master Suite @ $225.50 per night");

        System.out.println();

        System.out.println("Please enter the number of nights of your stay: ");
        int guests = input.nextInt();

        System.out.print("Please enter your choice of room (enter 1/2/3/4/5 corresponding to the options shown above): ");
		int room = input.nextInt();

        System.out.print("Please enter the number of nights: ");
		int nights = input.nextInt();

        System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)? ");
		int aaa = input.nextInt();

        System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		int member = input.nextInt();

        System.out.println("MEAL PACKAGES (PRICES ARE SHOWN PER NIGHT)");
        System.out.println("0. Complementary @ $0 per guest");
        System.out.println("1. Standard @  $30 per guest");
        System.out.println("2. Deluxe @ $50 per guest");

        System.out.println("CHECKOUT");
        System.out.println("Room Cost: ");
        System.out.println("Meal Cost: ");
        System.out.println("Preliminary Total Cost: ");
        System.out.println("AAA Discount: ");
        System.out.println("Club Member Discount: ");
        System.out.println("Total Cost of Booking: ");
    }
}