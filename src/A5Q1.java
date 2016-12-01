import java.util.Scanner;

/**
 * 
 */

/**
 * @author b.yang
 *
 */
public class A5Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int[]givenArray = {10,15,20,25,30,35,40};
		int index = 0;
		int userValue;
		
		
		for(int i = 0;i<givenArray.length;i++){
			System.out.println(givenArray[ i ]+"    ");
		}
		
		
		System.out.println("What value do you want to search ?");
		userValue = userInput.nextInt();
		
		
		for(int i = 0;i < givenArray.length;i ++){
			if(givenArray[i] ==userValue){
			}
		}
		
		
		if(index == -1){
			System.out.println("This is not in the array");
		}else{
			System.out.println(userValue + " is in the array");
		}
		
		userInput.close(); 
			
	}
	
}
