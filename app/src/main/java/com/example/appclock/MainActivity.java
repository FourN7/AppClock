package com.example.appclock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TimePicker tp_Clock;
    Button btn_Start, btn_Stop;
    TextView tv_Hienthi;
    Calendar calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp_Clock=findViewById(R.id.tp_clock);
        btn_Start=findViewById(R.id.btn_start);
        btn_Stop=findViewById(R.id.btn_stop);
        tv_Hienthi=findViewById(R.id.textView_HienThi);
        calendar = Calendar.getInstance();
        btn_Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.set(Calendar.HOUR_OF_DAY,tp_Clock.getCurrentHour());
                calendar.set(Calendar.MINUTE,tp_Clock.getCurrentHour());

                int gio=tp_Clock.getCurrentHour() ;
                int phut=tp_Clock.getCurrentMinute();
                String st_gio=String.valueOf(gio);
                String st_phut=String.valueOf(phut);
                if(gio>12){
                    st_gio = String.valueOf(gio-12);
                }
                if(phut<10){
                    st_phut ="0"+String.valueOf(phut);
                }
                tv_Hienthi.setText("Bạn Dã Đặt Time Là:"+st_gio+":"+st_phut);
            }
        });
        btn_Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Hienthi.setText("Dừng Lại");
            }
        });
    }
}
