package A2OOPS.Question6;

public class PersistenceFactory {
	public static DatabasePersistence getDataPersist() {
		DatabasePersistence dp = new DatabasePersistence();
		return dp;
	}
	
	public static FilePersistence getFilePersist() {
		return new FilePersistence();
	}
}
