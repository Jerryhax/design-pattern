/**
 * 
 */

/**
 * @author Jerryhax
 * 2017年10月9日下午5:19:56
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inverstor lisi = new CurrentInverstor();
		Stock s = new HKStock();
		s.registerObserver(lisi);
		s.setShares(20);
		
		Stock b = new BaiduStock();
		s.registerObserver(lisi);
		s.setShares(100);
	}

}
