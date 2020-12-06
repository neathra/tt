package com.example.feedtheneedyapporphanage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class ThankYou extends AppCompatActivity {
    Button signout;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        mAuth=FirebaseAuth.getInstance();


        signout = findViewById(R.id.signout);


        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mAuth.signOut();
                Intent i1 = new Intent(ThankYou.this, MainActivity.class);
                startActivity(i1);
                finish();

            }
        });
    }
}