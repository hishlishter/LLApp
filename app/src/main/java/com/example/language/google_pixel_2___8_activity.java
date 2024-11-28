
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		google_pixel_2___8
	 *	@date 		Wednesday 01st of November 2023 05:50:43 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.language;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

	public class google_pixel_2___8_activity extends Activity {

	
	private View _bg__google_pixel_2___8_ek2;
	private TextView title;
	private ImageView undo;
	private View _bg__button_rounded_5_lead_true_hover_ek1;
	private TextView text;
	private TextView caption;
	private ImageView image_3;
	private int answer;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_pixel_2___8);

		Intent intent = getIntent();
		answer = intent.getIntExtra("результат", 0);

		_bg__google_pixel_2___8_ek2 = (View) findViewById(R.id._bg__google_pixel_2___8_ek2);
		title = (TextView) findViewById(R.id.title);
		undo = (ImageView) findViewById(R.id.undo);
		_bg__button_rounded_5_lead_true_hover_ek1 = (View) findViewById(R.id._bg__button_rounded_5_lead_true_hover_ek1);
		text = (TextView) findViewById(R.id.text);
		caption = (TextView) findViewById(R.id.caption);
		image_3 = (ImageView) findViewById(R.id.image_3);

		if (answer == 1) {
			image_3.setImageResource(R.drawable.doshik);
			caption.setText("1/5 правильных. Ну когда Вас уже заварят? Вы доширак!");
		}
		else if (answer == 2) {
			image_3.setImageResource(R.drawable.mouse);
			caption.setText("2/5 правильных. Что Вы там пищите? Вы мышак!");
		}
		else if (answer == 3) {
			image_3.setImageResource(R.drawable.benz);
			caption.setText("3/5 правильных. Вас просто ещё не завели! Вы бензопила!");
		}
		else if (answer == 4) {
			image_3.setImageResource(R.drawable.car);
			caption.setText("4/5 правильных. Хороший результат! Вы грузовик!");
		}
		else if (answer == 5) {
			image_3.setImageResource(R.drawable.image_3);
			caption.setText("5/5 правильных. Отличный результат! Вы силак!");
		}
		else {
			image_3.setImageResource(R.drawable.microb);
			caption.setText("0/5 правильных. Вас не видно. Вы микроб!");
		}

		undo = findViewById(R.id.undo);
		undo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(google_pixel_2___8_activity.this, google_pixel_2___7_activity.class);
				startActivity(intent);
			}
		});

		_bg__button_rounded_5_lead_true_hover_ek1 = findViewById(R.id._bg__button_rounded_5_lead_true_hover_ek1);
		_bg__button_rounded_5_lead_true_hover_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(google_pixel_2___8_activity.this, google_pixel_2___3_activity.class);
				startActivity(intent);
			}
		});
		//custom code goes here
	
	}
}
	
	