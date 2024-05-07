import java.util.Scanner;

public class Lab6Loop  {


	public static  void  prime () {		
	       int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }
	

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("question 1");
		System.out.println(" print numbers 50 to 1 in reverse in a single line using for loop");
		   int i = 50;
	       
	        for(i = 50; i >=1; i--)
	        {
	        System.out.print(i + " ");
	        }
	        System.out.println("");
	        
	        System.out.println("question 2");
	        System.out.println(" print numbers 50 to 1 in reverse in a single line using while loop");
	        
	        int j=50;
	        
	        while(j>=1)
	        {
	        System.out.print(j+" ");
	        j--;
	        }
	  
	        System.out.println("");
	        System.out.println("question 3");
	        System.out.println(" print numbers 50 to 1 in reverse in a single line using do while loop");
	       int a=50;
	        	do {
	        	 System.out.print(a+" ");
	             a--;
	        }
	        	while (a>=1);
	        
	        	  System.out.println("");
	  	        System.out.println("question 4");
	  	        System.out.println(" print multiplication table of number taken by user using while loop");
	  	        Scanner sc= new Scanner (System.in);
	  	      System.out.println(" Enter number...");
	  	      int num=sc.nextInt();
	  	      int k=1;
	  	      while (k<=10) {
	  	    	 System.out.println(num+"*"+k+"="+num*k);
	  	    	 k++;
	  	      }
	  	    System.out.println("");
  	        System.out.println("question 5");
  	      Lab6Loop.prime();
  	     
	}

}


