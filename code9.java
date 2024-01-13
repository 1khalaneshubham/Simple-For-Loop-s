





/*
 *
Q.9.
  Write a program to print the follwing pattern 

  C  B  A
  C  B  A
  C  B  A

  */

class Demo{

	public static void main(String...k){

		for(char i = 'C'; i >= 'A'; i--){

			for(int j = 1; j <= 3; j++){

				System.out.print(i+"    ");

			}
			System.out.println();
		}
	}
}


