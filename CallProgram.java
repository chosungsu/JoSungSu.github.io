class Owner
{
	static String owner;
	public Owner(String owner)
	{
		Owner.owner = owner;
	}
	public void Phonetasking()
	{
		System.out.println("Hi, Sir! What's up today?? Sorry to say to you this sad sentences");	
		System.out.println(owner + "is calling. Will you call later,please??");
	}
}
class Talking extends Owner
{
	String whenstart;
	String whenfinish;
	private String room;
	public Talking(String whenstart, String whenfinish, String room)
	{
		super(owner);
		this.whenstart = whenstart;
		this.whenfinish = whenfinish;
		this.room = room;
	}
	public Talking(String whenstart, String whenfinish)
	{
		super(owner);
		this.whenstart = whenstart;
		this.whenfinish = whenfinish;
	}
	public void Talktasking()
	{
		System.out.println(owner + "is in " + room + "room from " whenstart + " to " + whenfinish);
	}
}
class Nothere extends Talking
{
	private String where;
	public Nothere(String whenstart, String whenfinish, String where) 
	{
		super(whenstart, whenfinish);
		this.where = where;
	}
	public void Notheretasking()
	{
		System.out.println(owner + "is gone to " + where + " from " + whenstart + " to " + whenfinish);
	}
}
public class MainClass
{
	public static void main(String[] args) {
		Owner[] doings = {new Owner("Jo"), new Talking("3PM", "6PM", "504"),
				new Nothere("11AM", "3PM", "GangNamGu")};
		for(Owner d13 : doings)
		{
			if(d13 instanceof Nothere)
			{
				((Nothere) d13).Notheretasking();
			}
			else if(d13 instanceof Talking)
			{
				((Talking) d13).Talktasking();
			}
			else
			{
				d13.Phonetasking();
			}
		}
	}
}
