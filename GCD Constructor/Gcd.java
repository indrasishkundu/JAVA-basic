class Gcd{
	Gcd(int n1,int n2){
		 while( n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("G.C.D = " + n1);
	}
}