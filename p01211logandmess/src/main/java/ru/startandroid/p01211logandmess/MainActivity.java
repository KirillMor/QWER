package ru.startandroid.p01211logandmess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvOut;
    Button btnOk, btnCancel;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // view elementy
        Log.d(TAG, "найдем View-элементы");
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        tvOut = (TextView) findViewById(R.id.tvOut);

        // prisvoenie obrabot4ika
        Log.d(TAG, "присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "по id определяем кнопку, вызвавшую этот обработчик");
        switch (v.getId()) {
            case R.id.btnOk: //кнопка ОК
                Log.d(TAG, "кнопка ОК");
                tvOut.setText("нажата кнопка ОК");
                Toast.makeText(this, "нажата кнопка ОК", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCancel: //кнопка Cancel
                Log.d(TAG, "кнопка Cancel");
                tvOut.setText("нажата кнопка Cansel");
                Toast.makeText(this, "нажата кнопка Cancel", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
