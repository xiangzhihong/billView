package xzh.com.billview.utils;

import xzh.com.billview.view.PieChartView;

public interface OnPieChartItemSelectedLinstener {

	void onPieChartItemSelected(PieChartView view, int position, String colorRgb, float size, float rate, boolean isFreePart, float rotateTime);

	void onTriggerClicked();
}
