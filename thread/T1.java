
class T1 implements Runnable{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("1st thread running" +i);
		}
	}
}