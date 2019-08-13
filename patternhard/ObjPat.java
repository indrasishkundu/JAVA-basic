class ObjPat{
int row;
void pat(int k){
for(int i=1;i<=row;i++)
{
	for(int j=row-1;j>=i;j--)
	{
		System.out.print("   ");
	}
	k=i;
	for(int l=1;l<=i;l++)
	{
		System.out.print(" " +k+" ");
		k=k+1;
	}
	int m=k-2;
	for(int n=m;n>=i;n--)
	{
		System.out.print(" "+m+" ");
		m=m-1;
	}
	System.out.print("\n");
	}
}
}