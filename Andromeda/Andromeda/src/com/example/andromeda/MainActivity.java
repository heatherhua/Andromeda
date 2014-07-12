package com.example.andromeda;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.example.andromeda.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	/* Called when user clicks submit question button */
	public void sendQuestion(View view){
		Intent intent = new Intent(this, AnswerQuestionActivity.class);
		EditText editText = (EditText) findViewById(R.id.user_question);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
	    startActivity(intent);

	}

}
