class a{
	String name = "kmg";

		void userInfo(){
		System.out.println(name);
		}
	}
class b extends a{

		String name = "kgisl";

		void userInfo(){
		super.userInfo();
		System.out.println(name);
		}

		public static void main(String[] args){
			b sp = new b();
			sp.userInfo();
			
		}
	}