package ru.startandroid.p0102activitilist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

        k1.setOnClickListener(oclk);
        k2.setOnClickListener(oclk);
        k3.setOnClickListener(oclk);
    }

    View.OnClickListener oclk = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.key1:
                    tv1.setText("nagata1");
                    tv2.setText("1234");
                    break;
                case R.id.key2:
                    tv1.setText("nagata2");
                    tv2.setText("nagata2");
                    break;
                case R.id.key3:
                    tv2.setText("nagata3");
                    tv1.setText("nagata3");
                    break;
            }
        }

    };

}
