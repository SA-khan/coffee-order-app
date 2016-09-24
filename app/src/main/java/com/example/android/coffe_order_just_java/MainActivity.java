package com.example.android.coffe_order_just_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    TextView number_tv;
    TextView pricecalc_tv;
    public int quantity = 2;
    public int coffeCost = 5;
    public String mname = "Hassaan";
    public boolean hasWhippedCream;
    public boolean hasChocalate;
    public String username ;
    EditText nameEdittext;
    CheckBox whippedCreamCheckBox;
    CheckBox chocalateCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEdittext = (EditText)findViewById(R.id.usernameEdittext);
        whippedCreamCheckBox = (CheckBox)findViewById(R.id.whippedCreamCheckBox);
        chocalateCheckbox = (CheckBox)findViewById(R.id.chocalateCheckBox);

    }

    public void increment(View view)
    {

        if (quantity == 10)
        {
            return;
        }
        quantity++;
        display(quantity);
    }
    public void decrement(View view)
    {

        if (quantity == 1)
        {
            return;
        }
        quantity--;
        display(quantity);
    }
    public void submitOrder (View view)
    {
        hasWhippedCream = whippedCreamCheckBox.isChecked();
        hasWhippedCream = chocalateCheckbox.isChecked();
        username = nameEdittext.getText().toString();

        if (hasWhippedCream == true)
        {
            coffeCost = (coffeCost+10);
        }
        else if (hasChocalate == true)
        {
            coffeCost = (coffeCost+10);
        }
        else
            coffeCost = 5;

        display(quantity);
        int calc = quantity * coffeCost;
        displayPrice(calc);
    }
    public void display(int number)
    {
        number_tv = (TextView)findViewById(R.id.numberTextview);
        number_tv.setText("" + number);
    }
    public void displayPrice(int number)
    {
        pricecalc_tv = (TextView)findViewById(R.id.pricecalc_textview);
        pricecalc_tv.setText("Name: "+username + "\nQuantity: " +quantity + "\nHas Whipped Cream ? "+hasWhippedCream+ "\n" + NumberFormat.getCurrencyInstance().format(number) + "\nThankYou");
    }
}
