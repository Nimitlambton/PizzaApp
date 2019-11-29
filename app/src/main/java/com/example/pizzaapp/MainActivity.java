package com.example.pizzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {




    Spinner menu;

    RadioButton large, medium , small;

    CheckBox cheese , beef , pine , drinks;

    RadioButton Delivery , pick_up;

    Button order;

    int value , totalCost;

     Double prices[] = {10.0, 20.0 ,30.0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        menu = findViewById(R.id.sp_menu);
        //SIZES
        large = findViewById(R.id.rbsizeL);
        medium = findViewById(R.id.rbsizeM);
        small = findViewById(R.id.rbsizeS);
        //EXTRA
        cheese = findViewById(R.id.cbC);
        beef = findViewById(R.id.cbB);
        pine =findViewById(R.id.cbP);
        //drinks
        drinks = findViewById(R.id.CbDrinks);
        //mode
        Delivery = findViewById(R.id.rb_del);
        pick_up = findViewById(R.id.rb_pu);
        //btn order
        order = findViewById(R.id.btn_order);


        //<--- actions ------->

      //array for menu
        ArrayList <String> menuList = new ArrayList<>();

        menuList.add("farmhouse");
        menuList.add("single pizza");
        menuList.add("extravagazana pizza");

       //adapter to fill dropdown
        ArrayAdapter <String> menuadapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, menuList);

       //to make it in dropdown style
        menuadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

       //fill spinner with items
        menu.setAdapter(menuadapter);

        menu.setOnItemSelectedListener(this);




    }


   public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


        if( i == 1){


            System.out.println(prices[i]);

        }


    }

    public void onNothingSelected(AdapterView<?> adp){

    }





}


