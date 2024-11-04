//package com.yearup;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//public class ContractFileManager {
//    private List<Vehicle> inventory = new ArrayList<>();
//    private List<Contract> contracts = new ArrayList<>();
//
//
//    // Method to update inventory.csv
//    public void updateInventoryFile() {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("inventory.csv"))) {
//            for (Vehicle vehicle : inventory) {
//                writer.write(vehicle.getVin() + "," + vehicle.getMake() + "," + vehicle.getModel() + "," + vehicle.isAvailable());
//                writer.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Method to add a new contract and update contract.csv
//    public void addContract(Contract contract) {
//        contracts.add(contract);
//        updateContractFile();
//    }
//
//    private void updateContractFile() {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contract.csv"))) {
//            for (Contract contract : contracts) {
//                writer.write(contract.getVin() + "," + contract.getCustomerName() + "," + contract.getContractType() + "," + contract.getContractDate());
//                writer.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Method to process a sale or lease
//    public void processTransaction(String vin, String customerName, String contractType, String contractDate) {
//        Vehicle vehicle = findVehicleByVin(vin);
//        if (vehicle != null && vehicle.isAvailable()) {
//            vehicle.setAvailable(false);
//            updateInventoryFile();
//
//            Contract contract = new Contract(vin, customerName, contractType, contractDate);
//            addContract(contract);
//        } else {
//            System.out.println("Vehicle not available or VIN not found.");
//        }
//    }
//}
