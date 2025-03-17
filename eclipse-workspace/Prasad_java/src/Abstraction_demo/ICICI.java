package Abstraction_demo;
interface RBI{
	public abstract void withdraw();
	public abstract void deposit();
	public void scanner();
}

public class ICICI implements RBI {
	public void withdraw()
	{
		System.out.println("ICICI LOGIC FOR WITH DRAW MONEY");
	}
	public void deposit()
	{
		System.out.println("Deposit logic of ICICI");
	}
	public void scanner()
	{
		System.out.println("This is scanner ICICI");
	}
}
