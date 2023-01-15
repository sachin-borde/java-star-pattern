public class Pattern15{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				if(j==1||j==i||i==6){
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
				if(j==6||j==i||i==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}