/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Region {
    private String region_name;
    private int available_packages;
    private double package_unit_cost;
    private ArrayList<Integer> unit_of_service_per_pack;
    private ArrayList<Integer> latency_per_country;

    public int getAvailable_packages() {
        return available_packages;
    }

    public void setAvailable_packages(int available_packages) {
        this.available_packages = available_packages;
    }

    public double getPackage_unit_cost() {
        return package_unit_cost;
    }

    public void setPackage_unit_cost(double package_unit_cost) {
        this.package_unit_cost = package_unit_cost;
    }

    public ArrayList<Integer> getUnit_of_service_per_pack() {
        return unit_of_service_per_pack;
    }

    public void setUnit_of_service_per_pack(ArrayList<Integer> unit_of_service_per_pack) {
        this.unit_of_service_per_pack = unit_of_service_per_pack;
    }

    public ArrayList<Integer> getLatency_per_country() {
        return latency_per_country;
    }

    public void setLatency_per_country(ArrayList<Integer> latency_per_country) {
        this.latency_per_country = latency_per_country;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }


    
}
