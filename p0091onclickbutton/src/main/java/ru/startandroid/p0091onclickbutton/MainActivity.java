package ru.startandroid.p0091onclickbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnOk, btnCancel;
    TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //menuaem tekst
                tvOut.setText ("нажата кнопка ок");
            }

        };

        View.OnClickListener oclbtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("нажата кнопка кансл");
            }
        };

        btnOk.setOnClickListener(oclBtnOk);
        btnCancel.setOnClickListener(oclbtnCancel);
                 }
}
