package enumeration.ex0;

public class StringGradeEx0_2 {
	public static void main(String[] args) {
		int price = 10000;
		DiscountService discountService = new DiscountService();
		int basic = discountService.discount("BASIC", price);
		int gold = discountService.discount("GOLD", price);
		int diamond = discountService.discount("DIAMOND", price);

		int vip = discountService.discount("VIP", price);

		System.out.println("basic = " + basic);
		System.out.println("gold = " + gold);
		System.out.println("diamond = " + diamond);
		System.out.println("vip = " + vip);
	}
}
