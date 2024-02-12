package com.example.tab_layout2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CHATSFRAGMENT#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UPDATESFRAGMENTS extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView rv1 ;
    ArrayList<animemodel> arrnames;

    public UPDATESFRAGMENTS() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CHATSFRAGMENT.
     */
    // TODO: Rename and change types and number of parameters
    public static CHATSFRAGMENT newInstance(String param1, String param2) {
        CHATSFRAGMENT fragment = new CHATSFRAGMENT();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view =inflater.inflate(R.layout.fragment_u_p_d_a_t_e_s_f_r_a_g_m_e_n_t_s, container, false);
        rv1 = view.findViewById(R.id.recycel1);
        rv1.setLayoutManager(new LinearLayoutManager(getContext()));

        arrnames = new ArrayList<>();

        arrnames.add(new animemodel(R.drawable.img_1,"Gojo Singh","💜__gojo purple hollow__💜"));
        arrnames.add(new animemodel(R.drawable.img,"Rozy","[87*97]"));
        arrnames.add(new animemodel(R.drawable.naruto,"Naruto","hawkake"));
        arrnames.add(new animemodel(R.drawable.img_1,"Gojo Singh","you can see me babe"));
        arrnames.add(new animemodel(R.drawable.img,"Rozy","[87*97]"));
        arrnames.add(new animemodel(R.drawable.img1,"Sasi yadav","$ kab dega bhai"));
        arrnames.add(new animemodel(R.drawable.img_2,"Rocky bhai","if you are bad im your Dad"));
        arrnames.add(new animemodel(R.drawable.img_4,"Virat kohli","koi he mere samne"));
        arrnames.add(new animemodel(R.drawable.img_3,"Renyy","9980768454"));
        arrnames.add(new animemodel(R.drawable.img_6,"Sanorita","💛"));
        arrnames.add(new animemodel(R.drawable.img_1,"Gojo Singh","you can see me babe"));
        arrnames.add(new animemodel(R.drawable.naruto,"Naruto","hawkake"));
        arrnames.add(new animemodel(R.drawable.img_1,"Gojo Singh","you can see me babe"));
        arrnames.add(new animemodel(R.drawable.img1,"Sasi yadav","$ kab dega bhai"));
        arrnames.add(new animemodel(R.drawable.img_2,"Rocky bhai","if you are bad im your Dad"));
        arrnames.add(new animemodel(R.drawable.img_4,"Virat kohli","koi he mere samne"));
        arrnames.add(new animemodel(R.drawable.img_3,"Renyy","9980768454"));
        arrnames.add(new animemodel(R.drawable.img_6,"Sanorita","❤️"));
        arrnames.add(new animemodel(R.drawable.img_2,"Rocky bhai","if you are bad im your Dad"));
        arrnames.add(new animemodel(R.drawable.img_4,"Virat kohli","koi he mere samne"));
        arrnames.add(new animemodel(R.drawable.img_6,"Sanorita","❤️"));
        arrnames.add(new animemodel(R.drawable.naruto,"Naruto","hawkake"));
        arrnames.add(new animemodel(R.drawable.img_4,"Virat kohli","koi he mere samne"));
        arrnames.add(new animemodel(R.drawable.img,"Rozy","[87*97]"));
        arrnames.add(new animemodel(R.drawable.img1,"Sasi yadav","$ kab dega bhai"));
        arrnames.add(new animemodel(R.drawable.img_1,"Gojo Singh","💜__gojo purple hollow__💜"));
        arrnames.add(new animemodel(R.drawable.img,"Rozy","[87*97]"));
        arrnames.add(new animemodel(R.drawable.img1,"Sasi yadav","$ kab dega bhai"));
        arrnames.add(new animemodel(R.drawable.img_2,"Rocky bhai","if you are bad im your Dad"));
        arrnames.add(new animemodel(R.drawable.img_4,"Virat kohli","koi he mere samne"));
        arrnames.add(new animemodel(R.drawable.img_3,"Renyy","9980768454"));
        arrnames.add(new animemodel(R.drawable.img_6,"Sanorita","💚"));
        arrnames.add(new animemodel(R.drawable.img_6,"Sanorita","💙"));
        arrnames.add(new animemodel(R.drawable.naruto,"Naruto","hawkake"));
        arrnames.add(new animemodel(R.drawable.img_1,"Gojo Singh","you can see me babe"));
        arrnames.add(new animemodel(R.drawable.img_4,"Virat kohli","koi he mere samne"));
        arrnames.add(new animemodel(R.drawable.img_3,"Renyy","9980768454"));
        firstadapter ADA = new firstadapter(getContext(),arrnames);
        rv1.setAdapter(ADA);
        return view;
    }
}