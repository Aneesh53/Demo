package revamp;

public class P19WAPTOprint100 {
	public static void printNumbers(int n) {
		if(n>100)
		{
			return;
		}
		System.out.println(n);
		printNumbers(n+1);
    }
	public static void main(String[] args) {
		printNumbers(1);
	}
}
