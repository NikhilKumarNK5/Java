class Electronics
{
	static class Television
	{
		int cost;
		public Television(int cost)
		{
			this.cost = cost;
		}
		public void cost()
		{
			System.out.println("Cost of television = "+this.cost);
		}
		public static void cost(Television t)
		{
			System.out.println("Cost of television = "+t.cost);	
		}
	} 
	class Fridge
	{
		int cost;
		public Fridge(int cost)
		{
			this.cost=cost;
		}
		public void cost()
		{
			System.out.println("Cost of fridge = "+this.cost);
		}
	}
	
}
public class Elect
{
	public static void main(String[] args)
	{
		Electronics.Television t = new Electronics.Television(1000);
		t.cost();
		Electronics.Television.cost(t);
					
		Electronics.Fridge f = new Electronics().new Fridge(500);
		f.cost();
	}	   
}
