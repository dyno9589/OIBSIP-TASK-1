package botarmy.example.unitcon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Kgfragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class Kgfragment extends Fragment {

    EditText editText1;
    Button poundsbtn1;
    Button gramsbtn1;
    Button tonnesbtn1;
    TextView textView1;
    TextView textView11;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Kgfragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Kgfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Kgfragment newInstance(String param1, String param2) {
        Kgfragment fragment = new Kgfragment();
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
        View view = inflater.inflate(R.layout.fragment_kgfragment, container, false);



        //all code is in this method only

         editText1 = view.findViewById(R.id.edit_text_input1);
         poundsbtn1 = view.findViewById(R.id.pounds_btn1);
         gramsbtn1 = view.findViewById(R.id.grams_btn1);
         tonnesbtn1 = view.findViewById(R.id.tonnes_btn1);
         textView1 =view.findViewById(R.id.text_view_out1);
         textView11 = view.findViewById(R.id.text_view_tag1);


        poundsbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fkilograms = editText1.getText().toString();

                float fkilos = Float.parseFloat(fkilograms);

                float fpounds = (float) (fkilos * 2.20462);

                textView1.setVisibility(View.VISIBLE);
                textView1.setText(""+fpounds+" lb");
                textView11.setText("Pounds");

            }
        });

        gramsbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fkilograms1 = editText1.getText().toString();

                float fkilos1 = Float.parseFloat(fkilograms1);

                float fgrams = (float) (fkilos1 * 1000.00);

                textView1.setVisibility(View.VISIBLE);
                textView1.setText(""+fgrams+" g");

                textView11.setText("Grams");
            }
        });

        tonnesbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fkilograms2 = editText1.getText().toString();

                float fkilos2 = Float.parseFloat(fkilograms2);

                float ftonnes = (float) (fkilos2 / 1000.00);

                textView1.setVisibility(View.VISIBLE);
                textView1.setText(""+ftonnes+" t");

                textView11.setText("Tonnes");
            }
        });



        return view;
    }
}