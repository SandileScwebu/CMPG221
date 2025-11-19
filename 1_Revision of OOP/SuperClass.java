//SuperClass
public abstract class Clothes
{
//Properties
	private String color;
	
//Behaviors
	public Clothes()
	{
		this("");
	}
	
	public Clothes(String color)
	{
		setColor(color);
	}
	
	//Mutator
	public void setColor(String color)
	{
		this.color=color;
	}
	
	//Accessor
	public getColor()
	{
		return color;
	}

	public abstract double getFabricSize();
}

--------PRACTISE------

public abstract class Clothes
{
	private String color;
	
	public Clothes()
	{
		this("");
	}
	
	public Clothes(String color)
	{
		setColor(color);
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public getColor()
	{
		return color;
	}
	
	public abstract double getFabricSize();
}
