package com.example.LibraryModel.service;

import com.example.LibraryModel.model.libraryModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class libraryService {
    private static List<libraryModel>  libraries = new ArrayList<libraryModel>();
    private static int libCount=0;
    static {
        libraries.add(new libraryModel(++libCount ,"Dinesh Library1","Bareilly","NON AC"));
        libraries.add(new libraryModel(++libCount ,"Dinesh Library2","Pilibhit","AC"));
        libraries.add(new libraryModel(++libCount ,"Dinesh Library3","Rudrapur","AC , WIFI"));
        libraries.add(new libraryModel(++libCount ,"Dinesh Library4","Haridwar","NON AC"));
        libraries.add(new libraryModel(++libCount ,"Dinesh Library5","Jaipur","NON AC"));

    }
    public List<libraryModel> findAll(){
        return libraries;
    }
    public List<String> findName(String search, List<String> list) {
        List<String> library = new ArrayList<String>();

        for(String str: list) {
            if (str.contains(search)) {
                library.add(str);
            }
        }

        return library;
    }
    public void addLib(libraryModel library){

        libraries.add(library);
    }

}
