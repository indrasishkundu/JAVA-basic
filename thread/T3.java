class T3{
	public static void main(String args[]){
		T1 t1=new T1();
		Thread th1=new Thread(t1);
		T2 t2=new T2();
		Thread th2=new Thread(t2);
		T3_1 t3=new T3_1();
		Thread th3= new Thread(t3);
		th1.start();
		th2.start();
		th3.start();
	}
}
		