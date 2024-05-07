
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Write a program to print months name using switch case
		
		
		
		2) write a program to print table of 42
		
		
		
		3) write a program to check grades of student based on marks(create marks object and check using if else)
		
		
		
		4) Write numbers from 1 to 20, if number is 10 skip the number. and if number is 15 break the loop
		
		
		
		5)Print capital and small alphabets */
			
			//question 1 check the month
	int month = 12; 
	        
	        switch (month) {
	            case 1:
	                System.out.println("January");
	                break;
	            case 2:
	                System.out.println("February");
	                break;
	            case 3:
	                System.out.println("March");
	                break;
	            case 4:
	                System.out.println("April");
	                break;
	            case 5:
	                System.out.println("May");
	                break;
	            case 6:
	                System.out.println("June");
	                break;
	            case 7:
	                System.out.println("July");
	                break;
	            case 8:
	                System.out.println("August");
	                break;
	            case 9:
	                System.out.println("September");
	                break;
	            case 10:
	                System.out.println("October");
	                break;
	            case 11:
	                System.out.println("November");
	                break;
	            case 12:
	                System.out.println("December");
	                break;
	            default:
	                System.out.println("Invalid month number");
	        }
	        
	        
	        
	        //question 2 table of 42
	        
	        
	   int num = 42;
	        
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	           
	        }
	        

	        //check the grade of students
	 int marks = 75;
	        
	        if (marks >= 90) {
	            System.out.println("Grade A");
	        } else if (marks >= 80) {
	            System.out.println("Grade B");
	        } else if (marks >= 70) {
	            System.out.println("Grade C");
	        } else if (marks >= 60) {
	            System.out.println("Grade D");
	        } else {
	            System.out.println("Grade F");
	        }
	        
	        
	        //print numbers 1 to 20and skip 5
	        for (int i = 1; i <= 20; i++) {
	            if (i == 10) {
	                continue; // Skip 10
	            }
	            System.out.println(i);
	            if (i == 15) {
	                break; // Break the loop at 15
	            }
	        }
	        
	        //print capital letter
	        System.out.println("Capital Alphabets:");
	        for (char ch = 'A'; ch <= 'Z'; ch++) {
	            System.out.print(ch + " ");
	        }
	        // print small letter
	        System.out.println("\n\nSmall Alphabets:");
	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            System.out.print(ch + " ");
		}
		}
	}


