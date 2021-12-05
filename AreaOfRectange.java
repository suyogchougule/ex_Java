package Basic;

public class AreaOfRectange 
{
	public void rectangel(int l, int w)
	{
		int area=l*w;
		System.out.println("Area Of Rectangle="+area);
	}
public static void main(String[] args)
{
	AreaOfRectange obj = new AreaOfRectange();
	obj.rectangel(20,30);
	
}
}
