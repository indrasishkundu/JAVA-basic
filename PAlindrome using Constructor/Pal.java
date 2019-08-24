class Pal{
	Pal(int num ){
		 int reversedInteger = 0;
		 int remainder;
		 int  originalInteger;
		  originalInteger = num;
        for(;num != 0; num /= 10 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
        }
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
	}
}