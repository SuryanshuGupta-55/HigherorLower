package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomgenratednumber;
    public void Genrate(View view){
        EditText number=findViewById(R.id.number);
        Log.i("number","The number given is "+number.getText().toString());
        int userenterednumber=Integer.parseInt(number.getText().toString());
        if (userenterednumber>randomgenratednumber){                                            //Checking the conditions and producing the output.
            Toast.makeText(MainActivity.this,"Lower, try again.",Toast.LENGTH_LONG).show();
        }
        else if(userenterednumber<randomgenratednumber){
            Toast.makeText(MainActivity.this,"Upper, try again.",Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(MainActivity.this,"Correct , You have won the game Congratulation!.",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();//Creating random object in this file so we every time app open a random number is generated same for all time.
        randomgenratednumber=rand.nextInt(20)+1;//storing random generated random number in a global variable.
    }
}
