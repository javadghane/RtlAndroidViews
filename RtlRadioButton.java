package helper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import pro.blackcore.soraya.R;

/**
 * Created by javadroid on 2/21/17.
 */

public class RtlRadioButton extends RelativeLayout {

    Context context;
    View rootView;
    LinearLayout linMain;
    TextView tv;
    RadioButton rd;


    public RtlRadioButton(Context context) {
        super(context);
        this.context = context;
        init(context);
    }

    public RtlRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public RtlRadioButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    public void setText(String text) {
        tv.setText(text);
    }

    public void setColor(int color) {
        tv.setTextColor(color);
    }

    public void setCheck(boolean check) {
        rd.setChecked(check);
    }

    public boolean getCheck() {
        return rd.isChecked();
    }

    public void setClick(final onClick clk) {
        tv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                clk.click();
            }
        });
        rd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                clk.click();
            }
        });
        linMain.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                clk.click();
            }
        });

    }

    private void init(Context context) {
        rootView = inflate(context, R.layout.custom_ui_rtl_radio_button, this);
        linMain = (LinearLayout) rootView.findViewById(R.id.linMain);
        tv = (TextView) rootView.findViewById(R.id.textview);
        rd = (RadioButton) rootView.findViewById(R.id.radioButton);
    }

    public interface onClick {
        void click();
    }

}


