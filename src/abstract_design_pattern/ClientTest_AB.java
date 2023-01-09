package abstract_design_pattern;
interface Computer{
	public String getRam();
	public String getHdd();
	public String getCpu();
}
class ComputerFactory {

	public ComputerFactory() {
	
	}
	public static Computer getComputer(AbstractComputerFactory abstractComputerFactory) {
		return abstractComputerFactory.createComputer();
	}
	
}

	interface AbstractComputerFactory{
	 public Computer createComputer();
   }
	
	class LaptopFactory implements AbstractComputerFactory{
		private String ram;
		private String hdd;
		private String cpu;
		public String getRam() {
			return ram;
		}
		public void setRam(String ram) {
			this.ram = ram;
		}
		public String getHdd() {
			return hdd;
		}
		public void setHdd(String hdd) {
			this.hdd = hdd;
		}
		public String getCpu() {
			return cpu;
		}
		public void setCpu(String cpu) {
			this.cpu = cpu;
		}
		
		@Override
		public String toString() {
			return "LaptopFactory [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
		}
		
		public LaptopFactory(String ram, String hdd, String cpu) {
			super();
			this.ram = ram;
			this.hdd = hdd;
			this.cpu = cpu;
		}
		@Override
		public Computer createComputer() {
			return new Laptop(ram, hdd, cpu);
		}
	}
	
	
	class Laptop implements Computer{
		private String ram;
		private String hdd;
		private String cpu;
		@Override
		public String toString() {
			return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
		}
		
		public Laptop(String ram, String hdd, String cpu) {
			super();
			this.ram = ram;
			this.hdd = hdd;
			this.cpu = cpu;
		}

		@Override
		public String getRam() {
			// TODO Auto-generated method stub
			return this.ram;
		}

		@Override
		public String getHdd() {
			// TODO Auto-generated method stub
			return this.hdd;
		}

		@Override
		public String getCpu() {
			// TODO Auto-generated method stub
			return this.cpu;
		}
		}
	class PCFactory implements AbstractComputerFactory{
		private String ram;
		private String hdd;
		private String cpu;
		public String getRam() {
			return ram;
		}
		public void setRam(String ram) {
			this.ram = ram;
		}
		public String getHdd() {
			return hdd;
		}
		public void setHdd(String hdd) {
			this.hdd = hdd;
		}
		public String getCpu() {
			return cpu;
		}
		public void setCpu(String cpu) {
			this.cpu = cpu;
		}
		
		@Override
		public String toString() {
			return "PCFactory [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
		}
		
		public PCFactory(String ram, String hdd, String cpu) {
			super();
			this.ram = ram;
			this.hdd = hdd;
			this.cpu = cpu;
		}
		@Override
		public Computer createComputer() {
			return new PC(ram, hdd, cpu);
		}
	}
	
	
	class PC implements Computer{
		private String ram;
		private String hdd;
		private String cpu;
		@Override
		public String toString() {
			return "PC [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
		}
		
		public PC(String ram, String hdd, String cpu) {
			super();
			this.ram = ram;
			this.hdd = hdd;
			this.cpu = cpu;
		}

		@Override
		public String getRam() {
			// TODO Auto-generated method stub
			return this.ram;
		}

		@Override
		public String getHdd() {
			// TODO Auto-generated method stub
			return this.hdd;
		}

		@Override
		public String getCpu() {
			// TODO Auto-generated method stub
			return this.cpu;
		}
		}
public class ClientTest_AB {
	
	public static void main(String[] args) {
		Computer laptop = 
				ComputerFactory.getComputer(new LaptopFactory("8GB", "512 HDD","2.4Hz"));
		System.out.println(laptop);
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("4GB", "512 HDD","2.4Hz"));
		System.out.println(pc);
		
	}
}
