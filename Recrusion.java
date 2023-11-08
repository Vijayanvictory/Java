class Rec{
		int count = 0;

	void msg(){
		      if(count < 5000){
			count++;
			msg();
			System.out.println("hello");
				}	
		}
		public static void main(String[] ags){
			Rec r = new Rec();
			r.msg();
			}
}
