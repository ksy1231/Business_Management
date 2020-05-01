package org.techtown.business_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        Button customerGoToMenuButton = (Button) findViewById(R.id.customerGoToMenuButton);
        customerGoToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("menu", "Customer Management");

                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button customerGoToLoginButton = (Button) findViewById(R.id.customerGoToLoginButton);
        customerGoToLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("menu", "Customer Management");

                startActivity(intent);
                finish();
            }
        });
    }
}
