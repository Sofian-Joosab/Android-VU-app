package com.example.rock_boy69.vu_collab;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class UnitsFragment extends Fragment {

    private ImageButton mImage;

    public UnitsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View rootView =  inflater.inflate(R.layout.fragment_units, container, false);

        mImage = rootView.findViewById(R.id.imageButton4);

        mImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainPage = new Intent(getActivity(),UnitActivity.class);
                startActivity(mainPage);
            }
        });

    return rootView;
    }

}
