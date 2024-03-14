package com.example.md5_hashing;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MainActivity extends AppCompatActivity {
    private EditText message;
    private Button button;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = findViewById(R.id.message);
        button = findViewById(R.id.button);
        res  = findViewById(R.id.res);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(message.getText().length() == 0 ){
                    Toast.makeText(MainActivity.this, "Введите сообщение", Toast.LENGTH_LONG).show();
                } else {
                        String md5Hash = generateMD5(message.getText().toString());
                        res.setText("MD5 Hash: " + md5Hash);
                }
            }
        });
    }

    public static String generateMD5(String input) {
        try {
            // Создаем объект MessageDigest для MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Преобразуем входную строку в массив байтов и обновляем хеш
            md.update(input.getBytes());

            // Получаем хеш в виде массива байтов
            byte[] digest = md.digest();

            // Преобразуем массив байтов в шестнадцатеричную строку
            BigInteger bigInt = new BigInteger(1, digest);
            String md5Hash = bigInt.toString(16);

            // Дополняем строку нулями, если необходимо
            while (md5Hash.length() < 32) {
                md5Hash = "0" + md5Hash;
            }
            return md5Hash;

        } catch (NoSuchAlgorithmException e) {
            // Обработка исключения в случае, если алгоритм MD5 не поддерживается
            e.printStackTrace();
            return null;
        }
    }
}