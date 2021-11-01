package com.ualr.layoutassignment;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.layoutassignment.databinding.ActivityMainBinding;

import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    // TODO 02. Create a new method called "calculateTotal" for calculating the invoice's total amount of money

    // TODO 03. Bind the "calculateTotal" method to the button with the "CALCULATE TOTAL" label

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public float calculateTotal(View view) {
       //need binding to work to do this i think
        //check if checkbox chedked and add to total
        int totalCost = 0;

        //see if checkbox is checked, if it is then convert the value from the corresponding decimal box to float and add it

        /*
        if(checkBox.isChecked()){
            totalCost += Float.parseFloat(editTextNumberDecimal.getText().toString());
        }

        if(checkBox2.isChecked()){
            totalCost += Float.parseFloat(editTextNumberDecimal2.getText().toString());
        }

        if(checkBox3.isChecked()){
            totalCost += Float.parseFloat(editTextNumberDecimal3.getText().toString());
        }

        if(checkBox4.isChecked()){
            totalCost += Float.parseFloat(editTextNumberDecimal4.getText().toString());
        }
        */
        return totalCost;
    }
}