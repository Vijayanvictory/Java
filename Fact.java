import java.util.Scanner;
class FactDemo{
		int fact(int a){
			if(a==1){
				return 1;
				}
			else{
				return(a*fact(a-1));
				}
		}
		
		void scr(){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println(fact(n));
			}
		public static void main(String[] ags){
			FactDemo r = new FactDemo();
			r.scr();
			}
}