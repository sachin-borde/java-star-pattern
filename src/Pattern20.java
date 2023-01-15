public class Pattern20{
	public static void main(String[] args){

		/*Way 1*/
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=6;k>=i;k--){
				if(k==6||i==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			for(int l=5;l>=i;l--){
				if(l==i||i==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		/*Way 2*/
		for(int i=6;i>=1;i--){
			for(int j=6;j>=i;j--){
				System.out.print(" ");
			}	
			for(int k=1;k<=i;k++){
				if(k==1||i==6){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			for(int l=2;l<=i;l++){
				if(l==i||i==6){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
	}
}