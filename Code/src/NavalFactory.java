public class NavalFactory extends UnitFactory {

	private AirFactory instance;

	public Unit createUnit() {
		// TODO - implement NavalFactory.createUnit
		throw new UnsupportedOperationException();
	}

	public AirFactory getInstance() {
		return this.instance;
	}

}