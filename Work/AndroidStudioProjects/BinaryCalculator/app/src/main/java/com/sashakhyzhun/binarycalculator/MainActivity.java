package com.sashakhyzhun.binarycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	ViewController controller = new ViewController();
	Conversion conversion = new Conversion();
	
	public enum mode {
		DECIMAL, BINARY, OCTAL, HEXADECIMAL
	}

	private static mode option;
	
	public static mode getOption() {
		return option;
	}

	public void setOption(mode op) {
		option = op;
		
		switch(option){
			case BINARY:
				controller.activateBinary(this);
				controller.deactivateLetters(this);
				break;
			case DECIMAL:
				controller.activateNumbers(this);
				controller.deactivateLetters(this);
				break;
			case OCTAL:
				controller.activateOctal(this);
				controller.deactivateLetters(this);
				break;
			case HEXADECIMAL:
				controller.activateNumbers(this);
				controller.activateLetters(this);
				break;
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView textResult = (TextView) findViewById(R.id.textResult);
		Button btn = (Button) findViewById(R.id.buttonDecimal);
		btn.setEnabled(false);
		textResult.setText("0");

		setOption(mode.DECIMAL);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * SET DECIMAL
	 */
	
	public void setDecimal(View view) {
		controller.changeOptions((Button)findViewById(R.id.buttonDecimal), this);
		TextView textResult = (TextView) findViewById(R.id.textResult);
		String str = (String) textResult.getText();
		
		switch(option) {
			case BINARY:
				textResult.setText(Long.toString(conversion.converterBinaryParaDecimal(str)));
				break;
			case OCTAL:
				textResult.setText(Long.toString(conversion.converterOctalParaDecimal(str)));
				break;
			case HEXADECIMAL:
				textResult.setText(Long.toString(conversion.converterHexadecimalParaDecimal(str)));
				break;
		}
		
		setOption(mode.DECIMAL);
	}

	/**
	 * SET BINARY
	 */
	
	public void setBinary(View view) {
		controller.changeOptions((Button)findViewById(R.id.buttonBinary), this);
		TextView textResult = (TextView) findViewById(R.id.textResult);
		String str = (String) textResult.getText();
		
		switch(option){
			case DECIMAL:
				textResult.setText(conversion.converterDecimalParaBinary(Long.parseLong(str)));
				break;
			case OCTAL:
				textResult.setText(conversion.converterOctalParaBinary(str));
				break;
			case HEXADECIMAL:
				textResult.setText(conversion.converterHexadecimalParaBinario(str));
				break;
		}
		
		setOption(mode.BINARY);
		
	}
	
	/**
	 * SET OCTAL
	 */

	public void setOctal(View view) {
		controller.changeOptions((Button)findViewById(R.id.buttonOctal), this);
		TextView textResult = (TextView) findViewById(R.id.textResult);
		String str = (String) textResult.getText();
		
		switch(option){
			case BINARY:
				textResult.setText(conversion.converterBinaryParaOctal(str));
				break;
			case DECIMAL:
				textResult.setText(conversion.converterDecimalParaOctal(Long.parseLong(str)));
				break;
			case HEXADECIMAL:
				textResult.setText(conversion.converterHexadecimalParaOctal(str));
				break;
		}
		
		setOption(mode.OCTAL);
		
	}
	
	/**
	 * SET HEXADECIMAL
	 */

	public void setHexadecimal(View view) {
		controller.changeOptions((Button)findViewById(R.id.buttonHexadecimal), this);
		TextView textResult = (TextView) findViewById(R.id.textResult);
		String str = (String) textResult.getText();
		
		switch(option) {
			case BINARY:
				textResult.setText(conversion.converterBinaryParaHexadecimal(str));
				break;
			case DECIMAL:
				textResult.setText(conversion.converterDecimalParaHexadecimal(Long.parseLong(str)));
				break;
			case OCTAL:
				textResult.setText(conversion.converterOctalParaHexadecimal(str));
				break;
		}

		setOption(mode.HEXADECIMAL);
	
	}
	
	/**
	 * CLEAR TEXT VIEW
	 */
	
	public void clearTextView(View view){
		TextView textResult = (TextView) findViewById(R.id.textResult);
		textResult.setText("0");
	}
	
	/**
	 * CLEAR CHARACTER
	 */

	public void clearCharacter(View view) {
		TextView textResult = (TextView) findViewById(R.id.textResult);
	    String str = (String) textResult.getText();
	    
	    if (str.length() == 1){
	    	textResult.setText("0");
	    }else{
	    	textResult.setText(str.substring(0, -1 + str.length()));
	    }
	}
	
	/**
	 * SET VALOR
	 */
	
	public void onClick(View v){
		Button b = (Button)v;
	    String buttonText = b.getText().toString();
	    TextView textResult = (TextView) findViewById(R.id.textResult);
	    String str = (String) textResult.getText();
	    
	    if (str.startsWith("0")) {
	    	textResult.setText(buttonText);
	    } else {
	    	//textResult.setText(str = str.concat(buttonText));
	    	if (str.length() < 13) {
	    		textResult.setText(str = str.concat(buttonText));
	    	}	
	    }
	}
}