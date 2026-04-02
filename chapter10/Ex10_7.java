import java.util.Scanner;
public class Ex10_7{
    public static void main(String[] args){
        Account[] accounts = new Account[10];
        
        for(int i = 0; i < accounts.length; i++){
            accounts[i] = new Account(i, 100);
        } 

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Please enter User ID: ");
            int userID = input.nextInt();
            //Correct User ID
            while (!( userID >= 0 && userID < 10)){
                System.out.println("INCORRECT USER ID! Please enter valid user ID:");
                userID = input.nextInt();
            }
            boolean b = true;
            while(b){
                displayMainMenu();
                int userInput = input.nextInt();
                //Correct user input in Main Menu
                while (!( userInput > 0 && userInput < 5)){
                    System.out.println("INCORRECT INPUT!");
                    displayMainMenu();
                    userInput = input.nextInt();
                }
                //For check balance
                if (userInput == 1){
                    System.out.printf("The balance for UserID %d is $%.2f \n\n", userID, accounts[userID].getBalance());
                }
                //For withdraw
                if (userInput == 2){
                    System.out.println("Enter an amount to withdraw: ");
                    int wamount = input.nextInt();
                    if (wamount < 0)
                        System.out.println("Invalid Input!");
                    else if (accounts[userID].getBalance() < wamount)
                        System.out.println("INSUFFICIENT FUNDS!");
                    else
                        accounts[userID].setBalance(accounts[userID].getBalance() - wamount);

                    System.out.println("");
                }
                //for deposit
                if(userInput == 3){
                    System.out.println("Enter an amount to deposit: ");
                    int damount = input.nextInt();
                    if (damount < 0)
                        System.out.println("Invalid Input!");
                    else
                        accounts[userID].setBalance(accounts[userID].getBalance() + damount);

                    System.out.println("");
                }
                //for exit
                if(userInput == 4){
                    b = false;
                }
            }
        }
    }
    
    //Method for displaying the Main Menu
    public static void displayMainMenu(){
        System.out.println("Main Menu \n1: Check Balance \n2: withdraw \n3: deposit \n4: exit \nEnter a choice: ");
    }
}