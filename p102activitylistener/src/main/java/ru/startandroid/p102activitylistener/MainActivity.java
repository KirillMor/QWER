package ru.startandroid.p102activitylistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk, btnCancel, btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.btnStart); //кнопка присвоена через xml

        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    public void onClickSt (View V) {//запуск кнопки происходит через xml
        tvOut.setText("start");
        ;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnOk: //кнопка ОК
                tvOut.setText("нажата кнопка ОК");
                break;
            case R.id.btnCancel: //кнопка Cancel
                tvOut.setText("нажата кнопка Cansel");
                break;
        }
    }
}

