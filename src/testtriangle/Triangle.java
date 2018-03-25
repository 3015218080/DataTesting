package testtriangle;

public class Triangle {
	
	public boolean isLegal(int a,int b,int c){
		if(a>0 && b>0 && c>0){
			if(a+b>c && a+c>b && b+c>a){
				return true;
			}
		}
		return false;
	}
	
	public boolean isEquilateral(int a,int b,int c){
		if(isLegal(a,b,c)){
			if(a==b && b==c){
				//System.out.println("the triangle is equilateral.");
				return true;
			}
		}
		return false;
	}
	
	public boolean isIsosceles(int a,int b,int c){
		if(isLegal(a,b,c)){
			if(a==b || b==c || a==c){
				//System.out.println("the triangle is isosceles.");
				return true;
			}
		}
		return false;
	}
	
	public boolean isScalene(int a,int b,int c){
		if(isLegal(a,b,c)){
			if(a!=b && b!=c && c!=a){
				//System.out.println("the triangle is scalene.");
				return true;
			}
		}
		return false;
	}
	
}
