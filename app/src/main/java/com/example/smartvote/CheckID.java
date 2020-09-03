package com.example.smartvote;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CheckID extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_i_d);
        final EditText idEditText = findViewById(R.id.ID_edit_text);
        Button checkButton = findViewById(R.id.check_button);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ID = idEditText.getText().toString();
                String ID1 = "1111111111111", ID2 = "2222222222222";

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(CheckID.this);
                alertDialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                alertDialog.setPositiveButton("OK",null);

                if(ID.length()<13){
                    Toast t = Toast.makeText(CheckID.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                    t.show();
                }else if(ID.equals(ID1) || ID.equals(ID2)){
                    alertDialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                    alertDialog.show();
                }else{
                    alertDialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                    alertDialog.show();
                }
            }
        });
    }
}