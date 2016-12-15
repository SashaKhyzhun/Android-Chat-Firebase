package com.sashakhyzhun.binarycalculator;

import android.app.Activity;
import android.content.Context;
import android.widget.Button;

public class ViewController {

	/**
	 * ENABLE BINARY
	 */
	
	public void activateBinary(Context ctx){
		Activity act = (Activity) ctx;
		
		//Numbers Binary
		Button button0 = (Button) act.findViewById(R.id.button0);
		button0.setEnabled(true);
		Button button1 = (Button) act.findViewById(R.id.button1);
		button1.setEnabled(true);
		
		//Numbers not Binary
		Button button2 = (Button) act.findViewById(R.id.button2);
		button2.setEnabled(false);
		Button button3 = (Button) act.findViewById(R.id.button3);
		button3.setEnabled(false);
		Button button4 = (Button) act.findViewById(R.id.button4);
		button4.setEnabled(false);
		Button button5 = (Button) act.findViewById(R.id.button5);
		button5.setEnabled(false);
		Button button6 = (Button) act.findViewById(R.id.button6);
		button6.setEnabled(false);
		Button button7 = (Button) act.findViewById(R.id.button7);
		button7.setEnabled(false);
		Button button8 = (Button) act.findViewById(R.id.button8);
		button8.setEnabled(false);
		Button button9 = (Button) act.findViewById(R.id.button9);
		button9.setEnabled(false);
	}
	
	/**
	 * ENABLE OCTAL
	 */
	
	public void activateOctal(Context ctx){
		Activity act = (Activity) ctx;
		
		//OCT NUMBERS
		Button button0 = (Button) act.findViewById(R.id.button0);
		button0.setEnabled(true);
		Button button1 = (Button) act.findViewById(R.id.button1);
		button1.setEnabled(true);
		Button button2 = (Button) act.findViewById(R.id.button2);
		button2.setEnabled(true);
		Button button3 = (Button) act.findViewById(R.id.button3);
		button3.setEnabled(true);
		Button button4 = (Button) act.findViewById(R.id.button4);
		button4.setEnabled(true);
		Button button5 = (Button) act.findViewById(R.id.button5);
		button5.setEnabled(true);
		Button button6 = (Button) act.findViewById(R.id.button6);
		button6.setEnabled(true);
		Button button7 = (Button) act.findViewById(R.id.button7);
		button7.setEnabled(true);
		
		//OCT NOT NUMBERS
		Button button8 = (Button) act.findViewById(R.id.button8);
		button8.setEnabled(false);
		Button button9 = (Button) act.findViewById(R.id.button9);
		button9.setEnabled(false);
	}
	
	/**
	 * ENABLE NUMBERS
	 */
	
	public void activateNumbers(Context ctx){
		Activity act = (Activity) ctx;
		
		//NUMBERS
		Button button0 = (Button) act.findViewById(R.id.button0);
		button0.setEnabled(true);
		Button button1 = (Button) act.findViewById(R.id.button1);
		button1.setEnabled(true);
		Button button2 = (Button) act.findViewById(R.id.button2);
		button2.setEnabled(true);
		Button button3 = (Button) act.findViewById(R.id.button3);
		button3.setEnabled(true);
		Button button4 = (Button) act.findViewById(R.id.button4);
		button4.setEnabled(true);
		Button button5 = (Button) act.findViewById(R.id.button5);
		button5.setEnabled(true);
		Button button6 = (Button) act.findViewById(R.id.button6);
		button6.setEnabled(true);
		Button button7 = (Button) act.findViewById(R.id.button7);
		button7.setEnabled(true);
		Button button8 = (Button) act.findViewById(R.id.button8);
		button8.setEnabled(true);
		Button button9 = (Button) act.findViewById(R.id.button9);
		button9.setEnabled(true);
	}
	
	/**
	 * Enable Letters
	 */
	
	public void activateLetters(Context ctx){
		Activity act = (Activity) ctx;
		
		//LETTERS
		Button buttonA = (Button) act.findViewById(R.id.buttonA);
		buttonA.setEnabled(true);
		Button buttonB = (Button) act.findViewById(R.id.buttonB);
		buttonB.setEnabled(true);
		Button buttonC = (Button) act.findViewById(R.id.buttonC);
		buttonC.setEnabled(true);
		Button buttonD = (Button) act.findViewById(R.id.buttonD);
		buttonD.setEnabled(true);
		Button buttonE = (Button) act.findViewById(R.id.buttonE);
		buttonE.setEnabled(true);
		Button buttonF = (Button) act.findViewById(R.id.buttonF);
		buttonF.setEnabled(true);
	}
	
	/**
	 * Disable Letters
	 */
	
	public void deactivateLetters(Context ctx){
		Activity act = (Activity) ctx;
		
		//LETTERS
		Button buttonA = (Button) act.findViewById(R.id.buttonA);
		buttonA.setEnabled(false);
		Button buttonB = (Button) act.findViewById(R.id.buttonB);
		buttonB.setEnabled(false);
		Button buttonC = (Button) act.findViewById(R.id.buttonC);
		buttonC.setEnabled(false);
		Button buttonD = (Button) act.findViewById(R.id.buttonD);
		buttonD.setEnabled(false);
		Button buttonE = (Button) act.findViewById(R.id.buttonE);
		buttonE.setEnabled(false);
		Button buttonF = (Button) act.findViewById(R.id.buttonF);
		buttonF.setEnabled(false);
	}
	
	/**
	 * CHANGE OPTION MODE
	 */
	
	public void changeOptions(Button b, Context ctx){
		Activity act = (Activity) ctx;
	    b.setEnabled(false);
	    MainActivity.mode localMode = MainActivity.getOption();
	    switch (localMode){
	    case DECIMAL:
	    	act.findViewById(R.id.buttonDecimal).setEnabled(true);
	    	break;
	    case BINARY:
	    	act.findViewById(R.id.buttonBinary).setEnabled(true);
	    	break;
	    case OCTAL:
	    	act.findViewById(R.id.buttonOctal).setEnabled(true);
	    	break;
	    case HEXADECIMAL:
	    	act.findViewById(R.id.buttonHexadecimal).setEnabled(true);
	    	break;
	    }
	}
}