package telran.view;

public class Menu implements Item {
	
	private Item[] items;
	private String name;	

	public Menu(Item[] items, String name) {
		super();
		this.items = items;
		this.name = name;
	}

	@Override
	public String displayName() {
		return name;
	}

	@Override
	public void perform(InputOutput io) {
		Item item = null;
		do {
			displayTitle(io);
			displayItems(io);
			int nItem = io.readInt("Select item number", "Wrong item number", 1, items.length);
			item = items[nItem - 1];
			try {
				item.perform(io);
			} catch (Exception e) {
				io.writeLine(e.getMessage());
			}
		} while (!item.isExit());
	}

	private void displayTitle(InputOutput io) {
		// TODO Auto-generated method stub
		
	}

	private void displayItems(InputOutput io) {
		for (int i = 0; i < items.length; i++) {
			io.writeLine(String.format(%d, items));
		}
		
	}

	@Override
	public boolean isExit() {
		return false;
	}

}
