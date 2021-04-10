class AnonymousSuper
{
	void show()
	{
		System.out.println("AnonymousSuper class show function");
	}
}

interface AnonymousInterface
{
	void show();
}

public class AnonymousInner
{
	static AnonymousSuper s = new AnonymousSuper()
	{
		void show()
		{
			super.show();
			System.out.println("AnonymousSub class show function");
		}
	};
	
	static AnonymousInterface i = new AnonymousInterface()
	{
		public void show()
		{
			System.out.println("AnonymousInterface show function");				
		}
	};
	
	public static void main(String[] args)
	{
		s.show();
		i.show();				
	}
}
