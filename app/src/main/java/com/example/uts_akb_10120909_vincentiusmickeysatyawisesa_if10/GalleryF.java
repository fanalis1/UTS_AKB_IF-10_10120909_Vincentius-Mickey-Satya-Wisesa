package com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10.Adapter.GalleryAdapter;
import com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10.Model.GalleryModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GalleryF#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryF extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GalleryF() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GalleryF newInstance(String param1, String param2) {
        GalleryF fragment = new GalleryF();
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

    RecyclerView recyclerViewGallery;
    ArrayList<GalleryModel> galleryModel;
    private StaggeredGridLayoutManager manager; // image staggred

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root =inflater.inflate(R.layout.fragment_gallery, container, false);

        recyclerViewGallery = root.findViewById(R.id.recview_gallery);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerViewGallery.setLayoutManager(manager);

        galleryModel = new ArrayList<>();

        GalleryModel gallery1 = new GalleryModel(R.drawable.g3);
        galleryModel.add(gallery1);
        GalleryModel gallery2 = new GalleryModel(R.drawable.g12);
        galleryModel.add(gallery2);
        GalleryModel gallery3 = new GalleryModel(R.drawable.g10);
        galleryModel.add(gallery3);
        GalleryModel gallery4 = new GalleryModel(R.drawable.g2);
        galleryModel.add(gallery4);
        GalleryModel gallery5 = new GalleryModel(R.drawable.g5);
        galleryModel.add(gallery5);
        GalleryModel gallery6 = new GalleryModel(R.drawable.g6);
        galleryModel.add(gallery6);
        GalleryModel gallery7 = new GalleryModel(R.drawable.g7);
        galleryModel.add(gallery7);
        GalleryModel gallery8 = new GalleryModel(R.drawable.g8);
        galleryModel.add(gallery8);
        GalleryModel gallery9 = new GalleryModel(R.drawable.g1);
        galleryModel.add(gallery9);
        GalleryModel gallery11 = new GalleryModel(R.drawable.g4);
        galleryModel.add(gallery11);

        recyclerViewGallery.setAdapter(new GalleryAdapter(galleryModel));

        return root;
    }
}