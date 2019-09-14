class AccessSpe1{
	public static int x=5;
private static int y=7;
public int preturn(int r, boolean a){
	if(r>=1000 && a==true){
		return y;
}
else {
	return 0;
}
}
}
class MyAccess1{
	public static void	main(String args[]){
		AccessSpe1 a=new AccessSpe1();
		System.out.println("x=" +a.x);
		System.out.println("private data y=" +a.preturn(1001,true));
	}
}