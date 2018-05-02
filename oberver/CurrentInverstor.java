import java.util.Date;

/**
 * 
 */

/**
 * @author Jerryhax
 * 2017年10月9日上午11:24:00
 */
public class CurrentInverstor extends Inverstor{

	private double shares;

	/* (non-Javadoc)
	 * @see Inverstor#updata()
	 */
	@Override
	public void update(double shares) {
		// TODO Auto-generated method stub
		this.shares = shares;
		operate();
		
	}

	/* (non-Javadoc)
	 * @see Inverstor#buy()
	 */
	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see Inverstor#sell()
	 */
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see Inverstor#change()
	 */
	@Override
	public void change() {
		// TODO Auto-generated method stub
		
	}

	public void operate(){
		Date date = new Date(); 
		System.out.println(date);
		System.out.println("操作成功！");
		
		
	}
	
}
