



/*
Q.8.
  Write a program to print the following pattern

  d  d  d  d 
  c  c  c  c
  b  b  b  b 
  a  a  a  a
 
 */

class Demo{

	public static void main(String...M){

		
		for(char i ='d'; i >= 'a'; i--){

			for(int j = 1; j <= 4; j++){

				System.out.print(i+" ");

			}

			System.out.println();
		}
	}
}

