package builderDesign_Pattern;

public class Computer {
	//required fields
	private String HDD;
	private String RAM;
	
	//optional parameters
	
	private boolean isGraphicCardEnable;
	private boolean isBluetoothEnable;
	
	public String getHDD() {
		return HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public boolean isGraphicCardEnable() {
		return isGraphicCardEnable;
	}
	public boolean isBluetoothEnable() {
		return isBluetoothEnable;
	}
	private Computer(ComputerBuilder builder) {
		this.HDD=builder.HDD;
		this.RAM=builder.RAM;
		this.isBluetoothEnable=builder.isBluetoothEnable;
		this.isGraphicCardEnable=builder.isGraphicCardEnable;
	}
	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicCardEnable=" + isGraphicCardEnable
				+ ", isBluetoothEnable=" + isBluetoothEnable + "]";
	}



	public static class ComputerBuilder{
		
		//required fields
		private String HDD;
		private String RAM;
		
		//optional parameters
		
		private boolean isGraphicCardEnable;
		private boolean isBluetoothEnable;
		
		
		public ComputerBuilder(String hDD, String rAM) {
			super();
			HDD = hDD;
			RAM = rAM;
		}
		public ComputerBuilder setGraphicCardEnable(boolean isGraphicCardEnable) {
			this.isGraphicCardEnable = isGraphicCardEnable;
			return this;
		}
		public ComputerBuilder setBluetoothEnable(boolean isBluetoothEnable) {
			this.isBluetoothEnable = isBluetoothEnable;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
			
		}
		
	}
	
}
