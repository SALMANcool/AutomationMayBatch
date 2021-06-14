package loopsConcepts;

public class LoopsProgram 

{
	
	public void forloop()
	{
		int k=10;
		for (int i = 0; i < k; i++) 
		{
		System.out.println(k);	
		//k++;
		
		}
	}	
	public void  ifElsePrograms()
	{
		//int i = 0;
		int i=1;
		if(i==0)
		{
			System.out.println("I am from if loop"+i);
		}
		else
		{
			int k=i+1;
			System.out.println("i am from else loop"+k);
		}
		}
	
public void whileloop()
{
	int i=0;
	while(i<10)
	{
		i++;
		System.out.println("while loop"  +i);
	}
}

public void switchPrograms()
{
	int month=13;
switch(month)
{
case 1:
	System.out.println("january");
	break;

case 2:
	System.out.println("february");
	break;

case 3:
	System.out.println("march");
	break;

case 4:
	System.out.println("April");
	break;
case 5:
	System.out.println("may");
	break;
case 6:
	System.out.println("june");
	break;
case 7:
	System.out.println("july");
	break;
case 8:
	System.out.println("august");
	break;
case 9:
	System.out.println("september");
	break;
case 10:
	System.out.println("october");
	break;
case 11:
	System.out.println("november");
	break;
case 12:
	System.out.println("december");
	break;
	default:
		System.out.println("I am invalid month");
}
}


public void dowhileLoop()
{
	int i=0;
	do 
	{
	System.out.println("I am from dowhileloop"+i);	
	i++;
	}
	while(i<20);
	
}
	
	public static void main(String[] args) {
		LoopsProgram lp=new LoopsProgram();
		//lp.forloop();
		// TODO Auto-generated method stub
//lp.ifElsePrograms();
		//lp.whileloop();
		//lp.dowhileLoop();
		lp.switchPrograms();
	}

}
