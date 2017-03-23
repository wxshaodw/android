package com.example.ex4_201435020225_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1=(Button)findViewById(R.id.register);
        bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(MainActivity.this,Pro4_201435020225_2Activity.class);
				startActivity(intent);
				// TODO Auto-generated method stub
				
			}
		});
    }
}