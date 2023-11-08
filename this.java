class ThisDemo{
		String name = "This is global variable";
		void userDemo(){
			String name = "local variable";
			System.out.println(name);
			System.out.println(this.name);
			}
		public static void main(String ags[]){
			ThisDemo dt = new ThisDemo();
			dt.userDemo();
		}
}