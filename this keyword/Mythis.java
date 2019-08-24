class Mythis{
	int x;
	public static void main(String args[]){
		Mythis m=new Mythis();
		m.x=5;
		m.meth();
	}
	void meth(){
		System.out.print("By this keyword" +this.x);
	}
}