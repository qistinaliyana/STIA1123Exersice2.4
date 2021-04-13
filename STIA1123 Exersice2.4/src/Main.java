
public class Main {

	public static void main(String[] args) {
		 Ball G = new Ball();
			
			G.setBrand("Taylormade TP5x pix");
			G.setColor("White");
			G.setsportType("Golf ball");
			G.setMaterial("Urethane cover");
			G.setSize("Small");
			G.setprice(16);
			G.setQuantity(12);
			G.setweight(700);
			
			System.out.println("Brand: " + G.getBrand());
			System.out.println("Color: " + G.getColor());
			System.out.println("Sport Type: " + G.getsportType());
			System.out.println("Material: " + G.getMaterial());
			System.out.println("Size : " + G.getSize());
			System.out.println("Price: RM " + G.getprice());
			System.out.println("Quantity: " + G.getQuantity());
			System.out.println("Weight: " + G.getweight() + "g");
			System.out.println("Total price: RM " + G.getTotalprice());
			
			System.out.println();
			
			    Ball S = new Ball();
				
			        S.setBrand("Mizuno ISF 150");
				S.setColor("Yellow");
				S.setsportType("Soft ball");
				S.setMaterial("Synthetic Leather");
				S.setSize("Small");
				S.setprice(56);
				S.setQuantity(2);
				S.setweight(178);
				
				System.out.println("Brand: " + S.getBrand());
				System.out.println("Color: " + S.getColor());
				System.out.println("Sport Type: " + S.getsportType());
				System.out.println("Material: " + S.getMaterial());
				System.out.println("Size : " + S.getSize());
				System.out.println("Price: RM " + S.getprice());
				System.out.println("Quantity: " + S.getQuantity());
				System.out.println("Weight: " + S.getweight() + "g");
				System.out.println("Total price: RM " + S.getTotalprice());
		}

	}

