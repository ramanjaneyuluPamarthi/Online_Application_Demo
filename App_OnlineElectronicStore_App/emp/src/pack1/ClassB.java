package pack1;

public class ClassB extends Thread{

	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
	 for(int i=1;i<=10;i++)
	 {
		 //System.out.println("i value:"+i);
		 //System.out.println(name+"("+priority+")+executed run():"+i);
		 System.out.println("my"+i+"interview");
	 }
System.out.println("igot it");
	
	
	try
	{
		Thread.sleep(30000);
	}
	catch(Exception e)
	{
		System.out.println("weakup");
	}
       System.out.println("iam going to office");
	
}



	public static void main(String[] args)
	{
		ClassB bobj=new ClassB();
		Thread t2=new Thread(bobj);
		bobj .start();
		bobj.interrupt();
	}

}
