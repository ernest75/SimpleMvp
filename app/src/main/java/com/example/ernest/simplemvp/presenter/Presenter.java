package com.example.ernest.simplemvp.presenter;

import android.view.View;

import com.example.ernest.simplemvp.contract.Contract;
import com.example.ernest.simplemvp.model.Model;

/**
 * Created by Ernest on 22/11/2017.
 */

public class Presenter implements Contract.Presenter {

    private Contract.View mView;
    private Model mModel;

    public Presenter(Contract.View view){
        mView = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new Model();
        mView.initUI();
    }

    @Override
    public void onClick(View view) {
        String data = mModel.getData();
        mView.setViewData(data);

    }
}
