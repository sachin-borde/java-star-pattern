public class Pattern34{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==1||i==4||j==1||j==4){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=2;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==1||i==4||j==1||j==4){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		
		/*Way 2*/
		for(int i=4;i>=1;i--){
			for(int j=4;j>=1;j--){
				if(i==1||i==4||j==1||j==4){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=3;i>=1;i--){
			for(int j=4;j>=1;j--){
				if(i==1||i==4||j==1||j==4){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}