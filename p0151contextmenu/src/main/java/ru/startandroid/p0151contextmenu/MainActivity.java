package ru.startandroid.p0151contextmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvColor, tvSize;

    final int MENU_COLOR_RED    = 1;
    final int vtoroe_menu  = 2;
    final int MENU_COLOR_BLUE   = 3;

    final int MENU_SIZE_22 = 4;
    final int MENU_SIZE_26 = 5;
    final int MENU_SIZE_30 = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvColor = (TextView) findViewById(R.id.tvColor);
        tvSize = (TextView) findViewById(R.id.tvSize);

        //sozdanie kontekstnogo menu
        registerForContextMenu(tvColor);
        registerForContextMenu(tvSize);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {// sozdanie menu
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.tvColor:
                menu.add(0, MENU_COLOR_RED, 3, "Red");
                menu.add(0, 2, 2, "Green");
                menu.add(0, 3, 1, "Blue");
                break;
            case R.id.tvSize:
                menu.add(0, MENU_SIZE_22, 0, "22");
                menu.add(0, MENU_SIZE_26, 0, "26");
                menu.add(0, MENU_SIZE_30, 0, "30");
                break;
        }
    }
    public boolean onContextItemSelected(MenuItem item){ //присваев
        switch (item.getItemId()){
            case 1:
                tvColor.setTextColor(Color.RED);
                tvColor.setText("text color red");
                break;
            case vtoroe_menu:
                tvColor.setTextColor(Color.GREEN);
                tvColor.setText("text green");
                break;
            case MENU_COLOR_BLUE:
                tvColor.setTextColor(Color.BLUE);
                tvColor.setText("text blue");
                break;
            case 4:
                tvSize.setTextSize(22);
                tvSize.setText("razmer 22");
                break;
            case MENU_SIZE_26:
                tvSize.setTextSize(26);
                tvSize.setText("razmer 26");
                break;
            case MENU_SIZE_30:
                tvSize.setTextSize(30);
                tvSize.setText("razmer30");
                break;
        }
        return super.onContextItemSelected(item);
    }

    }

