/*Thread synchronization*/
class SharedData{
	public synchronized void write(int n){
		for(int i=1;i<=20;i++){
			System.out.println("Thread " +n+ " is working");
		}
	}
}
class Thread1 implements Runnable{
	SharedData sd;
	Thread1(SharedData v)
	{
		this.sd=v;
	}
	public void run()
	{
		sd.write(1);
	}
}
class Thread2 implements Runnable{
	SharedData sd;
	Thread2(SharedData v)
	{
		this.sd=v;
	}
	public void run()
	{
		sd.write(2);
	}
}
class Thread3 implements Runnable{
	SharedData sd;
	Thread3(SharedData v)
	{
		this.sd=v;
	}
	public void run()
	{
		sd.write(3);
	}
}
class ThrSyn{
	public static void main(String args[]){
		SharedData sd1=new SharedData();
		Thread1 tr1=new Thread1(sd1);
		Thread th1=new Thread(tr1);
		Thread2 tr2=new Thread2(sd1);
		Thread th2=new Thread(tr2);
		Thread3 tr3=new Thread3(sd1);
		Thread th3=new Thread(tr3);
		th1.start();	
		th2.start();	
		th3.start();	
	}
}
		