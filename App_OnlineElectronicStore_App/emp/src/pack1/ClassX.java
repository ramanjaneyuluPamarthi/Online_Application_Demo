package pack1;

public class ClassX extends Thread
{
	@Override
		public void run()
		{
		int i=1; while (true)
		{
			i=i+1;
			System.out.println("i value"+i);
		}
		}
	public static void main(String[]args)
	{
		ClassX aobj=new ClassX();
		Thread t1=new Thread(aobj);

		t1.setDaemon(true);
		t1.start();
		
		for(int i=1;i<=10;i++)   //block level var
		{
		
			System.out.println("i value:"+i);
		}
		
	}
		}

