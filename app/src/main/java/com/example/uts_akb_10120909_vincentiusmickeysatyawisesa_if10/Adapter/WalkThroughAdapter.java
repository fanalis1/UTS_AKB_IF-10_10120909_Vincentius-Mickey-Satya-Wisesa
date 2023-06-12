package com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10.Model.WalkThroughModel;
import com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10.R;

import java.util.List;


public class WalkThroughAdapter extends RecyclerView.Adapter<WalkThroughAdapter.WalkthroughViewHolder> {

    private List<WalkThroughModel> waltrugModels;

    public WalkThroughAdapter(List<WalkThroughModel> waltrugModels) {
        this.waltrugModels =waltrugModels;
    }

    @NonNull
    @Override
    public WalkthroughViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WalkthroughViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_wt, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull WalkthroughViewHolder holder, int position) {
        holder.setWalkthroughData(waltrugModels.get(position));
    }

    @Override
    public int getItemCount() {
        return waltrugModels.size();
    }

    class WalkthroughViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitleWalkthrough;
        private TextView tvSubtitleWalkthrough;
        private ImageView ivWalkthrough;

        public WalkthroughViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitleWalkthrough = itemView.findViewById(R.id.tv_titlewalkthrough);
            tvSubtitleWalkthrough = itemView.findViewById(R.id.tv_subtitlewalkthrough);
            ivWalkthrough = itemView.findViewById(R.id.iv_walkthrough);
        }

        void setWalkthroughData(WalkThroughModel walkthroughModel) {
            tvTitleWalkthrough.setText(walkthroughModel.getTitle());
            tvSubtitleWalkthrough.setText(walkthroughModel.getSubtitle());
            ivWalkthrough.setImageResource(walkthroughModel.getImage());
        }
    }
}
