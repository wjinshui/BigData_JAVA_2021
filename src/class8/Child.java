package class8;



public class Child extends Parent
{
	String m_default;
	public Child()
	{
		this(111);		
	}
	
	public Child(int xx)
	{
		super(xx);
	}
	public String getM_default()
	{
		return m_default;
	}
	public void setM_default(String m_default)
	{
		super.m_default = "adfa";
		this.m_default = m_default;
	}
	
	
}
