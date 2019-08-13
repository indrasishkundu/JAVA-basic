class Lobj{
void leap(int y)
{
if(y%100==0)
	{
		if(y%400==0)
                               {
		
			System.out.print("  "+y+" is   a leap year ");
                               }
		else
		{
			System.out.print(" "+y+" is not a leap year");
		}
	}
	else if(y%4==0)
	{
		System.out.print(" "+y+" is a leap year ");
	}
	else
	{
		System.out.print(" "+y+" is not a leap year");
                  }

	}
   }
