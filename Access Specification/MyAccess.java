class AccessSpe{
	public static int x=5;
private static int y=7;
}
class MyAccess{
	public static void	main(String args[]){
		AccessSpe a=new AccessSpe();
		System.out.print("x=" +a.x);
		//System.out.print("y=" +a.y);
	}
}