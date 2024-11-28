
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		google_pixel_2___1
	 *	@date 		Wednesday 01st of November 2023 05:39:08 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.language;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;

public class google_pixel_2___1_activity extends Activity {

	
	private View _bg__google_pixel_2___1_ek2;
	private View _bg__text_field_outlined_ek1;
	private View outline;
	private View _bg__account_ek1;
	private ImageView vector;
	private EditText placeholder_text;
	private View _bg__text_field_outlined_ek3;
	private View outline_ek1;
	private EditText placeholder_text_ek1;
	private View _bg__button_rounded_5_lead_true_hover;
	private TextView text;
	private TextView title;
	private TextView caption;

	private String login;
	private String password;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_pixel_2___1);
		_bg__google_pixel_2___1_ek2 = (View) findViewById(R.id._bg__google_pixel_2___1_ek2);
		_bg__text_field_outlined_ek1 = (View) findViewById(R.id._bg__text_field_outlined_ek1);
		outline = (View) findViewById(R.id.outline);
		_bg__account_ek1 = (View) findViewById(R.id._bg__account_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		placeholder_text = (EditText) findViewById(R.id.placeholder_text);
		_bg__text_field_outlined_ek3 = (View) findViewById(R.id._bg__text_field_outlined_ek3);
		outline_ek1 = (View) findViewById(R.id.outline_ek1);
		placeholder_text_ek1 = (EditText) findViewById(R.id.placeholder_text_ek1);
		_bg__button_rounded_5_lead_true_hover = (View) findViewById(R.id._bg__button_rounded_5_lead_true_hover);
		text = (TextView) findViewById(R.id.text);
		title = (TextView) findViewById(R.id.title);
		caption = (TextView) findViewById(R.id.caption);

		_bg__button_rounded_5_lead_true_hover = findViewById(R.id._bg__button_rounded_5_lead_true_hover);
		_bg__button_rounded_5_lead_true_hover.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (AuthUtil.loginValidation("JD921L","12345678")) {
					Toast.makeText(google_pixel_2___1_activity.this, "Кнопка нажата", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(google_pixel_2___1_activity.this, google_pixel_2___3_activity.class);
					startActivity(intent);
				} else
					Toast.makeText(google_pixel_2___1_activity.this, "Неверная почта или пароль", Toast.LENGTH_SHORT).show();
			}
		});

	}

	public static class AuthUtil {
		public static boolean loginValidation(String login, String password) {
			// Проверяем, соответствуют ли введенные данные заданным значениям
			return login.equals("JD921L") && password.equals("12345678");
		}
	}
}
	
	