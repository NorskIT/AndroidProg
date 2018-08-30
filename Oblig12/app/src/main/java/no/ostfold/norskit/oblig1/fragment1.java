package no.ostfold.norskit.oblig1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragment1 extends Fragment {
    private static final String TAG = "fragment1";

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavSecondActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_layout, container, false);

        btnNavFrag1 = (Button) view.findViewById(R.id.btnNavFrag1);
        btnNavFrag1 = (Button) view.findViewById(R.id.btnNavFrag2);
        btnNavFrag1 = (Button) view.findViewById(R.id.btnNavFrag3);
    }
}
