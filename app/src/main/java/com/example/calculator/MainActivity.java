package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private ActivityMainBinding binding;
    private float valueOne = Float.NaN;
    private float valueTwo;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision;

    //DecimalFormat decimalFormat = new DecimalFormat("#.##########");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.editText);

        final Button buttonZero = (Button) findViewById(R.id.buttonZero);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform action on click
                System.out.println("0");
                editText.setText(editText.getText() + "0");
            }
        });

        final Button buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform action on click
                System.out.println("1");
                editText.setText(editText.getText() + "1");
            }
        });

        final Button buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform action on click
                System.out.println("2");
                editText.setText(editText.getText() + "2");
            }
        });

        final Button buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform action on click
                System.out.println("3");
                editText.setText(editText.getText() + "3");
            }
        });

        final Button buttonFour = (Button) findViewById(R.id.buttonFour);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform action on click
                System.out.println("4");
                editText.setText(editText.getText() + "4");
            }
        });

        final Button buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform action on click
                System.out.println("5");
                editText.setText(editText.getText() + "5");
            }
        });

        final Button buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform action on click
                System.out.println("6");
                editText.setText(editText.getText() + "6");
            }
        });

        final Button buttonSeven = (Button) findViewById(R.id.buttonSeven);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform action on click
                System.out.println("7");
                editText.setText(editText.getText() + "7");
            }
        });

        final Button buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform action on click
                System.out.println("8");
                editText.setText(editText.getText() + "8");
            }
        });

        final Button buttonNine = (Button) findViewById(R.id.buttonNine);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform action on click
                System.out.println("9");
                editText.setText(editText.getText() + "9");
            }
        });

        final Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Add");
                if (editText == null){
                    editText.setText("");

                }else {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    mAddition = true;
                    editText.setText(null);
                }
            }
        });

        final Button buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Subtract");
                valueOne = Float.parseFloat(editText.getText() + "");
                mSubtract = true ;
                editText.setText(null);
            }
        });

        final Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Multiply");
                valueOne = Float.parseFloat(editText.getText() + "");
                mMultiplication = true ;
                editText.setText(null);
            }
        });

        final Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Divide");
                valueOne = Float.parseFloat(editText.getText()+"");
                mDivision = true ;
                editText.setText(null);
            }
        });

        final Button buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(editText.getText() + "");

                if (mAddition == true){

                    editText.setText(valueOne + valueTwo +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    editText.setText(valueOne - valueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    editText.setText(valueOne * valueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    editText.setText(valueOne / valueTwo+"");
                    mDivision=false;
                }
            }
        });

        final Button buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        final Button buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
            }
        });
    }
}
