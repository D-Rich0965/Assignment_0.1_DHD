
public class Application {

	public static void main(String[] args) {
		
		Item<String> itemString = new Item<>();
		itemString.sete("Dylan");
		
		Item<Integer> itemInteger = new Item<>();
		itemInteger.sete(21);
		
		smallBag<Item> smallBagItem = new smallBag<>();
		smallBagItem.setitem(itemString);
		
		System.out.println(smallBagItem.getitem().gete());
		
		smallBagItem = new smallBag<>();
		smallBagItem.setitem(itemInteger);
		
		System.out.println(smallBagItem.getitem().gete());
		
	}

}
