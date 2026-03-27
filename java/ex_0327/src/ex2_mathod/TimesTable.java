package ex2_mathod;

public class TimesTable {
	public void showTable(int dan) {
		for(int i = 1; i < 10; i++) {
			int sum = dan * i;
			System.out.printf("%d x %d = %d\n",dan, i, sum);
		}
	}
}
