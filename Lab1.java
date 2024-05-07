
public class Lab1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) Write a program to print "Hello I am at Anudip Foundation".

			2) Write a program to demonstrate each data types.

			3)  Write a program to add , subtract , divide , multiply two numbers
			
			4) Print 1 to 10 numbers

			5) Print 5 names using array*/


// first program
		System.out.println("Hello I am at Anudip Foundation");
		
		
		
	    // types of permeative data type
		//integer type
				byte b= 127;
				short s =12345;
				int i =123456879;
				long l = 1234567891035612522l;
				System.out.println(b);
					System.out.println(s);	
					System.out.println(i);
					System.out.println(l);
				
				//character type 
				char ch = 'g';
				System.out.println(ch);
				 //floating type
				float f= 12345.456126f;
				double d= 12310546252263.63;
				System.out.println(f);
				System.out.println(d);
				
				//boolean type 
			boolean g = true ;
				
			System.out.println(g);
			//string type 
			String g1= "ganesh";
			System.out.println(g1);
			
			
			
			
			//Arithmetic operation
			System.out.println(2+2);
			System.out.println(4-1);
			System.out.println(4*5);
			System.out.println(55/11);
			
			
			
			//print10numbers
			for(i=1;i<11;i++) {
			System.out.println(i);
			}
			
			
			
			//array type 
			String[] gg = { "rahul", "ajay" , "vijay","anup","ganesh"};
			for (String i1 : gg) {
			System.out.println(i1);
		
			}
	}
}
