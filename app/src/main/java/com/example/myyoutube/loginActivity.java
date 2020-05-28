package com.example.myyoutube;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class loginActivity extends AppCompatActivity {

    EditText Edittext1, Edittext2;
    Button buttonlogin;
    Button buttonsignup;
    /////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /////////////////////////////////////////////////
        Edittext1 = findViewById(R.id.username);
        Edittext2 = findViewById(R.id.password);
        buttonlogin = findViewById(R.id.btnlogin);
        buttonsignup = findViewById(R.id.txtsignup);
        //////////////////////////////////////////////////

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String etxInputName = Edittext1.getText().toString();
                final String etxInputPassword = Edittext2.getText().toString();

                String userID1 = "user" + etxInputName;


                FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                DatabaseReference databaseReference = firebaseDatabase.getReference();

                DatabaseReference childBR1 = databaseReference.child(userID1);


                childBR1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        String recUsername = dataSnapshot.child("username").getValue().toString();
                        String recPassword = dataSnapshot.child("password").getValue().toString();
                        if (etxInputName.equals(recUsername) && etxInputPassword.equals(recPassword)) {
                            Toast.makeText(loginActivity.this, "Login Succesfull", Toast.LENGTH_SHORT).show();


                        } else {
                            Toast.makeText(loginActivity.this, "Invalid Username/Password", Toast.LENGTH_SHORT).show();
                        }
                    }


                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                        Toast.makeText(loginActivity.this, "Database Error", Toast.LENGTH_SHORT).show();

                    }

                });
            }
        });
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this, homepage.class);
                startActivity(intent);
            }
        });
    }
}
