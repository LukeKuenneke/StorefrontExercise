public class Item {
    private String name;
    private int shelfLife;
    private int worth;

    public Item(String a_name, int a_shelfLife, int a_worth) {
        this.name = a_name;
        this.shelfLife = a_shelfLife;
        this.worth = a_worth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }
}