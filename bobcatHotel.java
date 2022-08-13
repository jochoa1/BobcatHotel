import java.util.Scanner;

public class bobcatHotel{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int yes = 1 , no = 1; 
        double mealCost = 0;
        double roomCost = 0;
        double memberDiscount = 0;
        double aaaDiscount = 0;

        System.out.println("ROOM OPTIONS");
        System.out.println("1. Single @ $50.50 per night");
		System.out.println("2. Double @ $75.00 per night");
		System.out.println("3. Queen @ 100.75 per night");
		System.out.println("4. King @ $150.25 per night");
		System.out.println("5. Master Suite @ $225.50 per night");

        System.out.println();

        System.out.print("Number of guests: ");
        int guests = input.nextInt();

        System.out.print("Please enter your choice of room (enter 1/2/3/4/5 corresponding to the options shown above): ");
		int roomOpt = input.nextInt();

        System.out.print("Please enter the number of nights: ");
		int nights = input.nextInt();
        double room1 = 50.50, room2 = 75.00, room3 = 100.75, room4 = 150.25, room5 = 225.50;
        if(roomOpt == 1){
            roomCost = room1 * nights;
        } else if(roomOpt == 2){
            roomCost = room2  * nights;
        } else if(roomOpt == 3){
            roomCost = room3 * nights;
        } else if(roomOpt == 4){
            roomCost = room4 * nights;
        } else if(roomOpt == 5){
            roomCost = room5 * nights;
        }

        System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)? ");
		int aaa = input.nextInt();
        if (aaa == 1){
            aaaDiscount = ((roomCost + mealCost)*0.1);
        } else if (aaa == 0){
            aaaDiscount = 0;
        }
        
        //System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		//int member = input.nextInt();

        System.out.println("MEAL PACKAGES (PRICES ARE SHOWN PER NIGHT)");
        switch(roomOpt){
        case 1:
            System.out.println("0. Complementary @ $0 per guest");
            System.out.println("1. Standard @  $30 per guest");
            System.out.println("2. Deluxe @ $50 per guest");
            break;
        case 2:
            System.out.println("0. Complementary @ $0 per guest");
            System.out.println("1. Standard @  $30 per guest");
            System.out.println("2. Deluxe @ $50 per guest");
            break;
        case 3:
            System.out.println("0. Complementary @ $0 per guest");
            System.out.println("1. Standard @  $30 per guest");
            System.out.println("2. Deluxe @ $50 per guest");
            break;
        case 4:
            System.out.println("0. Complementary @ $0 per guest");
            System.out.println("1. Standard @  $30 per guest");
            System.out.println("2. Deluxe @ $50 per guest");
            break;
        case 5:
            System.out.println("0. Complementary @ $0 per guest");
            System.out.println("1. Standard @  $30 per guest");
            System.out.println("2. Deluxe @ $50 per guest");
            System.out.println("3. Indulgence @ $85 per guest");
            break;
        }

        System.out.println();

        switch(roomOpt){
        case 1:
			System.out.print("Please select you desired meal package (enter 0/1/2 corresponding to the options showed above): ");
			break;
		case 2:
			System.out.print("Please select you desired meal package (enter 0/1/2 corresponding to the options showed above): ");
			break;
		case 3:
			System.out.print("Please select you desired meal package (enter 0/1/2 corresponding to the options showed above): ");
			break;
		case 4:
			System.out.print("Please select you desired meal package (enter 0/1/2 corresponding to the options showed above): ");
			break;
		case 5:
			System.out.print("Please select you desired meal package (enter 0/1/2/3 corresponding to the options showed above): ");
			break;
        }

        int mealOpt = input.nextInt();
        double meal1 = 0, meal2 = 30, meal3 = 50, meal4 = 85;
        if (mealOpt == 1){
            mealCost = meal1 * nights * guests;
        } else if (mealOpt == 2){
            mealCost = meal2 * nights * guests;
        } else if (mealOpt == 3){
            mealCost = meal3 * nights * guests;
        } else if (mealOpt == 4){
            mealCost = meal4 * nights * guests;
        }
        
        System.out.println();

        System.out.println("CHECKOUT");
        System.out.println("Room Cost: ");
        System.out.println("Meal Cost: ");
        System.out.println("Preliminary Total Cost: ");
        System.out.println("AAA Discount: ");
        System.out.println("Club Member Discount: ");
        System.out.println("Total Cost of Booking: ");
    }
}