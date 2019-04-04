package com.example.android.ordercoffeeapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 1;
    int basePriceForEachCup = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_value_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        // Find the user's name
        EditText customerName = (EditText) findViewById(R.id.customerName_edit_text);
        String customerNameValue = customerName.getText().toString();

        // Figure out if the user wants whipped cream topping
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whippedCream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        //Figure out if the user wants chocolate topping
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckBox.isChecked();

        // Calculate the total price for each cup of coffee
        int price = calculatePrice(hasWhippedCream, hasChocolate, quantity, basePriceForEachCup);

        // Create the order summary
        String priceMessage = createOrderSummary(customerNameValue, price, hasWhippedCream, hasChocolate);

        // Display the order summary
        displayMessage(priceMessage);
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Coffe Order for" + customerNameValue);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * Calculate the price of the order
     *
     * @param quantity    is the number of cups of coffee ordered
     * @param pricePerCup is the price of one cup of coffee
     * @price price returns the total price
     */
    private int calculatePrice(boolean addWhippedCream, boolean addChocolate, int quantity, int pricePerCup) {
        // Price of 1 cup of coffee
        int basePrice = pricePerCup;

        // Add $1 if the user wants whipped cream
        if (addWhippedCream == true) {
            basePrice = basePrice + 1;
        }

        // Add $2 if user wants chocolate
        if (addChocolate == true) {
            basePrice = basePrice + 2;
        }

        // Calculate the total order price by multiplying by quantity
        return basePrice * quantity;
    }

    /**
     * Shows the order summary
     *
     * @param price           calculated price
     * @param addWhippedCream returns the boolean value whether whipped cream is added
     * @param addChocolate    returns the boolean value whether chocolate is added
     */
    private String createOrderSummary(String customerName, int price, boolean addWhippedCream, boolean addChocolate) {
        String priceMessage = getString(R.string.order_summary_name, customerName);
        priceMessage += "\n" + getString(R.string.order_summary_whipped_cream, addWhippedCream);
        priceMessage += "\n" + getString(R.string.order_summary_chocolate, addChocolate);
        priceMessage += "\n" + getString(R.string.order_summary_quantity, quantity);
        priceMessage += "\n" + getString(R.string.order_summary_price, NumberFormat.getCurrencyInstance().format(price));
        priceMessage += "\n" + getString(R.string.thankYou);
        return priceMessage;
    }


    /**
     * This method increments the quantity value.
     */
    public void increment(View view) {
        if (quantity == 100) {
            Toast.makeText(this, "You cannot order more than 100 coffees", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method decrement the quantity value.
     */
    public void decrement(View view) {
        if (quantity == 1) {
            Toast.makeText(this, "You cannot order less than 1 coffees", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        display(quantity);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

}