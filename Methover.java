class Methover{
	void userAdd(){
		int a = 10;
		int b = 10;
		System.out.println(a+b);
		//return 0;
	}
	void userAdd(int c){
		userAdd();
		String name ="vijayan";
		System.out.println(name);
	}
	public static void main(String ags[]){
		Methover mt = new Methover();
		mt.userAdd(10);
			}
}