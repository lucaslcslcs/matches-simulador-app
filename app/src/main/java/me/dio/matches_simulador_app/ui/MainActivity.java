package me.dio.matches_simulador_app.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.matches_simulador_app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(binding.getRoot());

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();

    }

    private void setupMatchesList() {
        // Listar as partidas consumindo nossa API.
    }

    private void setupMatchesRefresh() {
        // Atualizar as partidas na ação de swipe.
    }

    private void setupFloatingActionButton() {
        // Criar evento de click e simulação de partidas.
    }
}
