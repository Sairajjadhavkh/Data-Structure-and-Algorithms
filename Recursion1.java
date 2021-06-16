

// simple recursion show function

class Recursion1{
	static int show(int a){
		if(a<1){
			return 0;
		}
		a--;
		System.out.println("hiiiiiiiiiiiiiiiii");
		return show(a);
		
	}
	public static void main(String args[])
	{
		show(5);
	}
}