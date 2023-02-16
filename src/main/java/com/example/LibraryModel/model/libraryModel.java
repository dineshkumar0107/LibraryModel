package com.example.LibraryModel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class libraryModel {
    private int libNumber;
    private String libName;
    private String libAddress;

    private  String libFacility;


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
