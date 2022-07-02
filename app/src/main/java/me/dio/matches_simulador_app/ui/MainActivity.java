package me.dio.matches_simulador_app.ui;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

import me.dio.matches_simulador_app.R;
import me.dio.matches_simulador_app.data.MatchesAPI;
import me.dio.matches_simulador_app.databinding.ActivityMainBinding;
import me.dio.matches_simulador_app.domain.Match;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class MainActivity extends AppCompatActivity {

    private final ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
    private MatchesAPI matchesAPI;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(binding.getRoot());

        setupHttpClient();
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();

    }

    private void setupHttpClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://lucaslcslcs1998.github.io/matches-simulator-api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        matchesAPI = retrofit.create(MatchesAPI.class);
    }

    private void setupMatchesList() {
        matchesAPI.getMatches().enqueue(new Callback<List<Match>>() {
            @Override
            public void onResponse(@NonNull Call<List<Match>> call, @NonNull Response<List<Match>> response) {
                if(response.isSuccessful()){
                    List<Match> matches = response.body();
                    assert matches != null;
                    Log.i("SIMULATOR", "Deu tudo certo! Voltaram partidas:"+ matches.size());
                }else{
                    showErrorMessage();
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<Match>> call, @NonNull Throwable t) {
                showErrorMessage();
            }
        });
    }


    private void setupMatchesRefresh() {

    }

    private void setupFloatingActionButton() {

    }

    private void showErrorMessage() {
        Snackbar.make(binding.fabSimulate, R.string.error_api, Snackbar.LENGTH_LONG).show();
    }
}
