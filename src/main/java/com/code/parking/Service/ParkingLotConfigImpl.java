package com.code.parking.Service;

public class ParkingLotConfigImpl {

    public static ParkingLotConfig getParkingLotConfig(String instruction) throws Exception {

        if (instruction.contains("Create_parking_lot")) {
            return new ParkingLotCreateService();
        } else if (instruction.contains("Park")) {
            return new ParkingService();
        } else if (instruction.contains("Leave")) {
            return new LeaveService();
        } else if (instruction.contains("Slot_number_for_car_with_number")) {
            return new SlotNumberForcarWithNumber();
        } else if (instruction.contains("Slot_numbers_for_driver_of_age")) {
            return new SlotNumbersForDriverOfAge();
        } else if (instruction.contains("Vehicle_registration_number_for_driver_of_age")) {
            return new VehicleRegistrationNumberForDriverOfAge();
        } else {
            throw new Exception("No instruction found.");
        }

    }
}
