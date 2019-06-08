package com.example.conversorcb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton rdC,rdF,rdK,rdR;
    CheckBox ckC,ckF,ckR,ckK;
    EditText cajaC,cajaR,cajaF,cajaK,cajaConver;
    double temp,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdC = findViewById(R.id.rdC);
        rdF = findViewById(R.id.rdF);
        rdK = findViewById(R.id.rdK);
        rdR = findViewById(R.id.rdR);

        ckC = findViewById(R.id.ckC);
        ckF = findViewById(R.id.ckF);
        ckK = findViewById(R.id.ckK);
        ckR = findViewById(R.id.ckR);

        cajaConver = findViewById(R.id.cajaConvertir);



    }

    public void conversion(View v){
        if(rdC.isChecked()){
            switch (v.getId()){
                case R.id.ckC: cajaC.setText(cajaConver.getText());
                    break;
                case R.id.ckF:
                    temp=Double.parseDouble(String.valueOf(cajaConver.getText()));
                    res = (1.8*temp)+32;
                    cajaC.setText(String.valueOf(res));
                    break;
                case R.id.ckK:
                    temp=Double.parseDouble(String.valueOf(cajaConver.getText()));
                    res = temp+273.15;
                    cajaC.setText(String.valueOf(res));
                    break;
                case R.id.ckR:
                    temp=Double.parseDouble(String.valueOf(cajaConver.getText()));
                    res = (1.8*temp)+32;
                    res = res + 459.67;
                    cajaC.setText(String.valueOf(res));
                    break;
            }
        }
        else if(rdF.isChecked()){
            switch (v.getId()){
                case R.id.ckC:
                    temp=Double.parseDouble(String.valueOf(cajaConver.getText()));
                    res = (temp-32)/1.8;
                    cajaF.setText(String.valueOf(res));
                    break;
                case R.id.ckF:
                    cajaF.setText(cajaConver.getText());
                    break;
                case R.id.ckK:
                    temp=Double.parseDouble(String.valueOf(cajaConver.getText()));
                    res = (temp+459.67)/1.8;
                    cajaF.setText(String.valueOf(res));
                    break;
                case R.id.ckR:
                    temp=Double.parseDouble(String.valueOf(cajaConver.getText()));
                    res = temp+459.67;
                    cajaF.setText(String.valueOf(res));
                    break;
            }
        }
        else if(rdK.isChecked()){
            switch (v.getId()){
                case R.id.ckC:
                    temp=Double.parseDouble(String.valueOf(cajaConver.getText()));
                    res = (temp*1.8)+32;
                    res = (res+459.67)/1.8;
                    cajaK.setText(String.valueOf(res));
                    break;
                case R.id.ckF:
                    res = (temp+459.67)/1.8;
                    break;
                case R.id.ckK:
                    cajaK.setText(cajaConver.getText());
                    break;
                case R.id.ckR:
                    temp=Double.parseDouble(String.valueOf(cajaConver.getText()));
                    res = (temp*1.8)-459.67;
                    res = res +459.67;
                    cajaK.setText(String.valueOf(res));
                    break;
            }
        }
        else if(rdR.isChecked()){
            switch (v.getId()){
                case R.id.ckC:
                    temp=Double.parseDouble(String.valueOf(cajaConver.getText()));
                    res = temp-459.67;
                    res = (res-32)/1.8;
                    cajaR.setText(String.valueOf(res));
                    break;
                case R.id.ckF:
                    temp=Double.parseDouble(String.valueOf(cajaConver.getText()));
                    res = temp - 459.67;
                    cajaR.setText(String.valueOf(res));
                    break;
                case R.id.ckK:
                    temp=Double.parseDouble(String.valueOf(cajaConver.getText()));
                    res = temp - 459.67;
                    res = (res + 459.67)/1.8;
                    cajaR.setText(String.valueOf(res));
                    break;
                case R.id.ckR:
                    cajaR.setText(cajaConver.getText());
                    break;
            }
        }

    }
}