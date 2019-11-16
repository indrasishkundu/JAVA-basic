
class T111 implements Runnable{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("1st thread running" +i);
		}
	}
}

class T112 implements Runnable{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("2nd thread running" +i);
		}
	}
}
class T7 {
	public static void main(String args[])throws Exception{
		T111 t1=new T111();
		Thread th1=new Thread(t1);
		T112 t2=new T112();
		Thread th2=new Thread(t2);
		
		th1.start();
		th2.start();
		th1.join();
	}
}
		