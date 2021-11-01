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

    public void calculateTotal(View view) {
       //need binding to work to do this i think
        //check if checkbox checked and add to total
        int totalCost = 0;

        //see if checkbox is checked, if it is then convert the value from the corresponding decimal box to float and add it


        if(binding.checkBox.isChecked()){
            totalCost += Float.parseFloat(binding.editTextNumberDecimal.getText().toString());
        }

        if(binding.checkBox2.isChecked()){
            totalCost += Float.parseFloat(binding.editTextNumberDecimal2.getText().toString());
        }

        if(binding.checkBox3.isChecked()){
            totalCost += Float.parseFloat(binding.editTextNumberDecimal3.getText().toString());
        }

        if(binding.checkBox4.isChecked()){
            totalCost += Float.parseFloat(binding.editTextNumberDecimal4.getText().toString());
        }

        //update textView3 to show the final cost
        binding.textView3.setText(totalCost);
    }
}