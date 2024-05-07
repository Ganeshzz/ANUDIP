
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//pattern
		//increasing pattern 
		for (int i=1;i<=3;i++) {                      // for rows print 
			for (int j=1;j<=i;j++) {                 // for colomn print 
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		//decreasing pattern 
		for (int i=1;i<=4;i++) {                      // for rows print 
			for (int j=4;j>=i;j--) {                 // for colomn print 
				System.out.print("*"+" ");
			}
			System.out.println();	
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		for (int i=1;i<=4;i++) {                      // for rows print 
			for (int j=1;j<=i;j++) {                 // for colomn print 
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		//box pattern 
		/*for (int i=1;i<=4;i++) {
			for (int j=1;j<=4;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}*/
		
		//decreasing pattern 
		System.out.println("-------------------------------------------------------------------------------------------");
		int rows=4, a, b;  
		for (a = rows; a >= 1; a--)   
		{  
		for (b =a; b >= 1; b--)  
		{  
		System.out.print(b+" ");  
		}  
		System.out.println();	//increasing number 
		
	}
		
		
		
		System.out.println("-------------------------------------------------------------------------------------------");
		int i, j, k = 1;  
		for (i = 1; i <=4 ; i++)   
		{  
		for (j = 1; j< i + 1; j++)   
		{  
		System.out.print(k++ + " ");  
		}  
	
		System.out.println();  
		} 
	}
}
