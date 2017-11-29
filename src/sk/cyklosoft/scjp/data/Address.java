package sk.cyklosoft.scjp.data;

public class Address implements Comparable<Address> {

    private String name; 
    private int number;
    private String town;
    
    public Address(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(final Object o) {
        return true;
    }
    
    @Override
    public int hashCode() {
        return name.length(); // constant
    }

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}
	
    @Override
    public int compareTo(Address o) {
        return name.compareTo(o.getName());
    }

}
