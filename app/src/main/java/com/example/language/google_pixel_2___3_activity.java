
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		google_pixel_2___3
	 *	@date 		Wednesday 01st of November 2023 05:40:10 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.language;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

	public class google_pixel_2___3_activity extends Activity {

	
	private View _bg__google_pixel_2___3_ek2;
	private TextView title;
	private View _bg__button_rounded_5_alert_true_default;
	private TextView text;
	private ImageView language;
	private TextView text_ek1;
	private View _bg__button_rounded_5_alert_true_default_1;
	private TextView text_ek2;
	private ImageView words;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private View _bg__button_rounded_5_alert_true_default_2;
	private TextView text_ek3;
	private ImageView test;
	private View _bg__button_rounded_5_alert_true_default_3;
	private TextView text_ek4;
	private ImageView rules;
	private Button button;

	private MonitoringBroadcastReceiver batteryLevelReceiver;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_pixel_2___3);

		
		_bg__google_pixel_2___3_ek2 = (View) findViewById(R.id._bg__google_pixel_2___3_ek2);
		title = (TextView) findViewById(R.id.title);
		_bg__button_rounded_5_alert_true_default = (View) findViewById(R.id._bg__button_rounded_5_alert_true_default);
		text = (TextView) findViewById(R.id.text);
		language = (ImageView) findViewById(R.id.language);
		text_ek1 = (TextView) findViewById(R.id.text_ek1);
		_bg__button_rounded_5_alert_true_default_1 = (View) findViewById(R.id._bg__button_rounded_5_alert_true_default_1);
		text_ek2 = (TextView) findViewById(R.id.text_ek2);
		words = (ImageView) findViewById(R.id.words);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		_bg__button_rounded_5_alert_true_default_2 = (View) findViewById(R.id._bg__button_rounded_5_alert_true_default_2);
		text_ek3 = (TextView) findViewById(R.id.text_ek3);
		test = (ImageView) findViewById(R.id.test);
		_bg__button_rounded_5_alert_true_default_3 = (View) findViewById(R.id._bg__button_rounded_5_alert_true_default_3);
		text_ek4 = (TextView) findViewById(R.id.text_ek4);
		rules = (ImageView) findViewById(R.id.rules);
		button = (Button ) findViewById(R.id._bg__button_rounded_5_lead_true_hover);


		_bg__button_rounded_5_alert_true_default_2 = findViewById(R.id._bg__button_rounded_5_alert_true_default_2);
		_bg__button_rounded_5_alert_true_default_2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(google_pixel_2___3_activity.this, google_pixel_2___7_activity.class);
				startActivity(intent);
			}
		});

		button = findViewById(R.id._bg__button_rounded_5_lead_true_hover);
		button.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				batteryLevelReceiver = new MonitoringBroadcastReceiver();
				IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
				registerReceiver(batteryLevelReceiver, filter);
			}
		});

	}
}
	
	