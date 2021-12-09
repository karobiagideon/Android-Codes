package com.example.tabledemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class TableActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_table);
        TableLayout tb = new TableLayout(this);
        tb.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT,
        		TableLayout.LayoutParams.MATCH_PARENT));
        
        TableRow row = new TableRow(this);
        TableRow row1 = new TableRow(this);
        row.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT,
        		TableLayout.LayoutParams.WRAP_CONTENT));
        row1.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT,
        		TableLayout.LayoutParams.WRAP_CONTENT));
        Button btnc = new Button(this);
               btnc.setText("clear");
        Button btn1 = new Button(this);
               btn1.setText("clear");
        Button btn2 = new Button(this);
               btn2.setText("clear");
               
          Button btnc1 = new Button(this);
               btnc1.setText("clear");
        Button btn4 = new Button(this);
               btn2.setText("clear");
        Button btn3 = new Button(this);
               btn3.setText("clear");
        
               row.addView(btnc1);
               row.addView(btn4);
               row.addView(btn3);
        row.addView(btn1);
        row.addView(btn2);
        row.addView(btnc);
        
        tb.
        tb.addView(row);
        tb.addView(row1);
        
        setContentView(tb);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.table, menu);
        return true;
    }
    
}
