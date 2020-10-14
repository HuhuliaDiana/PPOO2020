package examples.course5.classes3;

public abstract class Persoana {

	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Persoana() {
		super();
		this.id = null;
	}

	public Persoana(String id) {
		super();
		this.id = id;
	}

	public abstract void faceCeva(String ceva);
	
}
