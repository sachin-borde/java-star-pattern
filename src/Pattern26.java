public class Pattern26{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int k=5;k>=i;k--){
				System.out.print(" ");
			}
			for(int l=5;l>=i;l--){
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=6;i++){
			for(int j=6;j>=i;j--){
				System.out.print("*");
			}
			for(int k=2;k<=i;k++){
				System.out.print(" ");
			}
			for(int l=2;l<=i;l++){
				System.out.print(" ");
			}
			for(int m=6;m>=i;m--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*Way 2*/
		for(int i=6;i>=1;i--){
			for(int j=6;j>=i;j--){
				System.out.print("*");
			}
			for(int k=2;k<=i;k++){
				System.out.print(" ");
			}
			for(int l=2;l<=i;l++){
				System.out.print(" ");
			}
			for(int m=6;m>=i;m--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int k=5;k>=i;k--){
				System.out.print(" ");
			}
			for(int l=5;l>=i;l--){
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}