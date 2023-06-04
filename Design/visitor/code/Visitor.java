public interface Visitor {

	/**
	 * 
	 * @param a
	 */
	void visiteAirRoute(AirRoute a);

	/**
	 * 
	 * @param n
	 */
	void visiteNavalRoute(NavalRoute n);

	/**
	 * 
	 * @param t
	 */
	void visiteTrainRoute(TrainRoute t);

}