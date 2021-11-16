package A2OOPS.Question6;

public class MainClient {

	public static void main(String[] args) {
		Persistence pp;
		pp = PersistenceFactory.getDataPersist();
		pp.persist();
		
		pp = PersistenceFactory.getFilePersist();
		pp.persist();
	}

}
