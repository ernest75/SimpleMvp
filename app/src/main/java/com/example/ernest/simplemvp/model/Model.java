package com.example.ernest.simplemvp.model;

import com.example.ernest.simplemvp.contract.Contract;

/**
 * Created by Ernest on 21/11/2017.
 */

public class Model implements Contract.Model {

    public Model(){

    }

    @Override
    public String getData() {
        String text = "Text Changed";
        return text;
    }
}
