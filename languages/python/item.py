class Item:
    def __init__(self, name, shelf_life, worth):
        self.name = name
        self.shelf_life = shelf_life
        self.worth = worth

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_shelf_life(self):
        return self.shelf_life

    def set_shelf_life(self, shelf_life):
        self.shelf_life = shelf_life

    def get_worth(self):
        return self.worth

    def set_worth(self, worth):
        self.worth = worth
