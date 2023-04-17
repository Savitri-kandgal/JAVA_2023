package com.xworkz.address.service;

import com.xworkz.address.dto.AddressDTO;
import com.xworkz.address.exception.DataValidException;

public interface AddressService {

	public boolean validateAndThenSave(AddressDTO dto) throws DataValidException;

	default int getTotal() {
		return 0;
	}

	default AddressDTO findByNumber(int number) throws DataValidException {
		return null;
	}

	default boolean find(AddressDTO dto) throws DataValidException {
		return false;
	}

	default AddressDTO findByStreet(String street) throws DataValidException {
		return null;
	}

	default AddressDTO findByPinCode(int pinCode) throws DataValidException {
		return null;
	}

	default AddressDTO findByStreetAndPinCodeAndArea(String street, int pincode, String Area)
			throws DataValidException {
		return null;
	}

	default AddressDTO findByCityAndState(String city, String state) throws DataValidException {
		return null;
	}

	default String findFloorByNumber(int number) throws DataValidException {
		return null;
	}

	default String findCityByNumberAndFloorAndStreetAndPinCode(int number, String floor, String street, int pincode)
			throws DataValidException {
		return null;
	}

	default int findPincodeByNumber(int number) throws DataValidException {
		return 0;
	}
}
