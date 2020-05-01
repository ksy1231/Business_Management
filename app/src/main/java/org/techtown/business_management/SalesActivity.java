package org.techtown.business_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SalesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);

        Button salesGoToMenuButton = (Button) findViewById(R.id.salesGoToMenuButton);
        salesGoToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("menu", "Sales Management");

                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button salesGoToLoginButton = (Button) findViewById(R.id.salesGoToLoginButton);
        salesGoToLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("menu", "Sales Management");

                startActivity(intent);
                finish();
            }
        });
    }
}
