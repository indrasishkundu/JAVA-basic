//th priority
class T11 implements Runnable{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("1st thread running" +i);
		
		}
	}
}

class T12 implements Runnable{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("2nd thread running" +i);
			
		}
	}
}
class T8{
	public static void main(String args[]){
		T11 t1=new T11();
		Thread th1=new Thread(t1);
		T12 t2=new T12();
		Thread th2=new Thread(t2);
		
		th1.start();
		th2.start();
		th1.setPriority(10);
		th2.setPriority(1);
		System.out.println("priority of 1st thread="+th1.getPriority());
		System.out.println("priority of 2nd thread="+th2.getPriority());
	}
}
		