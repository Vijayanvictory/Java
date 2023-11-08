interface a{
	int a = 100;
	void userInfo();
	void userDemo();
	void userDisp();
	void userRun();
}

interface b{
	int b = 100;
	void userInfo();
}

class Inherit implements a,b{

	public void userInfo(){
		String c = "hello";
		System.out.println(a+b+c);
		}
	public void userDemo(){};
	public void userDisp(){};
	public void userRun(){};
	
	public static void main(String args[]){
		Inherit i = new Inherit();
		i.userInfo();	
	}
}