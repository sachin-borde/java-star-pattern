public class Pattern12{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
	        System.out.println();	
		}
		
		/*Way 2*/
		for(int i=6;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--){
			for(int j=6;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}