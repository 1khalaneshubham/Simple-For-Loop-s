





/*
Q.6.
 Write a program to print the follwing pattern

 9  8  7
 9  8  7
 9  8  7
 */

class Demo{
	public static void main(String...s){

		for(int i = 1; i <= 3; i++){	
			
			int x = 9;

			for(int j = 1; j <= 3; j++){
                   
				System.out.print(x+"  ");
				x--;
			}

			System.out.println();
		}
	}
}


