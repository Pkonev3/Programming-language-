class myNumber{
	
	private int num;
	
	public int num2;
	
	public myNumber() {
		
		num = 0;
		num2 = 100;
	}
		
	int getNum() {
		return num;
	}
	
	int getNum2() {
		return num2;
	}
	
	void description() {
		
		System.out.println("Num: " + num + " Num 2: " + num2);
		
	}
		
	void setNum(int i) {
		
		num = i;
		
		num2 = 10 * i;
		
	}

	public myNumber(int _num, int _num2) {
		
		num = _num;
		
		num2 = _num2;
		
	}
	
	float average() {
		
		return (float)(num+num2)/2;
		
	}
	
}

public class exercisesClass {
	public static void main(String[] args) {
		
		myNumber F = new myNumber (13, 10);
		
		F.description();
		
		System.out.println("The average of these two numbers is: " + F.average());
		
	}

}
