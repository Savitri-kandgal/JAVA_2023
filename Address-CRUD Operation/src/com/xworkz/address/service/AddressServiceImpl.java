package com.xworkz.address.service;

import com.xworkz.address.dto.AddressDTO;
import com.xworkz.address.exception.DataValidException;
import com.xworkz.address.repository.AddressRepository;
import com.xworkz.address.util.AddressUtil;

public class AddressServiceImpl implements AddressService {

	private AddressRepository addRepo;

	public AddressServiceImpl(AddressRepository addRepo) {
		this.addRepo = addRepo;
	}

	@Override
	public boolean validateAndThenSave(AddressDTO dto) throws DataValidException {

		System.out.println(" entered into validateAndThenSave()");
		if (dto != null) {

			boolean validStreet = false;
			boolean validArea = false;
			boolean validPincode = false;
			boolean validFloor = false;
			boolean validNumber = false;
			boolean validCity = false;
			boolean validState = false;

			String street = dto.getStreet();
			if (AddressUtil.ValidString(street)) {
				validStreet = true;
				System.out.println("street is valid");
			} else {
				System.out.println("street is invalid");
			}

			String area = dto.getArea();
			if (AddressUtil.ValidString(area)) {
				validArea = true;
				System.out.println("area is valid");
			} else {
				System.out.println("area is invalid");
			}

			int pc = dto.getPincode();
			if (AddressUtil.validInt(pc)) {
				validPincode = true;
				System.out.println("pin-code is valid");
			} else {
				System.out.println("pin-code is invalid");
			}

			String flr = dto.getFloor();
			if (AddressUtil.ValidString(flr)) {
				validFloor = true;
				System.out.println("floor is valid");
			} else {
				System.out.println("floor is invalid");
			}

			int number = dto.getNumber();
			if (AddressUtil.validInt(number)) {
				validNumber = true;
				System.out.println("number is valid");
			} else {
				System.out.println("number is invalid");
			}

			String city = dto.getCity();
			if (AddressUtil.ValidString(city)) {
				validCity = true;
			}
			String state = dto.getState();
			if (AddressUtil.ValidString(state)) {
				validState = true;
				System.out.println("state is valid");
			} else {
				System.out.println("state is invalid");
			}

			if (AddressUtil.validFlags(validStreet, validArea, validPincode, validFloor, validNumber, validCity,
					validState)) {
				// isExist
				boolean temp = addRepo.saveDTO(dto);
				if (temp) {
					return true;
				} else {
					return false;
				}

			}
		} else {
			System.err.println("passing null dto");
			return false;
		}
		throw new DataValidException("data validation exception");
	}

	public int getTotal() {
		return addRepo.total();
	}

	public AddressDTO findByNumber(int number) throws DataValidException {
		if (AddressUtil.validInt(number)) {
			AddressDTO dto = addRepo.findByNumber(number);
			return dto;
		}
		throw new DataValidException("data validation exception by findByNumber()");
	}

	public boolean find(AddressDTO dto) throws DataValidException {
		if (dto != null) {
			if (addRepo.find(dto)) {
				return true;
			}
		}
		throw new DataValidException("DTO validation exception: passing null DTO");
	}

	public AddressDTO findByStreet(String street) throws DataValidException {
		if (AddressUtil.ValidString(street)) {
			AddressDTO dto = addRepo.findByStreet(street);
			return dto;
		}

		throw new DataValidException("data validation exception: passing invalid street");
	}

	public AddressDTO findByPinCode(int pinCode) throws DataValidException {

		if (AddressUtil.validInt(pinCode)) {
			return addRepo.findByPinCode(pinCode);
		}
		throw new DataValidException("data validation exception: passing invalid pin-code");
	}

	public AddressDTO findByStreetAndPinCodeAndArea(String street, int pincode, String Area) throws DataValidException {

		if (AddressUtil.ValidString(street) && AddressUtil.validInt(pincode) && AddressUtil.ValidString(Area)) {
			AddressDTO dto = addRepo.findByStreetAndPinCodeAndArea(street, pincode, Area);
			return dto;

		}
		throw new DataValidException("data validation exception: passing invalid street/pin-code/Area");
	}

	public AddressDTO findByCityAndState(String city, String state) throws DataValidException {
		if (AddressUtil.ValidString(city) && AddressUtil.ValidString(state)) {
			AddressDTO dto = addRepo.findByCityAndState(city, state);
			return dto;
		}
		throw new DataValidException("data validation exception: passing invalid city/state");
	}

	public String findFloorByNumber(int number) throws DataValidException {
		if (AddressUtil.validInt(number)) {
			String floor = addRepo.findFloorByNumber(number);
			return floor;
		}
		throw new DataValidException("data validation exception: passing invalid floor");
	}

	public String findCityByNumberAndFloorAndStreetAndPinCode(int number, String floor, String street, int pincode)
			throws DataValidException {
		if (AddressUtil.validInt(number) && AddressUtil.ValidString(floor) && AddressUtil.ValidString(street)
				&& AddressUtil.validInt(pincode)) {
			String city = addRepo.findCityByNumberAndFloorAndStreetAndPinCode(number, floor, street, pincode);
			return city;
		}
		throw new DataValidException("data validation exception: passing invalid number/floor/street/pin-code");
	}

	public int findPincodeByNumber(int number) throws DataValidException {
		if (AddressUtil.validInt(number)) {
			int pin = addRepo.findPincodeByNumber(number);
			return pin;
		}
		throw new DataValidException("data validation exception: passing invalid number");
	}
}
