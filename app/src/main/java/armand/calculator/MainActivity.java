package armand.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static String input = "0";
    private static String previousOperator = "+";
    private static int result = 0;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (TextView) findViewById(R.id.display);
        displayValue();
    }

    public void displayValue() {
         try {
             display.setText(Integer.toString(Integer.parseInt(input)));
         }
         catch(NumberFormatException nfe) {
             input = "0";
             result = 0;
             previousOperator = "+";
         }
    }

    public void zero(View view) {
        input += "0";
        displayValue();
    }

    public void one(View view) {
        input += "1";
        displayValue();
    }

    public void two(View view) {
        input += "2";
        displayValue();
    }

    public void three(View view) {
        input += "3";
        displayValue();
    }

    public void four(View view) {
        input += "4";
        displayValue();
    }

    public void five(View view) {
        input += "5";
        displayValue();
    }

    public void six(View view) {
        input += "6";
        displayValue();
    }

    public void seven(View view) {
        input += "7";
        displayValue();
    }

    public void eight(View view) {
        input += "8";
        displayValue();
    }

    public void nine(View view) {
        input += "9";
        displayValue();
    }

    public void plus(View view) {
        if (previousOperator.equals("+")) {
            result = result + Integer.parseInt(input);
        }
        else if (previousOperator.equals("-")) {
            result = result - Integer.parseInt(input);
        }
        else {
            result = Integer.parseInt(input);
        }
        previousOperator = "+";
        input = Integer.toString(result);
        displayValue();
        input = "0";
    }

    public void minus(View view) {
        if (previousOperator.equals("+")) {
            result = result + Integer.parseInt(input);
        }
        else if (previousOperator.equals("-")) {
            result = result - Integer.parseInt(input);
        }
        else {
            result = Integer.parseInt(input);
        }
        previousOperator = "-";
        input = Integer.toString(result);
        displayValue();
        input = "0";
    }

    public void equals(View view) {
        if (previousOperator.equals("+")) {
            result = result + Integer.parseInt(input);
        }
        else if (previousOperator.equals("-")) {
            result = result - Integer.parseInt(input);
        }
        else {
            result = Integer.parseInt(input);
        }
        previousOperator = "=";
        input = Integer.toString(result);
        displayValue();
    }

    public void clear(View view) {
        input = "0";
        result = 0;
        previousOperator = "+";
        displayValue();
    }
}
