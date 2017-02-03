package pack1;

public class Operaciones {
	
	private int a;
	private int b;
	
	public  Operaciones(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int suma(){
		return a+b;
	}
	public int resta(){
		return a-b;
		
	}
	
	public int multiplicacion(){
		return a*b;
	}
	public int division(){
		if(b == 0){
			return 0;
		}else{
			return a/b;
		}
	}

}
