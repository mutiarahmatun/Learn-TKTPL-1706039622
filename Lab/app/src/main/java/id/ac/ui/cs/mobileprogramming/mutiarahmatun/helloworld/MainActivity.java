package id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText mTemperatureInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTemperatureInput = (EditText) findViewById(R.id.main_temperature_input);

        //setting click listener to convert button
        findViewById(R.id.main_btn_convert).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_btn_convert:
                RadioButton celsiusButton = (RadioButton) findViewById(R.id.main_radio_celsius);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.main_radio_fahr);
                if (mTemperatureInput.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, getString(R.string.err_enter_valid_number),
                            Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(mTemperatureInput.getText().toString());
                if (celsiusButton.isChecked()) {
                    mTemperatureInput.setText(String
                            .valueOf(ConverterUtil.convertFahrenheitToCelcius(inputValue)));
                    celsiusButton.setChecked(false);
                    fahrenheitButton.setChecked(true);
                } else {
                    mTemperatureInput.setText(String
                            .valueOf(ConverterUtil.convertCelciusToFahrenheit(inputValue)));
                    fahrenheitButton.setChecked(false);
                    celsiusButton.setChecked(true);
                }

                break;
        }
    }
}