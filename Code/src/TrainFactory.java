public class TrainFactory extends UnitFactory {

	private AirFactory instance;

	public Unit createUnit() {
		// TODO - implement TrainFactory.createUnit
		throw new UnsupportedOperationException();
	}

	public AirFactory getInstance() {
		return this.instance;
	}

}