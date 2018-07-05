package ru.startandroid.p0102activitylistener3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    TextView tv1, tv2;
    Button k1, k2, k3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tvOut1);
        tv2 = (TextView) findViewById(R.id.tvOut2);
        k1 = (Button) findViewById(R.id.key1);
        k2 = (Button) findViewById(R.id.key2);
        k3 = (Button) findViewById(R.id.key3);

        k1.setOnClickListener(this);
        k2.setOnClickListener(this);
        k3.setOnClickListener(this);
    }
    public void onClick (View v) {
        switch (v.getId()){
            case R.id.key1:
                tv1.setText("12");
                tv2.setText("asd");
                break;
            case R.id.key2:
                tv1.setText("123");
                tv2.setText("Guzov durak");
                break;
            case R.id.key3:
                tv1.setText("345");
                tv2.setText("kak zaebal etot guzov");
        }
    }
}
