package com.example.rakshitayadav.minesweeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListners{

    LinearLayout rootLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  static  int player = 0;
    public int mine= 1;
    public int num=2
    public int SIZE=3;
    public ArrayList<Integer> rows = new ArrayList<>();
    public MineButton[][] board;
}
