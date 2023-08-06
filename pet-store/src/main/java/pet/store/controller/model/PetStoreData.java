package pet.store.controller.model;


import java.util.HashSet;

import java.util.Set;
import pet.store.entity.Customer;
import pet.store.entity.Employee;
import pet.store.entity.PetStore;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class PetStoreData {
	private Long petStoreId;
	private String petStoreName;
	private String petStoreAddress;
	private String petStoreCity;
	private String petStoreState;
	private Long petStoreZip;
	private Long petStorePhone;
	
	private Set<PetStoreEmployee> employees = new HashSet<> ();
	private Set<PetStoreCustomer> customers = new HashSet<> ();	
	
	
	
	public PetStoreData(PetStore petStore) {
		petStoreId = petStore.getPetStoreId();
		petStoreName = petStore.getPetStoreName();
		petStoreAddress = petStore.getPetStoreAddress();
		petStoreCity =petStore.getPetStoreCity();
		petStoreState = petStore.getPetStoreState();
		petStoreZip = petStore.getPetStoreZip();
		petStorePhone = petStore.getPetStorePhone();
		
		for (Employee employee : petStore.getEmployees()) {
			employees.add(new PetStoreEmployee(employee));
			}
		
		for(Customer customer : petStore.getCustomers()) {
			customers.add(new PetStoreCustomer(customer));
		}
	}


	@Data
	@NoArgsConstructor
	public
	
	static class PetStoreCustomer {
		private Long customerId;
		private String customerFirstName;
		private String customerLastName;
		private String customerEmail;
		
		public PetStoreCustomer(Customer customer) {
			customerId = customer.getCustomerId();
			customerFirstName = customer.getCustomerFirstName();
			customerLastName = customer.getCustomerLastName();
			customerEmail = customer.getCustomerEmail();
		}
	}
		
	@Data
	@NoArgsConstructor
	public
	static class PetStoreEmployee {
		private Long employeeId;
		private String employeeFirstName;
		private String employeeLastName;
		private Long employeePhone;
		private String jobTitle;
		
		public PetStoreEmployee(Employee employee) {
			employeeId = employee.getEmployeeId();
			employeeFirstName = employee.getEmployeeFirstName();
			employeeLastName = employee.getEmployeeLastName();
			employeePhone = employee.getEmployeePhone();
			jobTitle = employee.getJobTitle();	
			
		
				
}

		
	}
}

	



	

	
	
		
	
	


