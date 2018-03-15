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
public class Project {
    private int penalty;
    private String country_name;
    private ArrayList<Integer> units;

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public ArrayList<Integer> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<Integer> units) {
        this.units = units;
    }
    
    
}
