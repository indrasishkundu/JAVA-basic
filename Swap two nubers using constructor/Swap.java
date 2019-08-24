class Swap{
	Swap(int x,int y){
		
		   System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
     
      int temp = x;
      x = y;
      y = temp;
     
      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	}
}