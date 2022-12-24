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
 * Use the {@link Gramsfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Gramsfragment extends Fragment {

    EditText editText2;
    Button poundsbtn2;
    Button kilogramsbtn2;
    Button tonnesbtn2;
    TextView textView2;
    TextView textView12;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Gramsfragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Gramsfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Gramsfragment newInstance(String param1, String param2) {
        Gramsfragment fragment = new Gramsfragment();
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
        View view = inflater.inflate(R.layout.fragment_gramsfragment, container, false);

        //Write code here

        editText2 = view.findViewById(R.id.edit_text_input2);
        poundsbtn2 = view.findViewById(R.id.pounds_btn2);
        kilogramsbtn2 = view.findViewById(R.id.kilograms_btn2);
        tonnesbtn2 = view.findViewById(R.id.tonnes_btn2);
        textView2 =view.findViewById(R.id.text_view_out2);
        textView12 = view.findViewById(R.id.text_view_tag2);


        poundsbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String grams = editText2.getText().toString();

                float kilos = Float.parseFloat(grams);

                float pounds = (float) (kilos / 453.6);

                textView2.setVisibility(View.VISIBLE);
                textView2.setText(""+pounds+" lb");
                textView12.setText("Pounds");

            }
        });

        kilogramsbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fgrams11 = editText2.getText().toString();

                float fkilos11 = Float.parseFloat(fgrams11);

                float fkilograms11 = (float) (fkilos11 / 1000.00);

                textView2.setVisibility(View.VISIBLE);
                textView2.setText(""+fkilograms11+" kg");

                textView12.setText("Kilograms");
            }
        });

        tonnesbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fkilograms22 = editText2.getText().toString();

                float fkilos22 = Float.parseFloat(fkilograms22);

                float ftonnes22 = (float) (fkilos22 / 907200.00);

                textView2.setVisibility(View.VISIBLE);
                textView2.setText(""+ftonnes22+" t");

                textView12.setText("Tonnes");
            }
        });






        return view;
    }
}