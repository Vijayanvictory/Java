class ShiftOP{
	void UserDisp(){
		int a = 2;
		System.out.println(a>>2);
		System.out.println(a<<1);
		System.out.println(a>>>4);
		}
		public static void main(String[] args){
			ShiftOP sh = new ShiftOP();
			sh.UserDisp();
}
}