package com.example.jogodeperguntas;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.constraintLayout, new JogarFragment())
                .commit();
    }
    public void buttonCadastrarJogarFragment(View v) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.constraintLayout, new CadastrarFragment())
                .commit();
    }

    public void buttonJogarCadastrarFragment(View v) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.constraintLayout, new JogarFragment())
                .commit();
    }

}