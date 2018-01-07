// Generated code from Butter Knife. Do not modify!
package com.exam.ph.examination.activities.displayspecificuser;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.exam.ph.examination.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DisplaySpecificUser_ViewBinding implements Unbinder {
  private DisplaySpecificUser target;

  @UiThread
  public DisplaySpecificUser_ViewBinding(DisplaySpecificUser target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DisplaySpecificUser_ViewBinding(DisplaySpecificUser target, View source) {
    this.target = target;

    target.tvUserName = Utils.findRequiredViewAsType(source, R.id.tvUserName, "field 'tvUserName'", TextView.class);
    target.tvAddress = Utils.findRequiredViewAsType(source, R.id.tvAddress, "field 'tvAddress'", TextView.class);
    target.tvBirthDate = Utils.findRequiredViewAsType(source, R.id.tvBirthDate, "field 'tvBirthDate'", TextView.class);
    target.tvAge = Utils.findRequiredViewAsType(source, R.id.tvAge, "field 'tvAge'", TextView.class);
    target.tvPhone = Utils.findRequiredViewAsType(source, R.id.tvPhone, "field 'tvPhone'", TextView.class);
    target.tvContactName = Utils.findRequiredViewAsType(source, R.id.tvContactName, "field 'tvContactName'", TextView.class);
    target.tvContactNumber = Utils.findRequiredViewAsType(source, R.id.tvContactNumber, "field 'tvContactNumber'", TextView.class);
    target.exhibitorImageView = Utils.findRequiredViewAsType(source, R.id.exhibitorImageView, "field 'exhibitorImageView'", ImageView.class);
    target.tvPersonName = Utils.findRequiredViewAsType(source, R.id.tvPersonName, "field 'tvPersonName'", TextView.class);
    target.tvEmail = Utils.findRequiredViewAsType(source, R.id.tvEmail, "field 'tvEmail'", TextView.class);
    target.rlProfileInfo = Utils.findRequiredViewAsType(source, R.id.rlProfileInfo, "field 'rlProfileInfo'", RelativeLayout.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DisplaySpecificUser target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvUserName = null;
    target.tvAddress = null;
    target.tvBirthDate = null;
    target.tvAge = null;
    target.tvPhone = null;
    target.tvContactName = null;
    target.tvContactNumber = null;
    target.exhibitorImageView = null;
    target.tvPersonName = null;
    target.tvEmail = null;
    target.rlProfileInfo = null;
    target.toolbar = null;
  }
}
