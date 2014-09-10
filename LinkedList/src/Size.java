import java.math.BigDecimal;


public class Size {
	String size;
	BigDecimal charge;
	
	
	public Size(String size, BigDecimal charge) {
		super();
		this.size = size;
		this.charge = charge;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public BigDecimal getCharge() {
		return charge;
	}
	public void setCharge(BigDecimal charge) {
		this.charge = charge;
	}
	@Override
	public String toString() {
		return "Size [size=" + size + ", charge=" + charge + "]";
	}
	
	
}
