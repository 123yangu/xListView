package com.leochin.uistudy;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    private View view;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        RelativeLayout layout = (RelativeLayout) findViewById(R.id.main_container);
//        layout.getParent();

//        LayoutInflater inflater = LayoutInflater.from(this);
////        RelativeLayout layout = (RelativeLayout) findViewById(R.id.main_container);
////        RelativeLayout layout = new RelativeLayout(this);
//        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.activity_main, null);
//        Button button = (Button) inflater.inflate(R.layout.activity_button, null);
//        layout.addView(button);
//        setContentView(layout);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
