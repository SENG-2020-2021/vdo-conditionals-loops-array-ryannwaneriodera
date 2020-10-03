
class Main {
  public static void main(String[] args) {
// kindly use appropriate data types for your declaration
   
  
//declare an array variable and assign the days of the month debtor defaulted,
	byte []defaultedDays={1,2,3,4,5};
   
   
// declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
	float payPerDay=348f,amountPaid=2000f;
   
   
// declare all the variables needed for your calculations
	byte daysPaidFor; 
	float totaltToPay=0f;
	float mod;
	float extra;
	float leftToPay;
   
   
// calculate and print total amount the debtor is to pay using for each loop
	for(byte x:defaultedDays){
		totaltToPay+=payPerDay;
	}
	System.out.println("the total amount to pay is:"+totaltToPay);
   

// calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
	daysPaidFor=(byte)(amountPaid/payPerDay);
	System.out.println("the amount of days paid for are "+daysPaidFor+"\n");

	for(int i=0;i<daysPaidFor; i++){
		System.out.println("day "+defaultedDays[i]+" was paid for");
	}

	mod=amountPaid%payPerDay;

	if(mod>0&&mod<payPerDay&&amountPaid<totaltToPay){
		System.out.println("day "+defaultedDays[daysPaidFor]+" was not completely paid for beacuse only "+mod+" was paid  instead of "+payPerDay);
	}

	else if(mod>0&&mod<payPerDay&&amountPaid>totaltToPay){
		
	}


// calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
	if(amountPaid<totaltToPay){
		leftToPay=totaltToPay-amountPaid;
		System.out.println("the amount left to pay is:"+leftToPay);
	}

	else if(amountPaid==totaltToPay){
		System.out.println("you have paid exactly the amount that is needed");
	}

	else {
		extra=amountPaid-totaltToPay;
		System.out.println("the amount that you have extra is:"+extra);
	}


  }
}
