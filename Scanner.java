import java.util.Scanner;
	class ScanDemo{
		public static void main(String ags[]) throws Exception
		{
			Scanner s = new Scanner(System.in);
			System.out.print("enter the number:");
			String fsvalue = s.next();//nextLine();
			System.out.print("enter the values:");
			int secvalue = s.nextInt();
			System.out.print(fsvalue + secvalue);
		}
	}