package com.example.shobhana.nokia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.button1).setOnClickListener(handleClick);

	}

	private View.OnClickListener handleClick = new View.OnClickListener() {
		public void onClick(View arg0) {
			Button btn = (Button) arg0;
			Intent intent = new Intent(getApplicationContext(), DownloadActivity.class);
			startActivity(intent);

		}
	};
}
