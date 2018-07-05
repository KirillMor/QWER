package ru.startandroid.p0102activitylistener2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView wd;
    Button bt1, bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wd = (TextView) findViewById(R.id.Window);
        bt1 = (Button) findViewById(R.id.Key1);
        bt2 = (Button) findViewById(R.id.key2);
        bt3 = (Button) findViewById(R.id.key3);
    }


    public void Onclick1(View v) {
        wd.setText("qwer");
        ;
    }
        public void Onclick2 (View v){
        wd.setText("dva");
;}
        public void Onclick3 (View v){
        wd.setText("tri");

 ;
    }
}
