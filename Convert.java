class Convert{

		//convertion char to string

		void ctos()
		{
		char c = 'A';
		String s = Character.toString(c);//String s = String.valueOf(c);
		System.out.println(s);

		}

		//convertion string to char

		void stoc(){
		String a = "hello";
		char b = a.charAt(2);
		System.out.println(b);
		}

		//find duplicate character in the string
		
		void dup()
		{
			String str = "now im hearing songs";
      			char[] duplicate = str.toCharArray();
     		        System.out.println("Duplicate character: ");

      		    	for (int i = 0; i < str.length(); i++) {
         	    	for (int j = i + 1; j < str.length(); j++) {
            	    	if (duplicate[i] == duplicate[j]) {

               				System.out.print(duplicate[j] + " ");
                			break;
            				}
				}
			}
		}
		
		public static void main(String[] ags){
		Convert cs = new Convert();
		cs.dup();		
		}

}
