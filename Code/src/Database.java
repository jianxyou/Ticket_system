import java.util.*;

class Database {

	private java.util.ArrayList<String> data;
	private Collection<Observer> observers;

	public java.util.ArrayList<String> getData() {
		return this.data;
	}

	public Database() {
		// TODO - implement Database.Database
		throw new UnsupportedOperationException();
	}

	/**
	 * 取消注册观察者
	 * @param observer
	 */
	public void removeObserver(Observer observer) {
		// TODO - implement Database.removeObserver
		throw new UnsupportedOperationException();
	}

	/**
	 * 通知所有的观察者进行更新
	 */
	public void notifyObservers() {
		// TODO - implement Database.notifyObservers
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param obs
	 */
	public void registerObserver(Observer obs) {
		// TODO - implement Database.registerObserver
		throw new UnsupportedOperationException();
	}

	/**
	 * 添加数据并通知观察者
	 * @param newData
	 */
	public void addData(String newData) {
		// TODO - implement Database.addData
		throw new UnsupportedOperationException();
	}

	
}