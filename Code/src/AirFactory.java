public class AirFactory extends UnitFactory {

	private AirFactory instance;

	public Unit createUnit() {
		// TODO - implement AirFactory.createUnit
		throw new UnsupportedOperationException();
	}

	public AirFactory getInstance() {
		return this.instance;
	}

}