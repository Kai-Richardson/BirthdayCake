package cs301.birthdaycake;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener   {

    private CakeView ourView;
    private CakeModel ourModel;

    public CakeController(CakeView ourView) {
        this.ourView = ourView;
        this.ourModel = ourView.getOurModel();
    }

    //press f to pay respects 👽


    @Override
    public void onClick(View view) {
        ourModel.candlesLit = false;
        ourView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        ourView.getOurModel().hasCandles = !ourView.getOurModel().hasCandles;
        ourView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int prog, boolean b) {
        ourView.getOurModel().numCandles = prog;
        ourView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}