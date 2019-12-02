class Mygarbage
{
	public static void main(String jhj[])
	{
		Alto800 a=new Alto800();
		System.out.println("Available Memory: "+Runtime.getRuntime());
		a=null;
		System.out.println("Available Memory: "+Runtime.getRuntime());
		System.gc();
		System.out.println("Available Memory: "+Runtime.getRuntime());
	}
}