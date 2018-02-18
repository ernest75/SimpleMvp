package com.example.ernest.simplemvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ernest.simplemvp.R;
import com.example.ernest.simplemvp.contract.Contract;
import com.example.ernest.simplemvp.contract.Contract.*;
import com.example.ernest.simplemvp.model.Model;
import com.example.ernest.simplemvp.presenter.Presenter;


public class MainActivity extends AppCompatActivity implements Contract.View {

    private TextView mTextView;
    private Button mButton;
    private Presenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new Presenter(this);

    }


    @Override
    public void initUI() {

        mButton = (Button)findViewById(R.id.btnChangeText);
        mTextView = (TextView) findViewById(R.id.tvTextToShow);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.onClick(view);
            }
        });

    }

    @Override
    public void setViewData(String data) {
        mTextView.setText(data);
    }
}
