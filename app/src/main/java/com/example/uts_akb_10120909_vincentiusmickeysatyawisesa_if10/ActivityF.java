package com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10.Adapter.ActivityAdapter;
import com.example.uts_akb_10120909_vincentiusmickeysatyawisesa_if10.Model.ActivityModel;

import java.util.ArrayList;



/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ActivityF#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ActivityF extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ActivityF() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ActivityF newInstance(String param1, String param2) {
        ActivityF fragment = new ActivityF();
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

    // views dailyact
    RecyclerView recyclerViewDaily;
    ArrayList<ActivityModel> dailyModel;
    // views friendlist
    RecyclerView recyclerViewFriendlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_activity, container, false);

        // daliyact
        recyclerViewDaily = root.findViewById(R.id.recview_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        ActivityModel daily1 = new ActivityModel(R.drawable.wakeup, "Bangun ", "Morning person jalan ninjaku ");
        dailyModel.add(daily1);
        ActivityModel daily2 = new ActivityModel(R.drawable.turu, "Tidur Lagi", "udh bangun pagi tapi masih ngantuk");
        dailyModel.add(daily2);
        ActivityModel daily3 = new ActivityModel(R.drawable.wakeup, "Bangun Lagi", "ini beneran udh bangun");
        dailyModel.add(daily3);
        ActivityModel daily4 = new ActivityModel(R.drawable.mknbg, "Sarapan ", "isi tenaga dulu biar kuliah ga lemes");
        dailyModel.add(daily4);
        ActivityModel daily5 = new ActivityModel(R.drawable.otw, "Otw Kampus", "perjalanan untuk mendapatkan ilmu yg butuh effort, telat gpp yg penting masuk");
        dailyModel.add(daily5);
        ActivityModel daily6 = new ActivityModel(R.drawable.bljr, "Kuliah", "Belajar dengan konsep 40% dengerin, 60% planga plongo");
        dailyModel.add(daily6);
        ActivityModel daily7 = new ActivityModel(R.drawable.main, "Nongkrong", "kalo ga main ke cafe ya menjadi beban dikost teman");
        dailyModel.add(daily7);
        ActivityModel daily8 = new ActivityModel(R.drawable.otw, "Pulang", "otw pulang biar bisa istirahat");
        dailyModel.add(daily8);
        ActivityModel daily9 = new ActivityModel(R.drawable.turu, "Istirahat", "udh nyampe rumah waktunya bobo geming");
        dailyModel.add(daily9);

        recyclerViewDaily.setAdapter(new ActivityAdapter(dailyModel));
        return root;
    }
}