package me.dio.matches_simulador_app.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import me.dio.matches_simulador_app.databinding.MatchItemBinding;
import me.dio.matches_simulador_app.domain.Match;

public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.ViewHolder>  {

    private List<Match> matches;
    private LayoutInflater layoutInflater;

    public MatchesAdapter(List<Match> matches) {
        this.matches = matches;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        MatchItemBinding binding = MatchItemBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Match match = matches.get(position);

        // Adaptar os dados da partida (recuperada da API) para o nosso Layout.
        holder.binding.tvHomeTeamName.setText(match.getHomeTeam().getName());
        holder.binding.tvAwayTeamName.setText(match.getHomeTeam().getName());
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final MatchItemBinding binding;

        public ViewHolder(MatchItemBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}