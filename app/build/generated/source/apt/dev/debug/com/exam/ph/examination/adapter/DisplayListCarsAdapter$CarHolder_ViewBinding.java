// Generated code from Butter Knife. Do not modify!
package com.exam.ph.examination.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.exam.ph.examination.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DisplayListCarsAdapter$CarHolder_ViewBinding implements Unbinder {
  private DisplayListCarsAdapter.CarHolder target;

  @UiThread
  public DisplayListCarsAdapter$CarHolder_ViewBinding(DisplayListCarsAdapter.CarHolder target, View source) {
    this.target = target;

    target.tvName = Utils.findRequiredViewAsType(source, R.id.tvName, "field 'tvName'", TextView.class);
    target.cardUser = Utils.findRequiredViewAsType(source, R.id.cardUser, "field 'cardUser'", CardView.class);
    target.ivImage = Utils.findRequiredViewAsType(source, R.id.ivImage, "field 'ivImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DisplayListCarsAdapter.CarHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvName = null;
    target.cardUser = null;
    target.ivImage = null;
  }
}
