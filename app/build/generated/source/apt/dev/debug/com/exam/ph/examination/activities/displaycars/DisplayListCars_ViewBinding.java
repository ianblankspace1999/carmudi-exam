// Generated code from Butter Knife. Do not modify!
package com.exam.ph.examination.activities.displaycars;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.exam.ph.examination.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DisplayListCars_ViewBinding implements Unbinder {
  private DisplayListCars target;

  @UiThread
  public DisplayListCars_ViewBinding(DisplayListCars target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DisplayListCars_ViewBinding(DisplayListCars target, View source) {
    this.target = target;

    target.mRvCarList = Utils.findRequiredViewAsType(source, R.id.rvCarList, "field 'mRvCarList'", RecyclerView.class);
    target.mProgBar = Utils.findRequiredViewAsType(source, R.id.progBar, "field 'mProgBar'", ProgressBar.class);
    target.mSpnFirst = Utils.findRequiredViewAsType(source, R.id.spnFirst, "field 'mSpnFirst'", Spinner.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DisplayListCars target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRvCarList = null;
    target.mProgBar = null;
    target.mSpnFirst = null;
  }
}
