package xditya.me;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etDetails1, etDetails2;
    Button btnSubmit;
    TextView tvPrint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDetails1 = findViewById(R.id.num_1);
        etDetails2 = findViewById(R.id.num_2);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvPrint = findViewById(R.id.tvPrint);

        tvPrint.setVisibility(View.GONE);   // hide Text View until results are generated.

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp1 = etDetails1.getText().toString();
                String temp2 = etDetails2.getText().toString();

                if (temp1.isEmpty() || temp2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter values in all fields!", Toast.LENGTH_SHORT).show();
                    return;
                }

                String num1 = temp1.trim();
                String num2 = temp2.trim();
                // find sum

                int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
                String output = "The sum of " + num1 + " and " + num2 + " is " + sum;

                tvPrint.setText(output);

                tvPrint.setVisibility(View.VISIBLE);

            }
        });
    }
}