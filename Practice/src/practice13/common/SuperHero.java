package practice13.common;

public class SuperHero extends practice13.common.Hero{

	private Item equipment;

	public SuperHero() {
		super(26,11,8);
	}

	public int attack() {
		return super.attack() + this.getEquipment().getAdditionalDamage();
	}



	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}
	public Item getEquipment() {
		return this.equipment;
	}
}
