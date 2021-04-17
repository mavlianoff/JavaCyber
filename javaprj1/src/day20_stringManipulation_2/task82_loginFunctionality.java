package day20_stringManipulation_2;

import java.util.Scanner;

public class task82_loginFunctionality {

	public static void main(String[] args) {
		/*
		•Login Functionality Logic
		•UserName,Password
		•---> Program will ask to enter username and password
		•---> If both username and password are blank
		•"UserNameand Password Fields cannot be empty"
		•---> If userNameis blank and password is not blank
		•"UserNamecannot be empty"
		•---> If userNameis not blank and password is blank
		•"Password cannot be empty"
		•---> If the username or password is not valid
		•"UserNameor password is not valid. Please verify"
		•---> If the username and password are both valid
		•"User Logged in successfully"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your Username: ");
		String UserName = scan.nextLine();
		System.out.print("Please enter your Password: ");
		String PassWord = scan.nextLine();
		
		String username="Sanzharbek";
		String password="Mavlianov";
		
		if(UserName.equals(username) && PassWord.equals(password)) {
			System.out.println("User logged in successfully");
			return;
		}else {
			if(UserName.equals("") && PassWord.equals("")) {
				System.out.println("Username and Password Fields cannot be empty");
			}else if(UserName.equals("") && !PassWord.equals("")) {
				System.out.println("Username cannot be empty");
			}else if(!UserName.equals("") && PassWord.equals("")) {
				System.out.println("Password cannot be empty");
			}else if(!UserName.equals(username) || !PassWord.equals(password)) {
				System.out.println("Username or Password is not valid. Please verify!");
			}
		}
		
		
		

	}

}
