package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = this.findViewById(R.id.go_button1);
        button1.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example1Activity).
                Intent myIntent = new Intent(MainActivity.this, Example1Activity.class);

                // Các tham số gắn trên Intent (Không bắt buộc).
                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");
                // Yêu cầu chạy Example1Activity.
                MainActivity.this.startActivity(myIntent);

            }
        });
        // Lấy ra button theo ID
        Button button2 = (Button) this.findViewById(R.id.go_button2);

        // Sét đặt sự kiện Click vào Button2.
        button2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example2Activity).
                Intent myIntent = new Intent(MainActivity.this, Example2Activity.class);

                // Yêu cầu chạy Example2Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });

        // Lấy ra button theo ID
        Button button3 = (Button) this.findViewById(R.id.go_button3);

        // Sét đặt sự kiện Click vào Button3.
        button3.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example3Activity).
                Intent myIntent = new Intent(MainActivity.this, Example3Activity.class);

                // Yêu cầu chạy Example3Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });
        // Lấy ra button theo ID
        Button button4 = (Button) this.findViewById(R.id.go_button4);

        // Sét đặt sự kiện Click vào Button4.
        button4.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example2Activity).
                Intent myIntent = new Intent(MainActivity.this, Example4Activity.class);

                // Yêu cầu chạy Example4Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });
// Lấy ra button theo ID
        Button button5 = (Button) this.findViewById(R.id.go_button5);

        // Sét đặt sự kiện Click vào Button5.
        button5.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example5Activity).
                Intent myIntent = new Intent(MainActivity.this, Example5Activity.class);

                // Yêu cầu chạy Example5Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });

    }

}
