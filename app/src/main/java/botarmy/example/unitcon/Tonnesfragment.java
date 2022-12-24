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
 * Use the {@link Tonnesfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tonnesfragment extends Fragment {


    EditText editText4;
    Button gramsbtn4;
    Button kilogramsbtn4;
    Button poundsbtn4;
    TextView textView4;
    TextView textView14;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Tonnesfragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tonnesfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Tonnesfragment newInstance(String param1, String param2) {
        Tonnesfragment fragment = new Tonnesfragment();
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
        View view = inflater.inflate(R.layout.fragment_tonnesfragment, container, false);

        //write your code here

        editText4 = view.findViewById(R.id.edit_text_input4);
        gramsbtn4 = view.findViewById(R.id.grams_btn4);
        kilogramsbtn4 = view.findViewById(R.id.kilograms_btn4);
        poundsbtn4 = view.findViewById(R.id.pounds_btn4);
        textView4 =view.findViewById(R.id.text_view_out4);
        textView14 = view.findViewById(R.id.text_view_tag4);


        gramsbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ftonnes1111 = editText4.getText().toString();

                float fgrams2222 = Float.parseFloat(ftonnes1111);

                float fgrams1111 = (float) (fgrams2222 * 907200.00);

                textView4.setVisibility(View.VISIBLE);
                textView4.setText(""+fgrams1111+" g");
                textView14.setText("Grams");

            }
        });

        kilogramsbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ftonnes2222 = editText4.getText().toString();

                float fkilos2222 = Float.parseFloat(ftonnes2222);

                float fkilograms2222 = (float) (fkilos2222 * 907.2);

                textView4.setVisibility(View.VISIBLE);
                textView4.setText(""+fkilograms2222+" kg");

                textView14.setText("Kilograms");
            }
        });

        poundsbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ftonnes3333 = editText4.getText().toString();

                float fpounds3333 = Float.parseFloat(ftonnes3333);

                float fpounds333 = (float) (fpounds3333 * 2000.00);

                textView4.setVisibility(View.VISIBLE);
                textView4.setText(""+fpounds333+" lb");

                textView14.setText("Pounds");
            }
        });






        return view;
    }
}