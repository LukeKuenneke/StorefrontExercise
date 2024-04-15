private List < Item > items = new ArrayList < > ();

public Main() {
  items.add(new Item("Aluminum Shackles", 10, 20));
  items.add(new Item("Gold", 2, 50));
  items.add(new Item("Plutonium Pinball Parts", 5, 7));
  items.add(new Item("Cadmium", 0, 80));
  items.add(new Item("Helium", 15, 38));
  items.add(new Item("Alchemy Iron", 3, 75));
}

private void updateWorth() {
  for (Item item: items) {
    if (item.getName().equals("Gold") || item.getName().equals("Helium")) {
      if (item.getWorth() < 50) {
        item.setWorth(item.getWorth() + 1);
      }
    } else {
      if (item.getShelfLife() > 0) {
        item.setShelfLife(item.getShelfLife() - 1);
      }
      if (item.getShelfLife() < 0) {
        if (item.getName().equals("Gold")) {
          item.setWorth(item.getWorth() - item.getWorth());
        } else {
          item.setWorth(item.getWorth() - 1);
        }
      }
    }
  }
}