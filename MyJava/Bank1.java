import java.util.Scanner;

interface Account{
	public void openAccount(int acc_no);
	public void closeAccount(int acc_no);
	public void deposit();
	public void withdrawn(int acc_no);
	public void transfer(int fromAccNo, int toAccNo);
}

class Saving implements Account{
	private int[] accNo = new int[10];
	private double depositAmount;
	private double withdrawnAmount;
	private double transferAmount;
	private double[] totalAmount = new double[10];	
	
	public void openAccount(int acc_no){
		int flag=0;
		for(int i=0;i<accNo.length;i++){
			if(accNo[i]==0){
				accNo[i]=acc_no;
				System.out.println("New Account "+acc_no+" has opened now!!");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("Sorry!!! There is no space for new account try some other time");
		}	
	}
	
	public void closeAccount(int acc_no){
		int flag=0;
		for(int i=0;i<accNo.length;i++){
			if(accNo[i]==acc_no){
				accNo[i]=0;
				System.out.println("Account "+acc_no+" has been closed!!");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("Sorry!!! There is no account "+acc_no+" is present in our DB");			
		}	
	}
	
	public void deposit(){
		synchronized(this){
			Scanner sc = new Scanner(System.in);
			int flag=0,acc_no=0;
			System.out.println("Enter account number:");
			acc_no=sc.nextInt();
			for(int i=0;i<accNo.length;i++){
				if(accNo[i]==acc_no){
					System.out.println("Enter Amount to Deposit: ");
					depositAmount = sc.nextDouble();
					totalAmount[i] = totalAmount[i] + depositAmount;
					System.out.println("Deposited Amount = "+depositAmount+" and Total Amount = "+totalAmount[i]);
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("There is no account "+acc_no+ " exists");
			}
		}
	}

	public void withdrawn(int acc_no){
		synchronized(this){		
			Scanner sc = new Scanner(System.in);
			int flag=0;
			for(int i=0;i<accNo.length;i++){
				if(accNo[i]==acc_no){
					System.out.println("Enter Amount to Withdrawn: ");
					withdrawnAmount = sc.nextDouble();
					if(withdrawnAmount>totalAmount[i]){
						System.out.println("Failed!! Available balance = "+totalAmount[i]+" you cannot withdrawn more than balance available in your account.");
						flag=1;
						break;	
					}
					else{
						totalAmount[i]=totalAmount[i]-withdrawnAmount;
						System.out.println("Withdrawn Amount = "+withdrawnAmount+" has successfully completed. Remaining Balance = "+totalAmount[i]);
						flag=1;
						break; 				
					}						
				}
			}
			if(flag==0){
				System.out.println("There is no account "+acc_no+ " exists");
			}
		}		
	}
	
	public void transfer(int fromAccNo, int toAccNo){
		Scanner sc = new Scanner(System.in);
		int flagfrom=0,flagto=0;
		if(fromAccNo==toAccNo){
			System.out.println("You cannot transfer to your own account");
			return;
		}
		for(int i=0;i<accNo.length;i++){
			if(accNo[i]==fromAccNo){
				flagfrom=1;
			}
			if(accNo[i]==toAccNo){
				flagto=1;
			}
		}
		if(flagfrom==1 && flagto==1){
			for(int i=0;i<accNo.length;i++){
				if(accNo[i]==fromAccNo){
					System.out.println("Enter Amount to Transfer: ");
					transferAmount = sc.nextDouble();
					if(transferAmount>totalAmount[i]){
						System.out.println("Failed!! Available balance = "+totalAmount[i]+" you cannot transfer more than balance available in your account.");				
						transferAmount=0; 
						break;
					}
					else{
						totalAmount[i]=totalAmount[i]-transferAmount;
						System.out.println("Transfer Amount = "+transferAmount+" has successfully completed. Remaining Balance = "+totalAmount[i]);
						break; 			
					}	
				}
			}
			for(int i=0;i<accNo.length;i++){
				if(accNo[i]==toAccNo){
					totalAmount[i]=totalAmount[i]+transferAmount;
					System.out.println("Payment Received = "+transferAmount+" new balance = "+totalAmount[i]);
					break; 
				}
			}		
		}
		else{
			if(flagfrom==0){
				System.out.println("Source Account is not present in DB");
			}
			else if(flagto==0){
				System.out.println("Destination Account is not present in DB");	
			}
			else{
				System.out.println("Both Source and Destination Accounts are not present in DB");
			}
		}
	}
}

class Current implements Account{
	private int[] accNo = new int[10];
	private double depositAmount;
	private double withdrawnAmount;
	private double transferAmount;
	private double[] totalAmount = new double[10];
	
	public void openAccount(int acc_no){
		int flag=0;
		for(int i=0;i<accNo.length;i++){
			if(accNo[i]==0){
				accNo[i]=acc_no;
				System.out.println("New Account "+acc_no+" has opened now!!");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("Sorry!!! There is no space for new account try some other time");
		}	
	}

	public void closeAccount(int acc_no){
		int flag=0;
		for(int i=0;i<accNo.length;i++){
			if(accNo[i]==acc_no){
				accNo[i]=0;
				System.out.println("Account "+acc_no+" has been closed!!");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("Sorry!!! There is account "+acc_no+" is present in our DB");			
		}	
	}

	public void deposit(){
		synchronized(this){	
			Scanner sc = new Scanner(System.in);
			int flag=0,acc_no=0;
			System.out.println("Enter account number:");
			acc_no=sc.nextInt();
			for(int i=0;i<accNo.length;i++){
				if(accNo[i]==acc_no){
					System.out.println("Enter Amount to Deposit: ");
					depositAmount = sc.nextDouble();
					totalAmount[i] = totalAmount[i] + depositAmount;
					System.out.println("Deposited Amount = "+depositAmount+" and Total Amount = "+totalAmount[i]);
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("There is no account "+acc_no+ " exists");
			}
		}
	}
	
	public void withdrawn(int acc_no){
		synchronized(this){
			Scanner sc = new Scanner(System.in);
			int flag=0;
			for(int i=0;i<accNo.length;i++){
				if(accNo[i]==acc_no){
					System.out.println("Enter Amount to Withdrawn: ");
					withdrawnAmount = sc.nextDouble();
					if(withdrawnAmount>totalAmount[i]){
						System.out.println("Failed!! Available balance = "+totalAmount[i]+" you cannot withdrawn more than 							balance available in your account.");
						flag=1;
						break;	
					}
					else{
						totalAmount[i]=totalAmount[i]-withdrawnAmount;
						System.out.println("Withdrawn Amount = "+withdrawnAmount+" has successfully completed. Remaining 						Balance = "+totalAmount[i]);
						flag=1;
						break; 				
					}						
				}
			}
			if(flag==0){
				System.out.println("There is no account "+acc_no+ " exists");
			}
		}		
	}

	public void transfer(int fromAccNo, int toAccNo){
		Scanner sc = new Scanner(System.in);
		int flagfrom=0,flagto=0;
		if(fromAccNo==toAccNo){
			System.out.println("You cannot transfer to your own account");
			return;
		}
		for(int i=0;i<accNo.length;i++){
			if(accNo[i]==fromAccNo){
				flagfrom=1;
			}
			if(accNo[i]==toAccNo){
				flagto=1;
			}
		}
		if(flagfrom==1 && flagto==1){
			for(int i=0;i<accNo.length;i++){
				if(accNo[i]==fromAccNo){
					System.out.println("Enter Amount to Transfer: ");
					transferAmount = sc.nextDouble();
					if(transferAmount>totalAmount[i]){
						System.out.println("Failed!! Available balance = "+totalAmount[i]+" you cannot transfer more than balance available in your account.");				
						transferAmount=0; 
						break;
					}
					else{
						totalAmount[i]=totalAmount[i]-transferAmount;
						System.out.println("Transfer Amount = "+transferAmount+" has successfully completed. Remaining Balance = "+totalAmount[i]);
						break; 			
					}	
				}
			}
			for(int i=0;i<accNo.length;i++){
				if(accNo[i]==toAccNo){
					totalAmount[i]=totalAmount[i]+transferAmount;
					System.out.println("Payment Received = "+transferAmount+" new balance = "+totalAmount[i]);
					break; 
				}
			}		
		}
		else{
			if(flagfrom==0){
				System.out.println("Source Account is not present in DB");
			}
			else if(flagto==0){
				System.out.println("Destination Account is not present in DB");	
			}
			else{
				System.out.println("Both Source and Destination Accounts are not present in DB");
			}
		}
	}					
}

class Bank
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice=0;
		int account=0;
		int acc=0,acc2=0;
		Saving s = new Saving();
		Current c = new Current(); 
		do
		{
			System.out.println("-------------------------------------------------------");
			System.out.println("0. Exit");
			System.out.println("1. Savings Account");
			System.out.println("2. Current Account");
			System.out.println("Enter your choice: ");
			account = sc.nextInt();
			System.out.println("-------------------------------------------------------");
			switch(account)
			{
				case 0:System.exit(0);break;
				case 1:do
				{
					    System.out.println("-------------------------------------------------------");	
					    System.out.println("0.Exit");
					    System.out.println("1.For open new account");
					    System.out.println("2.For closing an account");
		                System.out.println("3.For deposit");
					    System.out.println("4.For Withdrawn");	
					    System.out.println("5.For transfer");
					    System.out.println("Enter your choice:");
					    choice = sc.nextInt();
					    System.out.println("-------------------------------------------------------");
					    if(choice==0)
						{
					    	break;
					    }
				            else if(choice==1)
							{
								System.out.println("Enter Account Number :");
								acc = sc.nextInt();
								s.openAccount(acc);
							}
				            else if(choice==2)
							{
								System.out.println("Enter Account Number :");
								acc = sc.nextInt();
								s.closeAccount(acc);
							}
					    else if(choice==3)
						{
							Thread t = new Thread(new Runnable()
							{
								public void run()
								{
									try
									{
										s.deposit();
									}
									catch(Exception e)
									{
										System.out.println("Exception found = "+e);
									}
								}
							});
							t.start();
							try
							{
								t.join();
							}
							catch(Exception e)
							{
								System.out.println("Exception found = "+e);
							}	
					    }
					    else if(choice==4)
						{
							Thread t = new Thread(new Runnable()
							{
					    		public void run()
								{
									int acc=0;
									try
									{
										System.out.println("Enter Account Number :");
										acc = sc.nextInt();
					    				s.withdrawn(acc);
									}		
									catch(Exception e)
									{
										System.out.println("Exception found = "+e);
									}
								}
							});
							t.start();
							try
							{
								t.join();	
							}
							catch(Exception e)
							{
								System.out.println("Execption found = "+e);
							}	
					    }
					    else if(choice==5)
						{
							System.out.println("Enter Source Account Number :");
							acc = sc.nextInt();
							System.out.println("Enter Destination Account Number :");
							acc2 = sc.nextInt();
					    	s.transfer(acc,acc2);
					    }
					    else
						{
					    	System.out.println("Enter Valid Input");
					    }		
				}while(choice!=0);
				 break;
				case 2:do
				{
					    System.out.println("-------------------------------------------------------");	
					    System.out.println("0.Exit");
					    System.out.println("1.For open new account");
					    System.out.println("2.For closing an account");
		                            System.out.println("3.For deposit");
					    System.out.println("4.For withdrawn");
					    System.out.println("5.For transfer");
					    System.out.println("Enter your choice:");
					    choice = sc.nextInt();
					    System.out.println("-------------------------------------------------------");
					    if(choice==0)
						{
					    	break;
					    }
				        else if(choice==1)
						{
							System.out.println("Enter Account Number :");
							acc = sc.nextInt();
					    	c.openAccount(acc);
					    }
				        else if(choice==2)
						{
							System.out.println("Enter Account Number :");
							acc = sc.nextInt();
					    	c.closeAccount(acc);
					    }
					    else if(choice==3)
						{
							Thread t = new Thread(new Runnable()
							{
								public void run()
								{
									try
									{
										c.deposit();
									}
									catch(Exception e)
									{
										System.out.println("Exception found = "+e);
									}
								}
							});
							t.start();
							try
							{
								t.join();
							}
							catch(Exception e)
							{
								System.out.println("Exception found = "+e);
							}
					    }
					    else if(choice==4)
						{
							Thread t = new Thread(new Runnable()
							{
								public void run()
								{
									try
									{
										int acc=0;	
										System.out.println("Enter Account Number :");
										acc = sc.nextInt();
										c.withdrawn(acc);
									}
									catch(Exception e)
									{
										System.out.println("Execption found = "+e);
									}
								}
							});		
							t.start();
							try
							{
								t.join();
							}
							catch(Exception e)
							{
								System.out.println("Execption found = "+e);
							}
					    }
					    else if(choice==5)
						{
							System.out.println("Enter Source Account Number :");
							acc = sc.nextInt();
							System.out.println("Enter Destination Account Number :");
							acc2 = sc.nextInt();
					    	c.transfer(acc,acc2);
					    }
					    else
						{
					    	System.out.println("Enter Valid Input");
					    }		
				}while(choice!=0);
				 break;
				default: System.out.println("Enter Valid Input");		
			}			
		}while(account!=0);			
	}
}
