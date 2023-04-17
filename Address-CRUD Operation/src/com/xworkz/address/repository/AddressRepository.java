package com.xworkz.address.repository;

import com.xworkz.address.dto.AddressDTO;
import com.xworkz.address.exception.MemoryFullException;

public interface AddressRepository{

	public boolean saveDTO(AddressDTO dto) throws MemoryFullException;

	default int total() {
		return 0;
	}

	default AddressDTO findByNumber(int number) {
		return null;
	}

	default boolean find(AddressDTO dto) {
		return false;
	}

	default AddressDTO findByStreet(String street) {
		return null;
	}

	default AddressDTO findByPinCode(int pinCode) {
		return null;
	}

	default AddressDTO findByStreetAndPinCodeAndArea(String street, int pincode, String Area) {
		return null;
	}

	default AddressDTO findByCityAndState(String city, String state) {
		return null;
	}

	default String findFloorByNumber(int number) {
		return null;
	}

	default String findCityByNumberAndFloorAndStreetAndPinCode(int number, String floor, String street, int pincode) {
		return null;
	}

	default int findPincodeByNumber(int number) {
		return 0;
	}
}
