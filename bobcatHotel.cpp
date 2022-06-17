#include <iostream>
using namespace std;

int main (){
 
    int yes = 1, no = 0;
    double roomCost = 0;
    double mealCost = 0;
    double memberDiscount = 0;
    double aaaDiscount = 0;

    cout << "ROOM OPTIONS:" << endl;
    cout << "1. Single @ $50.50 per night" << endl;
    cout << "2. Double @ $75.00 per night" << endl;
    cout << "3. Queen @ 100.75 per night" << endl;
    cout << "4. King @ $150.25 per night" << endl;
    cout << "5. Master Suite @ $225.50 per night" << endl;

    cout << endl;

    cout << "Number of guests: " << endl;
    int guests;
    cin >> guests;

    cout << "Please enter your choice of room (enter 1/2/3/4/5 corresponding to the options shown above): " << endl;
    int room;
    cin >> room;

    cout << "Are you a club member? (enter 1 for yes, 0 for no) " << endl;

    cout << "Are you a AAA member? (enter 1 for yes, 0 for no) " << endl;

    cout << endl;

    cout << "Please select your desired meal package (enter 0/1/2/3 corresponding to the options showed above): " << endl;
    
    cout << "MEAL PACKAGES (PRICES ARE SHOWN PER NIGHT)" << endl;
    cout << "0. Complementary @ $0 per guest" << endl;
    cout << "1. Standard @  $30 per guest" << endl;
    cout << "2. Deluxe @ $50 per guest" << endl;
    cout << "3. Indulgence @ $85 per guest" << endl;

    cout << endl;

    cout << "CHECKOUT" << endl;
    cout << "Room Cost: " << endl;
    cout << "Meal Cost: " << endl;
    cout << "Total Cost of Booking: " << endl;


    return 0;
}