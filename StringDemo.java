class StringDemo{

	void demo(){
		String name =new String ("KGM");
		String n1 = new String ("KGm");
		System.out.println(name==n1);
	}

	void demp(){
		String name = "Hi there!.";

		//sub string methods

		String str = name.substring(0,10);
		System.out.println(str);

		System.out.println(name.substring(2,9));

		System.out.println(name.indexOf("Hi"));				
		System.out.println(name.toUpperCase());

		System.out.println(name.toLowerCase());

		int a = 10;

		System.out.println(String.valueOf(a)+10);

		System.out.println(name.length());
		
		String add = "Developer";
		
		System.out.println(add.endsWith("r"));
		System.out.println(add.startsWith("D"));
		
		//Integer x = 100;
		//System.out.println(x.toString());
		System.out.println(Integer.toString(12));

	}

				//String buffer
	void buff(){
				//append
			StringBuffer sbf = new StringBuffer("this is vijayan");
			sbf.append(".");
			System.out.println(sbf);
			
				//insert
			StringBuffer str2 =  new StringBuffer("geeks for geeks"); 
      			System.out.println("string = " + str2); 
  
        		//insert boolean value at offset 8 
       			str2.insert(10, " true ");   //str2.insert(10, true ); 
  
        		// prints stringbuffer after insertion 
        		System.out.println(str2);

			//Delete
			StringBuffer str3 = new StringBuffer("java programming language");
			str3.delete(5,16);
			System.out.println(str3);
			
			//replace
			StringBuffer str4 = new StringBuffer("you are so made");
			str4.replace(12,16,"beautiful");
			System.out.println(str4);
			

			//reverse
			StringBuffer str5 = new StringBuffer("you are so made");
			str5.reverse();
			System.out.println(str5);

			//length
			StringBuffer str6 = new StringBuffer("you are so made");
			System.out.println(str6.length());

			//subString
			StringBuffer str7 = new StringBuffer("java programming");
			System.out.println(str7.substring(5));

			//charAt
			StringBuffer str8 = new StringBuffer("Java programming");
			System.out.println(str8.charAt(0));
			
			}

	void build(){	//stringbuilder

			StringBuilder buil= new StringBuilder("this is the first string builder programming");
			buil.append(true);
			//buil.append(" i need");
			System.out.println(buil);

			//insert
			buil.insert(10,"ahhahaha");
			System.out.println(buil);

			//delete
			buil.delete(10,18);
			System.out.println(buil);

			//replace
			buil.replace(11,12,"advanced ");
			System.out.println(buil);

			//reverse
			buil.reverse();
			System.out.println(buil);

			//length
			System.out.println(buil.length());

			//Substring
			System.out.println(buil.substring(10));

			//charAt
			System.out.println(buil.charAt(0));
			}

			

	public static void main(String[] ags){
		StringDemo de = new StringDemo();
		de.buff();
}

}

