import java.util.Scanner;
	class ReturnType{
			
			Scanner s = new Scanner(System.in);			

		int add(){
			int a = s.nextInt();
			int b = s.nextInt();
			int c = a+b;
			System.out.println(c);
			return c;			
			}

		int sub(){
			int x = add();
			int a = s.nextInt();
			int v = x-a;
			System.out.println(v);	
			return v;		
			}
		int mul(){
			int y = sub();
			int a = s.nextInt();
			int z = a*y;
			System.out.println(z);
			return z;
			}
		int div(){
			int z = mul();
			int a = s.nextInt();
			int l = z/a;
			System.out.println(l);
			return l;
			}
		void mod(){
			int t = div();
			int a = s.nextInt();
			int u = a%t;
			System.out.println(u);
			}

			public static void main(String[] ags){
				ReturnType r = new ReturnType();
				//r.add();
				//r.sub();
				//r.mul();
				//r.div();
				r.mod();
				}
	}
