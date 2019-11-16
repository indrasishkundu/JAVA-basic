
class T111 implements Runnable{
	public void run(){
		try{
		for(int i=0;i<=10;i++){
			System.out.println("1st thread running" +i);
			Thread.sleep(100);
		}
		}
		catch(Exception e){}
			
	}
}

class T121 implements Runnable{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("2nd thread running" +i);

		}
	}
}
class T6{
	public static void main(String args[]){
			
		T111 t1=new T111();
		Thread th1=new Thread(t1);
		T121 t2=new T121();
		Thread th2=new Thread(t2);
		
		th1.start();
		th2.start();
	
	}
}
		