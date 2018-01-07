package com.exam.ph.examination.activities.displayspecificuser;

import com.exam.ph.examination.restclient.restinterface.TestInterface;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DisplaySpecificUser_MembersInjector
    implements MembersInjector<DisplaySpecificUser> {
  private final Provider<TestInterface> mTestInterfaceProvider;

  private final Provider<DisplaySpecificUserPresenter> mDisplaySpecificUserPresenterProvider;

  public DisplaySpecificUser_MembersInjector(
      Provider<TestInterface> mTestInterfaceProvider,
      Provider<DisplaySpecificUserPresenter> mDisplaySpecificUserPresenterProvider) {
    assert mTestInterfaceProvider != null;
    this.mTestInterfaceProvider = mTestInterfaceProvider;
    assert mDisplaySpecificUserPresenterProvider != null;
    this.mDisplaySpecificUserPresenterProvider = mDisplaySpecificUserPresenterProvider;
  }

  public static MembersInjector<DisplaySpecificUser> create(
      Provider<TestInterface> mTestInterfaceProvider,
      Provider<DisplaySpecificUserPresenter> mDisplaySpecificUserPresenterProvider) {
    return new DisplaySpecificUser_MembersInjector(
        mTestInterfaceProvider, mDisplaySpecificUserPresenterProvider);
  }

  @Override
  public void injectMembers(DisplaySpecificUser instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    com.exam.ph.examination.BaseActivity_MembersInjector.injectMTestInterface(
        instance, mTestInterfaceProvider);
    instance.mDisplaySpecificUserPresenter = mDisplaySpecificUserPresenterProvider.get();
  }

  public static void injectMDisplaySpecificUserPresenter(
      DisplaySpecificUser instance,
      Provider<DisplaySpecificUserPresenter> mDisplaySpecificUserPresenterProvider) {
    instance.mDisplaySpecificUserPresenter = mDisplaySpecificUserPresenterProvider.get();
  }
}
