package Ui;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Service.LoanRequestService;
import Service.Validationn;

import bean.LoanRequestAccounts;

public class Client {

	

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		
		LoanRequestService service=new LoanRequestService();
		
			System.out.println("==============Wel-come====================");
	        boolean b1=true;
	        while(b1)
	        {
	        	
	        
			System.out.println("1. Generate Loan details ");
	        System.out.println("2. EXIT");
	        System.out.println("Enter your choice\n");
	       
	        String choice;
			choice=sc.nextLine();
				switch (choice) {
				case "1":
					
					System.out.println("Enter Account_id ");
					String ac=sc.nextLine();
					
					
					LoanRequestAccounts loanrequestaccount=service.getLoanRequestAccounts(ac);
					if(loanrequestaccount!=null)
					{
						System.out.println("=============Loan Amount=================\n"+loanrequestaccount.getAmount());
						System.out.println("===============Loan Tenure===============\n"+loanrequestaccount.getTenure());
						System.out.println("===============Credit Score==============\n"+loanrequestaccount.getCredit_score());
						System.out.println("=============Loan Rate of Intrest========\n"+loanrequestaccount.getRoi());
						System.out.println("=============Loan Type===================\n"+loanrequestaccount.getLoan_type());
						System.out.println("=============Loan Status=================\n"+loanrequestaccount.getLoan_status());
						System.out.println("Loan Request  data Matches with the bank");
						
						 if(loanrequestaccount.getCredit_score()>=670)
						{
							System.out.println("*********************Congratulations****************************");
							System.out.println("====================Your Credit Score is good===================");
							System.out.println("********************Your Loan Request Accepted******************");
						}
						else {
								System.out.println("!!!!!!!!!!!!!!!!Oops!!!!!!!!!!!!!!!!!!!!!!");
								System.out.println(" Your Loan Request Rejected - Your credit Score is low");
							
							}
					}
					else
					{
						
						
						System.out.println("!!!!!!Account_id not Exist!!!!!!!!!!!");
						System.out.println("Loan Request data not Matches with the bank");
						System.out.println("Re-enter the choice");
						
					}
					while(true)
					{
					String account_id=bufferedreader.readLine();
					boolean b2 = Validationn.validatedata(account_id,Validationn.accountIdPattern);
					if(b2 == true)
					{
						try 
						{
							ac = (account_id);
							break;
						}
						catch(Exception e)
						{
							System.out.println("Enter Again!!!");
						}
					}
					else
					{
						System.out.println(" details Enter Again!!!");
						break;
					}
					}
					break;
				
					
					
				case "2":
					b1=false;
					break;
		
				case "3":
						
						System.out.println("!!!!!****************Thank You have a nice day**************!!!!!!!");
					   System.exit(2);
	                   break;
				
	            default:
	            	  System.out.println("Invalid choice");
		        }
	        }
	        

	    }
	}


