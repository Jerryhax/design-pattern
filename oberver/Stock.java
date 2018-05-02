import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Jerryhax
 * 2017年10月9日上午10:49:44
 */
public abstract class Stock {
	
	//订阅
	public void registerObserver(Inverstor inverstor){
		ilist.add(inverstor);
//		slist.add(stockId);
		
	}
	
	//取消订阅
	public void removeObserver(Inverstor inverstor){
		ilist.remove(inverstor);
	}
	
	//通知股民,更新信息
	public void notifyObserver(double shares ){
		
		for(Inverstor i:ilist){
			i.update(shares);
			System.out.println( i);
		}
		
	}
	//股票信息变化引发通知
	public void sharesChanged(double shares){
		if(getShares()!=shares){
			notifyObserver(shares );
		}
	}
	
	//getters and setters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the shortname
	 */
	public String getShortname() {
		return shortname;
	}
	/**
	 * @param shortname the shortname to set
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	/**
	 * @return the stockID
	 */
	public String getStockID() {
		return stockID;
	}
	/**
	 * @param stockID the stockID to set
	 */
	public void setStockID(String stockID) {
		this.stockID = stockID;
	}
	/**
	 * @return the shares
	 */
	public double getShares() {
		return shares;
	}
	/**
	 * @param shares the shares to set
	 */
	public void setShares(double shares) {
		sharesChanged(shares);
		this.shares = shares;
	}

	ArrayList<Inverstor> ilist = new ArrayList();
	String name ;
	String shortname;
	String stockID;
	double shares;
	
	
}
