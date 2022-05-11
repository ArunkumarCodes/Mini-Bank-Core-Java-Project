
// The Account Class
public class Account {
	String customerName;
	String customerID;
	int balance;
	int previousTransaction=0;

	Account(String customerName, String customerID){
		this.customerName=customerName;
		this.customerID=customerID; 
	}

	// Adding Functionalities.


	// Deposit Method

	void deposit(int amount) {
		//checking if amount
		if(amount>0) {
			balance = balance+amount;  //updating new balance
			previousTransaction = amount;	// marking this for previous transation
			System.out.println("Amount Deposited successfully.");
			System.out.println("New Balance is:" + balance);

		}else {
			System.out.println("Please enter amount greater than 0 ");
		}

	}

	// Withdraw Method
	void withdraw(int amount) {
		if(amount<balance) {    //checking sample balance availability
			if(amount>0) {		//checking withdrawal amount to be greater than 0
				balance = balance-amount;	// updating new balance
				previousTransaction = -amount;		// updating (-) amount to signify withdrawal
				System.out.println("Withdrawal Successful.");
				System.out.println("New Balance is:" + balance);
			}else {
				System.out.println("please enter amount greater than 0");
			}
		}else {
			System.out.println("Insufficient Funds, Cannot Withdraw ");
		}
	}

	// The PreviousTransaction Method
	void getPreviousTransaction() {
		if(previousTransaction>0) {		// positive value = deposited
			System.out.println("Deposited:"+ previousTransaction);
		}else if (previousTransaction<0) {							// negative value = Withdrawal
			System.out.println("Withdrawn:"+ previousTransaction);
		}else {
			System.out.println("No Transaction occurred.");
		}
	}

	// The Calculate Interest Method
	void calculateInterest(int years) {
		double interestRate= .0185;		// keeping a constant rate
		double newBalance=(balance*interestRate *years)+balance; 		// year is receiced as a parameter
		System.out.println("The current interest rate is :" +(100 * interestRate)+"%");
		System.out.println("After"+years+ newBalance);
	}

	/*
	 * Account class is completed it will be resonsible for the main work of
	 * application.
	 */



}