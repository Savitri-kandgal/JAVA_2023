package com.xworkz.address.repository;

import com.xworkz.address.dto.AddressDTO;
import com.xworkz.address.exception.MemoryFullException;

public class AddressRepositoryImpl implements AddressRepository {

	AddressDTO[] dtos = new AddressDTO[2];
	int index = 0;

	@Override
	public boolean saveDTO(AddressDTO dto) throws MemoryFullException {
		if (index < dtos.length) 
		{
			dtos[index] = dto;
			System.out.println("repo : dto saved: " + dtos[index]);
			index++;
			return true;
		}
		throw new MemoryFullException("array index our of bound exception, we can store only 2 dtos");
	}

	public int total() {
		return index;
	}

	public AddressDTO findByNumber(int number) {

		for (int i = 0; i < index; i++) {
			int temp = dtos[i].getNumber();
			if (number == temp) {
				return dtos[i];
			}
		}
		System.out.println("no dto found by the requested ID:" + number);
		return null;
	}

	public boolean find(AddressDTO dto) {

		for (int i = 0; i < index; i++) {
			AddressDTO temp = dtos[i];
			if (dto.equals(temp)) {
				return true;
			}
		}
		return false;
	}

	public AddressDTO findByStreet(String street) {

		for (int i = 0; i < index; i++) {
			String temp = dtos[i].getStreet();
			if (street.equals(temp)) {
				return dtos[i];
			}
		}
		System.err.println("No dto found by given street");

		return null;
	}

	public AddressDTO findByPinCode(int pinCode) {
		for (int index = 0; index < this.index; index++) {
			int temp = dtos[index].getPincode();
			if (pinCode == temp) {
				return dtos[index];
			}
		}
		return null;
	}

	public AddressDTO findByStreetAndPinCodeAndArea(String street, int pincode, String area) {

		for (int index = 0; index < this.index; index++) {
			String st = dtos[index].getStreet();
			int pin = dtos[index].getPincode();
			String ar = dtos[index].getArea();
			if (street.equals(st) && pincode == pin && area.equals(ar)) {
				return dtos[index];
			}
		}
		return null;
	}

	public AddressDTO findByCityAndState(String city, String state) {

		for (int index = 0; index < this.index; index++) {
			String cty = dtos[index].getCity();
			String st = dtos[index].getState();
			if (cty.equals(city) && st.equals(state)) {
				return dtos[index];
			}
		}
		return null;
	}

	public String findFloorByNumber(int number) {

		for (int index = 0; index < this.index; index++) {
			int num = dtos[index].getNumber();
			if (number == num) {
				return dtos[index].getFloor();
			}
		}
		return null;
	}

	public String findCityByNumberAndFloorAndStreetAndPinCode(int number, String floor, String street, int pincode) {

		for (int index = 0; index < this.index; index++) {
			int num = dtos[index].getNumber();
			String flr = dtos[index].getFloor();
			String srt = dtos[index].getStreet();
			int pc = dtos[index].getPincode();
			if (number == num && floor.equals(flr) && street.equals(srt) && pincode == pc) {
				return dtos[index].getCity();
			}
		}
		return null;

	}

	public int findPincodeByNumber(int number) {

		for (int index = 0; index < this.index; index++) {
			int num = dtos[index].getNumber();
			if (number == num) {
				int pin = dtos[index].getPincode();
				return pin;
			}
		}
		return 0;
	}
}
