from item import Item


class Storefront:
    def __init__(self):
        self.items = []
        self.add_items()

    def add_items(self):
        self.items.append(Item("Aluminum Shackles", 10, 20))
        self.items.append(Item("Gold", 2, 50))
        self.items.append(Item("Plutonium Pinball Parts", 5, 7))
        self.items.append(Item("Cadmium", 0, 80))
        self.items.append(Item("Helium", 15, 38))
        self.items.append(Item("Alchemy Iron", 3, 75))

    def update_worth(self):
        for item in self.items:
            if item.get_name() == "Gold" or item.get_name() == "Helium":
                if item.get_worth() < 50:
                    item.set_worth(item.get_worth() + 1)
            else:
                if item.get_shelf_life() > 0:
                    item.set_shelf_life(item.get_shelf_life() - 1)
                if item.get_shelf_life() < 0:
                    if item.get_name() == "Gold":
                        item.set_worth(item.get_worth() - item.get_worth())
                    else:
                        item.set_worth(item.get_worth() - 1)


if __name__ == "__main__":
    sf = Storefront()
