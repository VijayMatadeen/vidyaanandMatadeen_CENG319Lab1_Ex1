package com.example.vidyaanandmatadeen_ceng319lab1_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.BreakIterator;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BottomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BottomFragment extends Fragment {

    Button changeTextView;
    TextView message;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "paramd\1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BottomFragment() {
        // Required empty public constructor

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parametasasaer 2.
     * @return A new instance of fragment BottomFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BottomFragment newInstance(String param1, String param2) {
        BottomFragment fragment = new BottomFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Lifecycle", "In the onCreate() event");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom, container, false);

    }
    public void onStart()
    {
        super.onStart();
        Log.d("Lifecycle", "In the onStart() event");

    }
    //
    //public void onRestart()
    //{
    //    super.onRestart();
    //    Log.d("Lifecycle", "In the onRestart() event");
    //}
    public void onResume()
    {
        super.onResume();
        Log.d("Lifecycle", "In the onResume() event");
    }
    public void onPause()
    {
        super.onPause();
        Log.d("Lifecycle", "In the onPause() event");
    }
    //
    public void onStop()
    {
        super.onStop();
        Log.d("Lifecycle", "In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d("Lifecycle", "In the onDestroy() event");
    }

}