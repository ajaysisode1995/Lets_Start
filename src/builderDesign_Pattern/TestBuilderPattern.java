package builderDesign_Pattern;


public class TestBuilderPattern {

	public static void main(String[] args) {
		
		
		 Computer computer = new Computer
		.ComputerBuilder("500HDD", "8GB")
		.setBluetoothEnable(true)
		.setGraphicCardEnable(true)
		.build();
		 
		 System.out.println(computer);
		
	}
}
