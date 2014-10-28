package sit.kmutt.com.sallywork.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sit.kmutt.com.sallywork.R;
import sit.kmutt.com.sallywork.customview.BalloonButton;

/**
 * Created by Thanabut on 22/10/2557.
 */
public class BalloonFragment extends Fragment implements View.OnClickListener{
    BalloonButton btnBalloon;
    ViewGroup infoGroup;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.balloon_fragment,container,false);

        btnBalloon = (BalloonButton) view.findViewById(R.id.btn_balloon);
        btnBalloon.setOnClickListener(this);
        infoGroup = (ViewGroup) view.findViewById(R.id.hostInfo);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_balloon:
                balloonClick(v);
                break;
        }
    }

    private void balloonClick(View v){
        if(v instanceof BalloonButton){
            ((BalloonButton)v).setState((int)(Math.random()*4));
        }
        if(infoGroup.getVisibility() == View.INVISIBLE){
            infoGroup.setVisibility(View.VISIBLE);
        }
        else{
            infoGroup.setVisibility(View.INVISIBLE);
        }
    }

    public void setStateBalloon(int state){
        btnBalloon.setState(state);
    }
}
