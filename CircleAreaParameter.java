package Basic;

public class CircleAreaParameter {
	public void CircleAP(double pi,int r)
	{
		double area=pi*Math.pow(r,2);
		double parameter= 2*pi*r;
		
		System.out.println("Area of Circle="+area);
		System.out.println("Parameter of Circle="+parameter);
	}
	public static void main(String[] args)
	{
		CircleAreaParameter obj =new CircleAreaParameter();
		obj.CircleAP(3.14, 2);
	}

}
