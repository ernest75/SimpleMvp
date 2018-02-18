package com.example.ernest.simplemvp.contract;

import android.view.View;

/**
 * Created by Ernest on 22/11/2017.
 */

public interface Contract {

    interface View{

        public void initUI();
        public void setViewData(String data);
    }

    interface Presenter{

        public void onClick(android.view.View view);

    }

    interface Model{

        public String getData();
    }
}
