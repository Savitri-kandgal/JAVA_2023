package com.xworkz.address.runner;

import com.xworkz.address.dto.AddressDTO;
import com.xworkz.address.exception.DataValidException;
import com.xworkz.address.exception.MemoryFullException;
import com.xworkz.address.repository.AddressRepository;
import com.xworkz.address.repository.AddressRepositoryImpl;
import com.xworkz.address.service.AddressService;
import com.xworkz.address.service.AddressServiceImpl;

public class AddressRunner {

	public static void main(String[] args) {

		AddressDTO dto1 = new AddressDTO();

		dto1.setStreet("A block, 2nd stage, 4th main");	
		dto1.setArea("rajaji nagar");
		dto1.setPincode(123456);
		dto1.setFloor("1st");
		dto1.setNumber(300);
		dto1.setCity("Bangalore");
		dto1.setState("Karnataka");

		AddressDTO dto2 = new AddressDTO();
		dto2.setStreet("1st stage, 5th main");
		dto2.setArea("Indira Nagar");
		dto2.setPincode(123457);
		dto2.setFloor("Ground");
		dto2.setNumber(400);
		dto2.setCity("Pune");
		dto2.setState("Maharatra");


		/*
		 * dto.setStreet("D block, 2nd stage, 4th main"); dto.setArea("rajajinagar");
		 * dto.setPincode(12345); dto.setFloor(1); dto.setNumber("NO/398"); //cant we
		 * pass only numbers? getting error dto.setCity("Bangalore");
		 * dto.setState("Karnataka");
		 */
		System.out.println(dto1);
		System.out.println(dto2);

		AddressRepository repo = new AddressRepositoryImpl();

		AddressService service = new AddressServiceImpl(repo);

		try {
			
			boolean save=service.validateAndThenSave(null);
			System.out.println("runner:saved dto1 in repo: "+save);
					
		//	service.validateAndThenSave(dto2);
			// service.validateAndThenSave(dto);

			// reading the data
			int totalDtos = service.getTotal();
			System.out.println("total dto saved in repo: " + totalDtos);

			AddressDTO fetchdto = service.findByNumber(0);
			System.out.println("fetched dto by number: " + fetchdto);

			boolean found = service.find(dto2);
			System.out.println("DTO found by repository: " + found);

			AddressDTO dto = service.findByStreet("1st stage, 5th main");
			System.out.println("found dto by street: " + dto);

			AddressDTO dtoByPin = service.findByPinCode(123456);
			System.out.println("dto by pin code: " + dtoByPin);

			AddressDTO dtobySPA = service.findByStreetAndPinCodeAndArea("A block, 2nd stage, 4th main", 123457, "rajajinagar");
			System.out.println("dto by Street&pin&area: " + dtobySPA);

			AddressDTO dtoByCyAndSt = service.findByCityAndState("Pune", "Maharatra");
			System.out.println("dto by city & state: " + dtoByCyAndSt);

			String floor = service.findFloorByNumber(300);
			System.out.println("Floor by number : " + floor);

			String city = service.findCityByNumberAndFloorAndStreetAndPinCode(300, "1st", "A block, 2nd stage, 4th main", 123456);
			System.out.println("city by Num, Floor, Street & PinCode: " + city);

			int pincode = service.findPincodeByNumber(400);
			System.out.println("pincode by number: " + pincode);

		} catch (DataValidException e) {
			e.printStackTrace();
		} catch (MemoryFullException e) {
			e.printStackTrace();
		} finally {
			System.out.println("main() ends");
		}

	}

}
