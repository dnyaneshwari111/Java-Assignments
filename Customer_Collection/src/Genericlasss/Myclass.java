package Genericlasss;

public class Myclass<T> 
{

	T value;

	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public static void main()
	{
	
	Myclass<Integer> obj = new Myclass<Integer>();
	obj.setValue(45);
	System.out.println(obj.getValue() * obj.getValue());
	
	}

	
}

