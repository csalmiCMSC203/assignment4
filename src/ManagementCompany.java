


public class ManagementCompany {

	private String name;
	private String taxID;
	private double mgmFeePer;
	private Property[] properties;
	private int MGMT_WIDTH=10;
	private int MGMT_DEPTH=10;
	private Plot plot;
	private int MAX_PROPERTY=5;
	
	//This constructor creates a ManagementCompany object using empty strings and the plot set to a 
	//Plot with x, y set to 0 , width and depth set to 10.
	//properties array is initialized here as well.
	ManagementCompany(){
		this.name="";
		this.taxID = "";
		this.plot = new Plot(0,0,10,10);
		this.properties = new Property[MAX_PROPERTY];
	}
	
	//This Constructor Creates a ManagementCompany object using the passed information.
	//plot is set to a Plot with x, y set to 0 , width and depth set to 10
	//properties array is initialized here as well
	ManagementCompany(String name, String taxID, double mgmFeePer){
		this.name=name;
		this.taxID=taxID;
		this.mgmFeePer= mgmFeePer;
		this.plot = new Plot(0,0,10,10);
		this.properties = new Property[MAX_PROPERTY];
	}
	// This Constructor Creates a ManagementCompany object using the passed information.
	ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
		this.name=name;
		this.taxID=taxID;
		this.mgmFeePer= mgmFeePer;
	}
	//This Constructor Copies ManagementCompany object from another ManagementCompany object
	ManagementCompany(ManagementCompany otherCompany){
		this.name=otherCompany.name;
		this.taxID=otherCompany.taxID;
		this.mgmFeePer= otherCompany.mgmFeePer;
		this.properties= otherCompany.properties;
		this.MGMT_WIDTH = otherCompany.MGMT_WIDTH;
		this.MGMT_DEPTH=otherCompany.MGMT_DEPTH;
		this.plot=otherCompany.plot;
		this.MAX_PROPERTY = otherCompany.MAX_PROPERTY;
	}
	//Adds the property object to the "properties" array.
	public int addProperty(Property property) {
		if(property == null) {
			return -2;
		}
		Property property1 = new Property(property);
		if(!plot.encompasses(property.getPlot())) {
			return -3;
		}
		for(int i=0; i<properties.length;i++) {
			if(properties[i] == null) {
				properties[i]=property1;
				return i;
			}
			else if(property.getPlot().overlaps(properties[i].getPlot())) {
				return -4;
			}
		}
		return -1;
	}
	//Creates a property object and adds it to the "properties" array, in a default plot.
	public int addProperty(String name, String city, double rent, String ownerName) {
		Property property1 = new Property(name, city, rent, ownerName);
		if(!plot.encompasses(property1.getPlot())) {
			return -3;
		}
		for(int i=0; i<properties.length;i++) {
			if(properties[i] == null) {
				properties[i]=property1;
				return i;
			}
			else if(property1.getPlot().overlaps(properties[i].getPlot())) {
				return -4;
			}
		}
		return -1;
	}
	public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth) {
		Property property1 = new Property(name, city, rent, owner, x, y, width, depth);
		if(!plot.encompasses(property1.getPlot())) {
			return -3;
		}
		for(int i=0; i<properties.length;i++) {
			if(properties[i] == null) {
				properties[i]=property1;
				return i;
			}
			else if(property1.getPlot().overlaps(properties[i].getPlot())) {
				return -4;
			}
		}
		return -1;
	}
	//Return the MAX_PROPERTY constant that represents the size of the "properties" array.
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	//This method accesses each "Property" object within the array "properties" 
	//and sums up the property rent and returns the total amount.
	public double totalRent() {
		double totalRent = 0;
		for(int i=0; i<properties.length;i++) {
			if(!(properties[i]==null)) {
				totalRent += properties[i].getRentAmount();
			}
		}
		return totalRent;
	}
	//This method finds the property with the maximum rent amount
	public double maxRentProp() {
		double val = 0;
		for(int i = 0; i < properties.length; i++) {
			if(properties[i] != null)
			{
				if(properties[i].getRentAmount() > val) {
					val = properties[i].getRentAmount();
				}
			}
		}
		return val;
	}
	//This method finds the index of the property with the maximum rent amount.
	private int maxRentPropertyIndex() {
		double rentMaxAmount = 0;
		int rentMaxAmountIndex = 0;
		for(int i=0; i<properties.length;i++) {
			if(!(properties[i]==null)) {
				if(properties[i].getRentAmount()>rentMaxAmount) {
				rentMaxAmount = properties[i].getRentAmount();
				rentMaxAmountIndex = i;
				}
			}
		}
		return rentMaxAmountIndex;
	}
	//Displays the information of the property at index i
	private String displayPropertyAtIndex(int i) {
			return properties[i].toString(); 
	}
	//Displays the information of the property at index i
	private String displayPropertyAllProperties() {
		String info="";

			for(int i=0; i<properties.length;i++) {
				if(properties[i] != null)
			info += properties[i].toString();
		}
		return info; 
	}
	//Displays the information of all the properties in the "properties" array.
	public String toString() {
		return "List of the properties for " + name + ", taxID: "+taxID + "\n"+ "________________________"+
		"\n"+displayPropertyAllProperties() + "__________________________"+"\ntotal management Fee: "+mgmFeePer*totalRent()/100; 
	}
	public String getName() {
		return name;
	}
	public Plot getPlot() {
		return plot;
	}
}
