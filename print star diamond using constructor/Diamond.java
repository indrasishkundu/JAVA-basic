class Diamond{
	Diamond(int row){
		 int i,j,k,l,m,n;
		for( i=1;i<=row;i++)
	{
		for( j=row-1;j>=i;j--)
		{
			  System.out.print(" ");
		}
	  k=i;
	for( l=1;l<=i;l++)
	{
		  System.out.print("*");
			
	k=k+1;
    }
    m=k-2;
    for( n=m;n>=i;n--)
    {
    	  System.out.print("*");
    	m=m-1;
	}
	for( j=1;j<= 2*(row-i)-1;j++)
	{
		  System.out.print("*");
	}	
	  System.out.print("\n");
	}
	}
}