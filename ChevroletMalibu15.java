package Cars;

public class ChevroletMalibu15 extends Cars {
	public void nameCar() {
		System.out.println("3. Chevrolet Malibu 1.5\n"); 
	}
	
	public void engine() {
		System.out.println("Engine specifications:");
		System.out.println("Engine: 1.5i\r\n" + 
				"Engine Code: LFV\r\n" + 
				"Engine type: ICE\r\n" + 
				"Fuel Type: Petrol\r\n" + 
				"Engine displacement, cubic centimeters: 1490\r\n" + 
				"Cylinder Arrangement: In-Line\r\n" + 
				"Number of cylinders: 4\r\n" + 
				"Number of valves: 16\r\n" + 
				"Turbo\r\n" + 
				"Compression Ratio: 10.0: 1\r\n" + 
				"Power, hp: 163\r\n" + 
				"Speed max. power rpm .: 5600\r\n" + 
				"Torque, Nm: 250\r\n" + 
				"Speed max. moment rpm .: 2000-4000\n");
	}
	
	public void dynamicsAndFlow() {
		System.out.println("Dynamics and consumption:");
		System.out.println("Fuel consumption (urban cycle), l. per 100 km: 8.2\r\n" + 
				"Fuel consumption (extra-urban cycle), l. per 100 km: 6.6\r\n" + 
				"Fuel consumption (mixed cycle), l. per 100 km: 7.4\n");
	}
	
	public void dimensions() {
		System.out.println("Dimensions:");
		System.out.println("Number of seats: 5\r\n" + 
				"Length mm: 4933\r\n" + 
				"Width (without mirrors), mm: 1854\r\n" + 
				"Height, mm: 1455\r\n" + 
				"Wheelbase (mm): 2830\r\n" + 
				"Track of front wheels, mm: 1590\r\n" + 
				"Track of rear wheels, mm: 1588\r\n" + 
				"Curb weight (kg): 1422\r\n" + 
				"Trunk volume, l: 445\r\n" + 
				"Fuel tank capacity, l: 60\r\n" + 
				"Turning circle, m: 11");
	}
}
