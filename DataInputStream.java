import java.io.DataInputStream;
	class DataStream
		{
			public static void main(String ags[]) throws Exception
				{
				DataInputStream ds = new DataInputStream(System.in);
				System.out.print("enter the value:");
				int a = Integer.parseInt(ds.readLine());
				System.out.print("enter the number:");
				int b = Integer.parseInt(ds.readLine());
				System.out.print("sum");
				System.out.print(a+b);
		}
	}
