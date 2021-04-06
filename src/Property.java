
public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	public Property(){
		this.propertyName = "";
		this.rentAmount = 0;
		this.plot = new Plot(0,0,1,1);
	}
	public Property(Property p) {
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.rentAmount = p.rentAmount;
		this.owner = p.owner;
		this.plot = p.plot;
	}
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot =new Plot(x,y,width,depth);
	}
	public String getCity() {
		return city;
	}
	public String getOwner() {
		return owner;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public double getRentAmount() {
		return rentAmount;
	}
	public Plot setPlot(int x, int y, int width, int depth) {
		plot = new Plot(x,y,width,depth);
		return plot;
	}
	public Plot getPlot() {
		return plot;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	public String toString() {
		return "Property Name: "+ propertyName + "\n"+"Located in " + city + "\n" +"Belonging to: "+  owner + "\n" +"Rent Amount: "+ rentAmount+"\n";
	}
}
