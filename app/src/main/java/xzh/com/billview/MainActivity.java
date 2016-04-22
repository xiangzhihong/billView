package xzh.com.billview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Calendar;

import xzh.com.billview.utils.OnDateChangedLinstener;
import xzh.com.billview.view.StatisticsView;

public class MainActivity extends Activity implements OnDateChangedLinstener {

    private StatisticsView mView;
    private int total = 100;
    private float[] items = {1200,220,57,101,210};
    private String[] type = {"第一项","第二项","第三项","第四项","第五项"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       init();
    }

    private void init() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        mView = new StatisticsView(this, items, total, type);
        mView.setCurrDate(year, month);
        mView.setDateChangedListener(this);

        setContentView(mView);
    }

    @Override
    public void onDateChanged(String startDate, String endDate) {
        Toast.makeText(this, "点击了日期"+startDate+"--"+endDate,
                Toast.LENGTH_SHORT).show();
    }
}
