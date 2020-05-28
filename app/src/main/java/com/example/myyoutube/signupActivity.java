package com.example.myyoutube;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signupActivity extends AppCompatActivity {

    EditText Edittext1, Edittext2, Edittext3, Edittext4, Edittext5;
    Button buttonsignup;
    /////////////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        //////////////////////////////////////////////////////
        Edittext1 = findViewById(R.id.edtfirstname);
        Edittext2 = findViewById(R.id.edtlastname);
        Edittext3 = findViewById(R.id.edtmobile);
        Edittext4 = findViewById(R.id.edtuser1);
        Edittext5 = findViewById(R.id.edtpass1);
        buttonsignup = findViewById(R.id.btnsignup);
        ////////////////////////////////////////////////////////

        buttonsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstname = Edittext1.getText().toString();
                String userID1 = "user" + firstname;
                String lastname = Edittext2.getText().toString();
                String userID2 = "user" + lastname;
                String mobile = Edittext3.getText().toString();
                String userID3 = "user" + mobile;

                ///////////////////////////////////////////////////

                String username = Edittext4.getText().toString();
                String userID4 = "user" + username;
                String password = Edittext5.getText().toString();
                String userID5 = "user" + password;

                ////////////////////////////////////////////////////

                FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                DatabaseReference databaseReference = firebaseDatabase.getReference();
                ////////////////////////////////////////////////////

                DatabaseReference childBR1 = databaseReference.child(userID1);
                childBR1.child("firstname").setValue(firstname);

                DatabaseReference childBR2 = databaseReference.child(userID2);
                childBR2.child("lastname").setValue(lastname);

                DatabaseReference childBR3 = databaseReference.child(userID3);
                childBR3.child("mobile").setValue(mobile);

                DatabaseReference childBR4 = databaseReference.child(userID4);
                childBR4.child("username").setValue(username);

                DatabaseReference childBR5 = databaseReference.child(userID5);
                childBR5.child("password").setValue(password);

                //////////////////////////////////////////////////////////////////

                Toast.makeText(signupActivity.this, "Sign Up successfull", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(signupActivity.this, loginActivity.class);
                startActivity(intent);


            }
        });
    }
}
