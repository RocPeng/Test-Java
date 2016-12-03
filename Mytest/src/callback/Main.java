package callback;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee employee=new Employee();
		Boss boss=new Boss(employee);
		boss.buy();
	}

}
