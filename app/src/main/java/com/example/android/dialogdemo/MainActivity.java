package com.example.android.dialogdemo;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  Dialog mDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {

        mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.dialoglayout);
        TextView ok,cancel;
        ok=(TextView) mDialog.findViewById(R.id.dialogyes);
        cancel=(TextView) mDialog.findViewById(R.id.dialogno);
        ok.setOnClickListener(new  View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mDialog.cancel();

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                mDialog.cancel();
            }
        });
        mDialog.show();


    }
}
