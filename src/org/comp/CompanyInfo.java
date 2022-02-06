package org.comp;

public class CompanyInfo {
	
	
	private void compInfo(String name) {
		System.out.println("comp name"+name);

	}
	
	private void compInfo(String name,int id,long Rigno ) {
		System.out.println("comp name "+name+"\n"+id+"\n"+Rigno);
	}
	
	private void compInfo(float income) {
		System.out.println("comp income monthly" +"\t"+ income);

	}
   
		

public static class Employee extends CompanyInfo {
	
	  private void EmpInfo(String add,int pincode) {
			System.out.println("Comp add"+"\n" + pincode);

		}
		
		public static void main(String[] args) {
			
			CompanyInfo c = new CompanyInfo();
			
			c.compInfo("Nissan automotive india pvt ltd");
			c.compInfo("Nissan automotive india pvt ltd", 241294, 13242525);
			c.compInfo(1252678);
			
			Employee e = new Employee();
		
			e.EmpInfo("No.02 anna nagar,bypass,chennai", 623407);
			
	
		}
}
}