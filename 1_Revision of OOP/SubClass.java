public class Hoodie extends Clothes()
{
	private double arm_size;
	private double chest size;
	
	public Hoodie()
	{
		this();
	}
	
	public Hoodie(String color, double arm_size, chest_size)
	{
		//not sure
		setColor(super.color);
		super.color;
		
		setArm(arm_size);
		setChest(chest_size);
	}
	
	public void setArm(double arm_size)
	{
		this.arm_size=arm_size;
	}
	
	public void setChest(double chest_size)
	{
		this.chest_size=chest_size;
	}
	
	public double getChest()
	{
		return chest_size;
	}
	
	public double getArm()
	{
		return arm_size;
	}
	
	public String toString
	{
		return "Hoodie Details \n Arm size: "+ getChest() + "Chest: " + getArm() + "Color: "+ super.getColor();	
	}	
}

-------PRACTISE------
public class Hoodie extends Clothes()
{
	private double arm;
	private double chest;
	public Hoodie()
	{
		this("");
	}
	public Hoodie(String color, double arm,chest)
	{
		setArm(arm);
		setChest(chest);
		
		super.color;
	}
	
	public void setChest(double chest)
	{
		this.chest=chest;
	}
	
	public void setArm(double arm)
	{
		this.arm = arm;
	}
	
	public double getChest()
	{
		return chest;
	}
	
	public double getArm()
	{
		return arm;
	}
	
	public String toString()
	{
		return ""+getChest()+"" +getArm()+"" +super.getColor(); 
	}
}