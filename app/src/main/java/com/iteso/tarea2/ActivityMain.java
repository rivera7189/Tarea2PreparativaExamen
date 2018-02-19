package com.iteso.tarea2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    ImageButton like;
    RadioGroup radiogroup;
    Button car;
    int Selector = 0;
    Boolean OnCar = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        like = findViewById(R.id.like);
        radiogroup = findViewById(R.id.radio_group);
        car = findViewById(R.id.carrito);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(ActivityMain.this,"+1 to Vintage Bicycle",Toast.LENGTH_SHORT);
                toast.show();
            }
        });




        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(!OnCar){
                  OnCar=true;
                  car.setText("Añadido");
              }
              else{
                  Toast toast = Toast.makeText(ActivityMain.this,"Ya se encuentra en el carrito",Toast.LENGTH_SHORT);
                  toast.show();
              }
            }
        });

    }

}
