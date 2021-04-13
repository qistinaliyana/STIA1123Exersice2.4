
public class Ball {
	String Brand, Color, sportType, Material, Size;
	double price, Totalprice;
	int weight, Quantity;
	
	 public void setBrand(String Brand) {
	    	this.Brand = Brand;
	    }
	 public void setColor(String Color) {
	    	this.Color = Color;
	    }
	 public void setsportType(String sportType) {
	    	this.sportType = sportType;
	    }
	 public void setMaterial(String Material) {
	    	this.Material = Material;
	    }
	 public void setSize(String Size) {
	    	this.Size = Size;
	    }
	 public void setprice(double price) {
		 this.price = price;
	 }
	 public void setweight(int weight) {
		 this.weight = weight;
	 }
	 public void setQuantity(int Quantity) {
		 this.Quantity = Quantity;
	 }
	 
	 
	 public String getBrand() {
		 return this.Brand;
	 }
	 public String getColor() {
		 return this.Color;
	 }
	 public String getsportType() {
		 return this.sportType;
	 }
	 public String getMaterial() {
		 return this.Material;
	 }
	 public String getSize() {
		 return this.Size;
	 }
	 public int getweight() {
		 return this.weight;
	 }
	 public double getprice() {
		 return this.price;
	 }
	 public int getQuantity() {
		 return this.Quantity;
	 }
	 public double getTotalprice() {
		 this.Totalprice = this.price * this.Quantity;
		 return this.Totalprice;
	 }
	
}
