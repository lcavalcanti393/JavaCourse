package entities;

public class CurrencyConverter {
	public static double dolarPrice;
	public static double quantity;

	public static double finalPrice() {
		return (dolarPrice * quantity)+(0.06*(dolarPrice*quantity));
	}
}
