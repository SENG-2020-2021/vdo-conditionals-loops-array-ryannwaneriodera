

class Main {
  public static void main(String[] args) {
// kindly use appropriate data types for your declaration
   
  
//declare an array variable and assign the days of the month debtor defaulted,
	byte []defaultedDays={1,2,3,4,5,6,7,8,9,10};
   
   
// declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
	float payPerDay=348f,amountPaid=1700f;
   
   
// declare all the variables needed for your calculations
	byte daysPaidFor=0; 
	float totaltToPay=0f;
	float mod;
	float extra;
	float leftToPay;
	byte amountOfDays=0;
	float temp=amountPaid;
   
   
// calculate and print total amount the debtor is to pay using for each loop
	for(byte x:defaultedDays){
		totaltToPay+=payPerDay;
		amountOfDays++;
	}
	System.out.println("the total amount to pay is:"+totaltToPay);
   

// calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
	for(int i=0;i<amountOfDays;i++){
		if(temp>=payPerDay){
			temp-=payPerDay;
			daysPaidFor++;
		}
		
		else if(temp<payPerDay){
			break;
		}
		
	}
	System.out.println("the amount of days paid for are "+daysPaidFor+"\n");

	for(int i=0;i<daysPaidFor; i++){
		System.out.println("day "+defaultedDays[i]+" was paid for");
	}

	mod=amountPaid%payPerDay;

	if(mod>0&&amountPaid<totaltToPay){
		System.out.println("day "+defaultedDays[daysPaidFor]+" was not completely paid for and you need to pay "+(payPerDay-mod)+" to complete it ");
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