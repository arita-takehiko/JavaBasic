package practice13.common;

public class Item {
	private String name;
	private int additionalDamage;

	public void setName(String name) {
		 this.name =name;
	}

	public void setDamage(int damage) {
		this.additionalDamage=damage;
	}

	public String getName() {
		return this.name;
	}

	public int getDamage() {
		return this.additionalDamage;
	}
	public Item() {
		this.name="なまくら";
		this.additionalDamage=0;
	}
	public Item(String namae,int tuyosa) {
		this.name=namae;
		this.additionalDamage=tuyosa;
		}

}
