package com.example.pyrov.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvLine, tvResult;

    Button[] buttons;
    int[] buttons_id;

    Button btOne, btTwo, btThree, btFour, btFive, btSix, btSeven, btEight, btNine, btZero, btPlus, btMinus, btMulti, btDiv, btEqual, btClear, btPoint, btRadical, btSquare, btPercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // инициализация TextView
        tvLine = (TextView) findViewById(R.id.computation_line);
        tvResult = (TextView) findViewById(R.id.result_output);

        // массив с кнопками
        buttons = new Button[]{btOne, btTwo, btThree, btFour, btFive, btSix, btSeven, btEight, btNine, btZero, btPlus, btMinus, btMulti, btDiv, btEqual, btClear, btPoint, btRadical, btSquare, btPercent};

        // массив с id кнопок
        buttons_id = new int[]{R.id.button_one, R.id.button_two, R.id.button_three, R.id.button_four, R.id.button_five, R.id.button_six, R.id.button_seven, R.id.button_eight, R.id.button_nine, R.id.button_zero, R.id.button_plus, R.id.button_minus, R.id.button_multiplication, R.id.button_division, R.id.button_equals, R.id.button_delete, R.id.button_point, R.id.button_radical, R.id.button_square, R.id.button_percent};

        // инициализация всех кнопок и подключения "слушателя"
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = (Button) findViewById(buttons_id[i]);
            buttons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {

    }
}
