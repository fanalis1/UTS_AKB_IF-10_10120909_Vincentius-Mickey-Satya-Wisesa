package com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10.Adapter.MusicAdapter;
import com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10.Model.MusicModel;

import java.util.ArrayList;


public class MusicF extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MusicF() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MusicVideoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MusicF newInstance(String param1, String param2) {
        MusicF fragment = new MusicF();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    RecyclerView recyclerViewMusic;
    ArrayList<MusicModel> musicModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_mv, container, false);

        recyclerViewMusic = root.findViewById(R.id.recview_music);
        recyclerViewMusic.setLayoutManager(new LinearLayoutManager(getContext()));

        musicModel = new ArrayList<>();

        MusicModel music1 = new MusicModel(R.drawable.bp, "Symphony", "Clean Bandit");
        musicModel.add(music1);
        MusicModel music2 = new MusicModel(R.drawable.nm, "This is Cold", "Cold Driven");
        musicModel.add(music2);
        MusicModel music3 = new MusicModel(R.drawable.oasis, "Run Free", "Deep Chill");
        musicModel.add(music3);
        MusicModel music4 = new MusicModel(R.drawable.bt, "Let It Be Album", "The Beatles");
        musicModel.add(music4);
        MusicModel music5 = new MusicModel(R.drawable.dewa, "Bintang Lima Album", "Dewa 19");
        musicModel.add(music5);

        recyclerViewMusic.setAdapter(new MusicAdapter(musicModel));

        VideoView vvVideo = root.findViewById(R.id.vv_video);
        String videoPath = "android.resource://" + getContext().getPackageName() + "/" + R.raw.bp;
        Uri uri = Uri.parse(videoPath);
        vvVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(getContext());
        vvVideo.setMediaController(mediaController);
        mediaController.setAnchorView(vvVideo);

        return root;
    }
}