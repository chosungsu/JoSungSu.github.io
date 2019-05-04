class Owner
{
	static String owner;//owner의 값을 고정시킨다.
	public Owner(String owner)
	{
		Owner.owner = owner;
	}
	public void Phonetasking()
	{
		System.out.println(owner + "가 통화 중이다. 다음에 다시 연락해 주세요.");
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
		System.out.println(owner + "가 " + whenstart + "부터 " + whenfinish + "까지 " + room + "호 룸에서 회의 중이십니다.");
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
		System.out.println(owner + "가 " + whenstart + "부터 " + whenfinish + "까지 " + where + "로 출장나가셨습니다.");
	}
}
public class MainClass
{
	public static void main(String[] args) {
		Owner[] doings = {new Owner("조성수"), new Talking("3PM", "6PM", "504"),
				new Nothere("11AM", "3PM", "압구정동")};
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