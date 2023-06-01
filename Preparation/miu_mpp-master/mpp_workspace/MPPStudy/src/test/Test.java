package test;

public class Test {

	public static void main(String[] args) {
		int g = Integer.MIN_VALUE;
		// TODO Auto-generated method stub
		double s = Double.MAX_VALUE;
		System.out.println(findNumberOfX("Hellox- x xx"));
	}	

	public static int findNumberOfX(String s) {
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == 'x') count++;
		}
		return count;
	}
}
