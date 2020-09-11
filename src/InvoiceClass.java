
public class InvoiceClass {
	private String PartNumber;
	private String PartDecscription;
	private int Quantity;
	private double PricePerItem;
	
	InvoiceClass(String PartNumber, String PartDescription, int Quantity, double PricePerItem)
	{
		setPartNumber(PartNumber);
		setPartDecscription(PartDescription);
		if(Quantity > 0)
		{
			setQuantity(Quantity);
		}
		if(PricePerItem > 0.0)
		{
			setPricePerItem(PricePerItem);
		}
	}

	public String getPartNumber() {
		return PartNumber;
	}

	public void setPartNumber(String partNumber) {
		PartNumber = partNumber;
	}

	public String getPartDecscription() {
		return PartDecscription;
	}

	public void setPartDecscription(String partDecscription) {
		PartDecscription = partDecscription;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getPricePerItem() {
		return PricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		PricePerItem = pricePerItem;
	}
	
	public double getInvoiceAmount()
	{
		return Quantity * PricePerItem;
	}
}








