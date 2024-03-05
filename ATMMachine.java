package com.machine;

import java.util.*;

public class ATMMachine 
{
	public static void main(String[] args)
	{
		int balance = 20000,withdraw,deposit,num;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Welcome to ATM");
			System.out.println("1.Withdraw");
			System.out.println("2.Desposit");
			System.out.println("3.Check Balance");
			System.out.println("4.EXIT");
			num=sc.nextInt();
			switch(num)
			{
				case 1:
				{
					System.out.println("enter amount to be withdrawn..");
					withdraw = sc.nextInt();
					if(balance>=withdraw)
					{
						balance = balance - withdraw;
						System.out.println("your acount balanced amount is : "+balance);
						System.out.println("please collect the money...");
						
					}
					else
					{
						System.out.println("you dont have enough money to withdraw..");
					}
					break;
				}
				
				case 2:
				{
					System.out.println("enter amount to deposit..");
					deposit = sc.nextInt();
					balance = balance + deposit;
					System.out.println("balance amount is "+balance );
					System.out.println("money has been deposited successfully....");
					System.out.println(" ");
					break;
				}
				
				case 3:
				{
					System.out.println("balance of your account is "+balance);
					System.out.println(" ");
					break;
				}
				
				case 4:
				{
					System.exit(0);
					System.out.println(" ");
				}
			}
			
			
		}
		
	}
}
