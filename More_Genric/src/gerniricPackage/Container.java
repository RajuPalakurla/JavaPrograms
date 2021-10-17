package gerniricPackage;

public class Container <T1,T2>{
	T1 value1;
	T2 Value2;
	public Container(T1 value1, T2 value2) {
		super();
		this.value1 = value1;
		Value2 = value2;
	}
	
	public void pirntValues() {
		System.out.println("Value1 : "+value1);
		System.out.println("Value2 : "+Value2);
	}
	public T1 getValue1() {
		return value1;
	}
	public void setValue1(T1 value1) {
		this.value1 = value1;
	}
	public T2 getValue2() {
		return Value2;
	}
	public void setValue2(T2 value2) {
		Value2 = value2;
	}
	
}
