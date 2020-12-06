package com.example.feedtheneedyapporphanage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Menu extends AppCompatActivity {
    FirebaseDatabase db;
    DatabaseReference myRef;

    EditText foodType,foodName,foodQuantity,prepTime;
    TextView aboutfood;
    Button addFood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        db = db.getInstance();
        myRef = db.getReference("foods");

        foodType = findViewById(R.id.foodType);
        foodName = findViewById(R.id.excessFood  );
        foodQuantity = findViewById(R.id.foodQuantity);
        prepTime = findViewById(R.id.prepTime);
        aboutfood = findViewById(R.id.food);
        addFood = findViewById(R.id.addfood);

        addFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ftype = foodType.getText().toString();
                String fname = foodName.getText().toString();
                String fquan = foodQuantity.getText().toString();
                String ftime = prepTime.getText().toString();



                FoodDetails f = new FoodDetails(ftype,fname,fquan,ftime);
                myRef.child(fname).setValue(f).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(getApplicationContext(), "Food Added Successfully!", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(),ThankYou.class);
                        startActivity(i);
                    }
                });
            }
        });

    }
}

