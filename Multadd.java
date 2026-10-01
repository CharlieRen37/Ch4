public class Multadd{
	public static void Multadd(double a, double b, double c){
		double result = a * b +c;		
		System.out.println(result);
	}
	public static void main(String[] args){
		Multadd(1.0,2.0,3.0);
		Multadd(Math.cos(Math.PI/4),0.5,Math.sin(Math.PI/4));
		Multadd(1.0,Math.log(10.0),Math.log(20.0));
		expSum(4.0);
	}
	
	public static void expSum(double x){
		Multadd(x,Math.exp(-x),Math.sqrt(1.0-Math.exp(-x)));
	}
}
