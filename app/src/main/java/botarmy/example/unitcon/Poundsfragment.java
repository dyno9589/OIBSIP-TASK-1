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
 * Use the {@link Poundsfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Poundsfragment extends Fragment {

    EditText editText3;
    Button gramsbtn3;
    Button kilogramsbtn3;
    Button tonnesbtn3;
    TextView textView3;
    TextView textView13;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Poundsfragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Poundsfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Poundsfragment newInstance(String param1, String param2) {
        Poundsfragment fragment = new Poundsfragment();
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
        View view = inflater.inflate(R.layout.fragment_poundsfragment, container, false);

        //write your code here

        editText3 = view.findViewById(R.id.edit_text_input3);
        gramsbtn3 = view.findViewById(R.id.grams_btn3);
        kilogramsbtn3 = view.findViewById(R.id.kilograms_btn3);
        tonnesbtn3 = view.findViewById(R.id.tonnes_btn3);
        textView3 =view.findViewById(R.id.text_view_out3);
        textView13 = view.findViewById(R.id.text_view_tag3);


        gramsbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fpounds111 = editText3.getText().toString();

                float fgrams222 = Float.parseFloat(fpounds111);

                float fgrams111 = (float) (fgrams222 * 453.6);

                textView3.setVisibility(View.VISIBLE);
                textView3.setText(""+fgrams111+" g");
                textView13.setText("Grams");

            }
        });

        kilogramsbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fpounds222 = editText3.getText().toString();

                float fkilos222 = Float.parseFloat(fpounds222);

                float fkilograms222 = (float) (fkilos222 / 2.205);

                textView3.setVisibility(View.VISIBLE);
                textView3.setText(""+fkilograms222+" kg");

                textView13.setText("Kilograms");
            }
        });

        tonnesbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fpounds333 = editText3.getText().toString();

                float ftonnes333 = Float.parseFloat(fpounds333);

                float ftonnes33 = (float) (ftonnes333 / 2000.00);

                textView3.setVisibility(View.VISIBLE);
                textView3.setText(""+ftonnes33+" t");

                textView13.setText("Tonnes");
            }
        });




        return view;
    }
}