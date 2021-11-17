package ru.arima.geoquiz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //1. Объявили переменные
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //2. Нашли кнопки в макете
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        //3. Назначаем "слушателя" кнопки "true"
        trueButton.setOnClickListener{view: View ->
            //4. Добавляем действие при нажатии
            Toast.makeText(
                this,
                R.string.correct_toast,
                Toast.LENGTH_SHORT)
                .show()
        }

        //4. Назначаем "слушателя" кнопки "false"
        falseButton.setOnClickListener { view: View ->
            //4. Добавляем действие при нажатии
            Toast.makeText(
                this,
                R.string.incorrect_toast,
                Toast.LENGTH_SHORT)
                .show()
        }

    }
}