package com.example.shoppingstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView computer, camera, cable, phone;
    private ImageView handsfree, pen, scanner, tv;
    private ImageView watch, charger, hairdrier, mouse;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


        computer = (ImageView) findViewById(R.id.computer);
        camera = (ImageView) findViewById(R.id.camera);
        cable = (ImageView) findViewById(R.id.cable);
        phone = (ImageView) findViewById(R.id.phone);

        handsfree = (ImageView) findViewById(R.id.handsfree);
        pen = (ImageView) findViewById(R.id.pen);
        scanner = (ImageView) findViewById(R.id.scanner);
        tv = (ImageView) findViewById(R.id.tv);

        watch = (ImageView) findViewById(R.id.watch);
        charger = (ImageView) findViewById(R.id.charger);
        hairdrier = (ImageView) findViewById(R.id.hairdrier);
        mouse = (ImageView) findViewById(R.id.mouse);


        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Computer");
                startActivity(intent);
            }
        });


        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Camera");
                startActivity(intent);
            }
        });


        cable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Cable");
                startActivity(intent);
            }
        });


        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Smart Phone");
                startActivity(intent);
            }
        });


        handsfree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Handsfree");
                startActivity(intent);
            }
        });


        pen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "USB Pen Drive");
                startActivity(intent);
            }
        });



        scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Scanner");
                startActivity(intent);
            }
        });


        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Tv");
                startActivity(intent);
            }
        });



        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Smart Watch");
                startActivity(intent);
            }
        });


        charger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "charger");
                startActivity(intent);
            }
        });


        hairdrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Hair Drier");
                startActivity(intent);
            }
        });


        mouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Computer Mouse");
                startActivity(intent);
            }
        });
    }
}