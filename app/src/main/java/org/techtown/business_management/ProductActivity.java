package org.techtown.business_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Button productGoToMenuButton = (Button) findViewById(R.id.productGoToMenuButton);
        productGoToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("menu", "Product Management");

                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button productGoToLoginButton = (Button) findViewById(R.id.productGoToLoginButton);
        productGoToLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("menu", "Product Management");

                startActivity(intent);
                finish();
            }
        });
    }
}
