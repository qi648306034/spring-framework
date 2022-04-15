package bean.test;

/**
 * @Author Qiang.Qi
 * @Date: 2022/4/11 16:03
 */
public class Test1 {
	public static void main(String[] args) {
		Integer a = a(5);
		System.out.println(a);

	}
	private static Integer a(Integer n){
		if (n==1){
			return 1;
		}

		return n * a(n-1);
	}
}
