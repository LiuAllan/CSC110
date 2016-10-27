import java.util.*;
public class BudgetCalculator {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("How many roomates do you have?");
		int a = console.nextInt();
		System.out.println("How much is your rent per month?");
		double b = console.nextDouble();
		System.out.println("How much is your car insurance per month?");
		double c = console.nextDouble();
		System.out.println("About how many kilometers do you drive in a day?");
		double d = console.nextDouble();
		System.out.println("What is your mileage on your car? \n -a very small car: 7.1 L/100km \n -a small car: 8.2 L/100km \n -a sports car: 14.9 L/100km \n -an SUV: 12.3 L/100km");
		double e = console.nextDouble();
		System.out.println("On average, how much is your electricity bill for 2 months?");
		double f = console.nextDouble();
		System.out.println("On average, how much is your cable for 1 month?");
		double g = console.nextDouble();
		System.out.println("What is your average water bill for 4 months?");
		double h = console.nextDouble();
		System.out.println("How much do you pay for internet for 1 month?");
		double i = console.nextDouble();
		System.out.println("How much do you spend on groceries in a week?");
		double j = console.nextDouble();
		System.out.println("How much do you spend on eating out in a week?");
		double k = console.nextDouble();
		System.out.println("How much do you spend on alcohol in a week?");
		double l = console.nextDouble();
		
		double test0 = 0.00;
		double test1 = 0.00;
		double test2 = 0.00;
		double test3 = 0.00;
		double testfinal = 0.00;
		
		double percentage0 = 0.00;
		double percentage1 = 0.00;
		double percentage2 = 0.00;
		double percentage3 = 0.00;
		/*determineTransportationCost(d, e, c);
		determineUtilityCost(f, h, g, i, a);
		determineFoodCost(j, k, l, a);
		determineHousingCost(b, a);
		*/
		test0 = determineTransportationCost(d, e, c);
		test1 = determineUtilityCost(f, h, g, i, a);
		test2 = determineFoodCost(j, k, l, a);
		test3 = determineHousingCost(b, a);
		
		testfinal = calculateTermBudget(test0, test1, test2, test3);
		percentage0 = (test0/testfinal) * 100;
		percentage1 = (test1/testfinal) * 100;
		percentage2 = (test2/testfinal) * 100;
		percentage3 = (test3/testfinal) * 100;
		
		printReport(testfinal, percentage0, percentage1, percentage2, percentage3);
		
		//calculateTermBudget(determineTransportationCost(d, e, c), determineUtilityCost(f, h, g, i, a, ), determineFoodCost(j, k, l, a), determineHousingCost(b, a)) ;
		//System.out.println( calculateTermBudget() );
	}//main
	
	public static double determineTransportationCost(double kms, double fuelEfficiency, double carIns) {
		double fuelCost = 0;
		fuelCost = (30*kms*fuelEfficiency*1.32);
		double TransCost = carIns + fuelCost;
		//System.out.println(TransCost);
		return TransCost;
	}//methodTransportation
	
	public static double determineUtilityCost(double electricity, double water, double cable, double internet, int occupancy) {
		double utilitysum = 0;
		utilitysum = (electricity/2) + (cable) + (water/4) + (internet);
		double UtilityCost = utilitysum/occupancy;
		//System.out.println(UtilityCost);
		return UtilityCost;
	}//methodUtility
	
	public static double determineFoodCost(double groceries, double restaurant, double liquor, int occupancy) {
		double foodsum = 0;
		foodsum = (groceries*4) + (restaurant*4) + (liquor*4);//I used 4 weeks in a month
		double FoodCost = foodsum/occupancy;
		//System.out.println(FoodCost);
		return FoodCost;
	}//methodFood
	
	public static double determineHousingCost(double rent, int occupancy) {
		double HouseCost = rent/occupancy;
		//System.out.println(HouseCost);
		return HouseCost;
	}//methodHousing
	
	public static double calculateTermBudget(double transportation, double utility, double food, double housing) {
		double Total = transportation + utility + food + housing;
		//System.out.println(Total);
		return Total;
		
	}//methodTerm
	
	public static void printReport(double All, double carp, double utilp, double foodp, double housep) {
		System.out.println("Your term budget is: " + String.format("%.2f", All));
		System.out.println("The break down is as follows: ");
		System.out.println("Car " + carp + "%");
		System.out.println("Utilities " + utilp + "%");
		System.out.println("Food " + foodp + "%");
		System.out.println("House " + housep + "%");
	}
}//class
