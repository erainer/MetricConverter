package net.androidbootcamp.metricconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String groupChoice;
    double totalAmount;
    double convertedAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner group = (Spinner) findViewById(R.id.metricTypes);
        final EditText amount = (EditText) findViewById(R.id.numToConvert);
        final Button converterBtn = (Button) findViewById(R.id.btnConvert);
        final TextView result = (TextView) findViewById(R.id.result);

        converterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groupChoice = group.getSelectedItem().toString();
                totalAmount = Integer.parseInt(amount.getText().toString());
                switch(groupChoice){
                    case "Feet to Inches":
                        convertedAmount =  totalAmount * 12;
                        result.setText(convertedAmount + " inches");
                        break;
                    case "Inches to Feet":
                        convertedAmount =  totalAmount / 12;
                        result.setText(convertedAmount + " feet");
                        break;
                    case "Yards to Feet":
                        convertedAmount =  totalAmount * 3;
                        result.setText(convertedAmount + " feet");
                        break;
                    case "Yards to Inches":
                        convertedAmount =  totalAmount * 36;
                        result.setText(convertedAmount + " inches");
                        break;
                    case "Miles to Feet":
                        convertedAmount = totalAmount * 5280;
                        result.setText(convertedAmount + " feet");
                            break;
                    case "Fahrenheit to Celsius":
                        convertedAmount =  (totalAmount - 32) * .5556;
                        result.setText(convertedAmount + " celcius");
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
