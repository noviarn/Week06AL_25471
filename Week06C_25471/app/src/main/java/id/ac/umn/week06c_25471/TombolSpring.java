package id.ac.umn.week06c_25471;

import android.content.Context;
import android.support.animation.DynamicAnimation;
import android.support.animation.SpringAnimation;
import android.support.animation.SpringForce;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class TombolSpring extends AppCompatButton {
    public TombolSpring (Context context){
        super(context);
    }
    public TombolSpring (Context context, AttributeSet attrs){
        super(context,attrs);
    }
    public TombolSpring (Context context,AttributeSet attrs,
                         int defStyleAttr){
        super(context,attrs,defStyleAttr);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        switch(event.getActionMasked()){
            case MotionEvent.ACTION_DOWN:
                final SpringAnimation anim = new SpringAnimation(this,
                        DynamicAnimation.Y,
                        this.getY());
                anim.setStartVelocity(10000);
                anim.getSpring().setStiffness(SpringForce.STIFFNESS_LOW);
                anim.start();
                break;
            default:
        }
        return super.onTouchEvent(event);
    }
}
