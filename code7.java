





/*
Q.7.
  Write a program to print the following pattern 

  D  D  D  D
  D  D  D  D
  D  D  D  D
  D  D  D  D

  */

class Demo{

	public static void main(String...R){

		char ch = 'D';

		for(int i = 1; i <= 4; i++){

			for(int j = 1; j <= 4; j++){

				System.out.print(ch+" ");
			
			}

			System.out.println();
                          
		}
	}
}

