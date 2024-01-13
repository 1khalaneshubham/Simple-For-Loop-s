




/*
Q.2
Write a program to print the following pattern 

 4  5  6  7
 4  5  6  7
 4  5  6  7
 4  5  6  7

 USE THE FOR LOOP STRICTLY 

  for(int i = 1; i <= 4; i++){
	  for(j = 1; j <= 4; j++){

	  }
  }
*/
  
class Demo{

	public static void main(String[] args){

		for(int i = 1; i <= 4; i++){

			int x = 4;
                       
			for(int j = 1; j <= 4; j++){
	
				System.out.print(x+"   ");
				x = x + 1;
			}

			System.out.println();
		}
	}
}















