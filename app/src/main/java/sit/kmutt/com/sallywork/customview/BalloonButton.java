package sit.kmutt.com.sallywork.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import sit.kmutt.com.sallywork.R;

/**
 * Created by Thanabut on 22/10/2557.
 */
public class BalloonButton extends Button{
    final public int STATE_DEFAULT = 0;
    final public int STATE_DETECTED = 1;
    final public int STATE_SUCCESS = 2;
    final public int STATE_ERROR = 3;

    public BalloonButton(Context context) {
        super(context);
    }

    public BalloonButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BalloonButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setState(int state){
        switch(state){
            case STATE_DEFAULT:
                this.setBackgroundResource(R.drawable.circle_default);
                break;
            case STATE_DETECTED:
                this.setBackgroundResource(R.drawable.circle_green);
                break;
            case STATE_SUCCESS:
                this.setBackgroundResource(R.drawable.circle_blue);
                break;
            case STATE_ERROR:
                this.setBackgroundResource(R.drawable.circle_red);
                break;
        }
    }
}
