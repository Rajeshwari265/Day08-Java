package Day08;

public class Withreturnargument {
public int addvalues(int a, int b){
	        int sum=a+b;
	        return sum;
	    }
	    public static void main(String[] args) {
	        Withreturnargument obj=new Withreturnargument();
	        int result=obj.addvalues(5,8);
	        System.out.println("Result:"+result);
	    }
	    
	}
