package example.com.coffeeorderingapp;

import android.example.com.coffeeorderingapp.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public MainActivity(TextView mShowcount) {
        this.gratuity_view =gratuity_view;

    int numCoffee = 0;
    int coffeePrice = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        EditText gratuity_view = (EditText) gratuity_view.findViewById();

        if(gratuity_view.getText().length() > 0){
            double gratuity = Double.parseDouble(gratuity_view.getText().toString());
            displayPrice(numCoffee * coffeePrice + gratuity);
        }

        else {
            displayPrice(numCoffee * coffeePrice);
        }
    }


    public void increment(View view){
        numCoffee++;
        display(numCoffee);
    }

    public void decrement(View view){
        if(numCoffee>0){
            numCoffee--;
        }
        display(numCoffee);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) quantityTextView.findViewById();
        quantityTextView.setText("" + number);
    }

    private void displayPrice(double number){
        TextView priceTextView = (TextView) priceTextView.findViewById();
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayPrice(double number){
        TextView priceTextView = (TextView) priceTextView.findViewById();
        priceTextView.setText("Total: " + NumberFormat.getCurrencyInstance().format(number + "\nThank You!"));
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
}