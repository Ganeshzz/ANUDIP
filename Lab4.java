
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*1.  Convert all the integer type data(byte,short,int,long) to floating point(float,double) type data and vice versa.
		
		2. Convert the character type data into int , float and tell the difference in both.
		
		3. Print alphabets Uppercase and lowercase using loops and casting*/
		System.out.println("-----------QUESTION 1---------------------------------");
		int i = 123456789;
		float f= i;
		double d = i;
		System.out.println(f);
		System.out.println(d);
		
		byte b = 123;
		float f1= b;
		double d1 = b;
		System.out.println(f1);
		System.out.println(d1);
		
		short s= 12345;
		float f2= s;
		double d2 = s;
		System.out.println(f2);
		System.out.println(d2);
		
		long l=1234567556264555l;
		float f3= l;
		double d3 = l;
		System.out.println(f3);
		System.out.println(d3);
		
			
		
		System.out.println("-----------QUESTION 2---------------------------------");
		char ch ='E';
		int c = ch;
		float F=ch;
		System.out.println(c);
		System.out.println(F);
		System.out.println("integare dont take value after decimal");
		
		
		System.out.println("-----------QUESTION 3---------------------------------");
		System.out.println("Capital alphabet:");
		char g;
		for ( g='A';g<='Z';g++) {
			System.out.print(g);
		}
		System.out.println();
		int x=(int)g;
		for ( x='A';x<='Z';x++) {
			System.out.print(x);

		}
		
		System.out.println();
		System.out.println("Small alphabet:");
		for ( g='a';g<='z';g++) {
			System.out.print(g);
		}
		System.out.println();
		int y=(int)g;
		for ( y='a';y<='z';y++) {
			System.out.print(y);

		}

	}

}
