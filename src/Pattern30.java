public class Pattern30{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*Way 2*/
		for(int i=5;i>=1;i--){
			for(int j=5;j>=1;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}