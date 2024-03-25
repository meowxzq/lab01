package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ta;
    EditText tb;
    TextView lr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.txt_a);
        tb = findViewById(R.id.txt_b);
        lr = findViewById(R.id.txt_res);
    }

    public void add_click(View v) {
        String sa = ta.getText().toString().trim();
        String sb = tb.getText().toString().trim();

        if (sa.isEmpty() || sb.isEmpty()) {
            lr.setText("Ошибка: одно или оба поля пустые.");
            return;
        }

        int a = 0, b = 0;
        boolean isValidInput = true;

        try {
            a = Integer.parseInt(sa);
            b = Integer.parseInt(sb);
        } catch (NumberFormatException e) {
            isValidInput = false;
            lr.setText("Ошибка: введите числовые значения.");
            return;
        }

        int c = a + b;
        String sc = String.valueOf(c);
        lr.setText(sc);
    }

    public void sub_click(View v) {
        String sa = ta.getText().toString().trim();
        String sb = tb.getText().toString().trim();

        if (sa.isEmpty() || sb.isEmpty()) {
            lr.setText("Ошибка: одно или оба поля пустые.");
            return;
        }

        int a = 0, b = 0;
        boolean isValidInput = true;

        try {
            a = Integer.parseInt(sa);
            b = Integer.parseInt(sb);
        } catch (NumberFormatException e) {
            isValidInput = false;
            lr.setText("Ошибка: введите числовые значения.");
            return;
        }

        int c = a - b;
        String sc = String.valueOf(c);
        lr.setText(sc);
    }

    public void mul_click(View v) {
        String sa = ta.getText().toString().trim();
        String sb = tb.getText().toString().trim();

        if (sa.isEmpty() || sb.isEmpty()) {
            lr.setText("Ошибка: одно или оба поля пустые.");
            return;
        }

        int a = 0, b = 0;
        boolean isValidInput = true;

        try {
            a = Integer.parseInt(sa);
            b = Integer.parseInt(sb);
        } catch (NumberFormatException e) {
            isValidInput = false;
            lr.setText("Ошибка: введите числовые значения.");
            return;
        }

        int c = a * b;
        String sc = String.valueOf(c);
        lr.setText(sc);
    }

    public void div_click(View v) {
        String sa = ta.getText().toString().trim();
        String sb = tb.getText().toString().trim();

        if (sa.isEmpty() || sb.isEmpty()) {
            lr.setText("Ошибка: одно или оба поля пустые.");
            return;
        }

        int a = 0, b = 0;
        boolean isValidInput = true;

        try {
            a = Integer.parseInt(sa);
            b = Integer.parseInt(sb);
        } catch (NumberFormatException e) {
            isValidInput = false;
            lr.setText("Ошибка: введите числовые значения.");
            return;
        }

        if (isValidInput) {
            if (b == 0) {
                lr.setText("Ошибка: деление на ноль!");
            } else {
                // Иначе выполняем деление
                int c = a / b;
                String sc = String.valueOf(c);
                lr.setText(sc);
            }
        }
    }

    public void sin_click(View v) {
        String sa = ta.getText().toString().trim();

        if (sa.isEmpty()) {
            lr.setText("Ошибка: поле пустое.");
            return;
        }

        float a = 0;
        boolean isValidInput = true;

        try {
            a = Float.parseFloat(sa);
        } catch (NumberFormatException e) {
            isValidInput = false;
            lr.setText("Ошибка: введите числовое значение.");
            return;
        }

        if (isValidInput) {
            double res = Math.sin(Math.toRadians(a)); // Так как Math.sin принимает значение в радианах, используем Math.toRadians для перевода градусов в радианы
            String sc = String.valueOf(res);
            lr.setText(sc);
        }
    }

    public void cos_click(View v) {
        String sa = ta.getText().toString().trim();

        if (sa.isEmpty()) {
            lr.setText("Ошибка: поле пустое.");
            return;
        }

        float a = 0;
        boolean isValidInput = true;

        try {
            a = Float.parseFloat(sa);
        } catch (NumberFormatException e) {
            isValidInput = false;
            lr.setText("Ошибка: введите числовое значение.");
            return;
        }

        if (isValidInput) {
            double res = Math.cos(Math.toRadians(a));
            String sc = String.valueOf(res);
            lr.setText(sc);
        }
    }

    public void tan_click(View v) {
        String sa = ta.getText().toString().trim();

        if (sa.isEmpty()) {
            lr.setText("Ошибка: поле пустое.");
            return;
        }

        float a = 0;
        boolean isValidInput = true;

        try {
            a = Float.parseFloat(sa);
        } catch (NumberFormatException e) {
            isValidInput = false;
            lr.setText("Ошибка: введите числовое значение.");
            return;
        }

        if (isValidInput) {
            double res = Math.tan(Math.toRadians(a));
            String sc = String.valueOf(res);
            lr.setText(sc);
        }
    }

    public void sqrt_click(View v) {
        String sa = ta.getText().toString().trim();

        if (sa.isEmpty()) {
            lr.setText("Ошибка: поле пустое.");
            return;
        }

        float a = 0;
        boolean isValidInput = true;

        try {
            a = Float.parseFloat(sa);
        } catch (NumberFormatException e) {
            isValidInput = false;
            lr.setText("Ошибка: введите числовое значение.");
            return;
        }

        if (isValidInput) {
            if (a < 0) {
                lr.setText("Ошибка: нельзя извлекать квадратный корень из отрицательного числа.");
            } else {
                double res = Math.sqrt(a);
                String sc = String.valueOf(res);
                lr.setText(sc);
            }
        }
    }


    public void pow_click(View v) {
        String sa = ta.getText().toString().trim();
        String sb = tb.getText().toString().trim();

        if (sa.isEmpty() || sb.isEmpty()) {
            lr.setText("Ошибка: одно или оба поля пустые.");
            return;
        }

        float a = 0;
        int b = 0;
        boolean isValidInput = true;

        try {
            a = Float.parseFloat(sa);
            b = Integer.parseInt(sb);
        } catch (NumberFormatException e) {
            isValidInput = false;
            lr.setText("Ошибка: введите числовые значения.");
            return;
        }

        if (isValidInput) {
            double res = Math.pow(a, b);
            String sc = String.valueOf(res);
            lr.setText(sc);
        }
    }
}
