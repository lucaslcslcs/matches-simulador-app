package me.dio.matches_simulador_app.data;

import java.util.List;

import me.dio.matches_simulador_app.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesAPI {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}
