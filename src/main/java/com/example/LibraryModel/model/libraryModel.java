package com.example.LibraryModel.model;

import org.springframework.beans.factory.annotation.Autowired;

public class libraryModel {
    private int libNumber;
    private String libName;
    private String libAddress;

    private  String libFacility;

    public libraryModel(int libNumber, String libName, String libAddress, String libFacility) {
        this.libNumber = libNumber;
        this.libName = libName;
        this.libAddress = libAddress;
        this.libFacility = libFacility;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    public String getLibAddress() {
        return libAddress;
    }

    public void setLibAddress(String libAddress) {
        this.libAddress = libAddress;
    }

    public int getLibNumber() {
        return libNumber;
    }

    public void setLibNumber(int libNumber) {
        this.libNumber = libNumber;
    }

    public String getLibFacility() {
        return libFacility;
    }

    public void setLibFacility(String libFacility) {
        this.libFacility = libFacility;
    }

    @Override
    public String toString() {
        return "libraryModel{" +
                "libName='" + libName + '\'' +
                ", libAddress='" + libAddress + '\'' +
                ", libNumber=" + libNumber +
                ", libFacility='" + libFacility + '\'' +
                '}';
    }
}
