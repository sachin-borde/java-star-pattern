public class Pattern14{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=6;k>=i;k--){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=6;i++){
			for(int j=6;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
