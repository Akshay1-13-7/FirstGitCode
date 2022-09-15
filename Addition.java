com.add;
public class Addition{
	public int getAddition(int a,int b){
		int c = a + b;
	return c;
	public static void main(String []args){
	System.out.println("enter two numbers");
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	Addition.getAddition(a,b);
	System.oout.println("Addition is  >> "+c);
	}
}