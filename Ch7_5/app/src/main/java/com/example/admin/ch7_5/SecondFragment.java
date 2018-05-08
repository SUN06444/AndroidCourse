package com.example.admin.ch7_5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    private static final  String MESSAGE = "MESSAGE";
    private String msg = "";
    public static SecondFragment newInstance(String msg){
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(MESSAGE,msg);
        fragment.setArguments(args);
        return fragment;
    }

    public SecondFragment() {
        // Required empty public constructor
    }

    public  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (getArguments() != null){
            msg = getArguments().getString(MESSAGE);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        if (msg != "") {
            TextView output = (TextView) view.findViewById(R.id.txv_ouput);
            output.setText(msg);
        }
        return view;

    }
}
