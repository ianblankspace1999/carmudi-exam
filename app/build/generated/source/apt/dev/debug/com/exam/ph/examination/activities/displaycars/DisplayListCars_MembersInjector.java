package com.exam.ph.examination.activities.displaycars;

import com.exam.ph.examination.restclient.restinterface.TestInterface;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DisplayListCars_MembersInjector implements MembersInjector<DisplayListCars> {
  private final Provider<TestInterface> mTestInterfaceProvider;

  private final Provider<DisplayListCarsPresenter> mDisplayListUserPresenterProvider;

  public DisplayListCars_MembersInjector(
      Provider<TestInterface> mTestInterfaceProvider,
      Provider<DisplayListCarsPresenter> mDisplayListUserPresenterProvider) {
    assert mTestInterfaceProvider != null;
    this.mTestInterfaceProvider = mTestInterfaceProvider;
    assert mDisplayListUserPresenterProvider != null;
    this.mDisplayListUserPresenterProvider = mDisplayListUserPresenterProvider;
  }

  public static MembersInjector<DisplayListCars> create(
      Provider<TestInterface> mTestInterfaceProvider,
      Provider<DisplayListCarsPresenter> mDisplayListUserPresenterProvider) {
    return new DisplayListCars_MembersInjector(
        mTestInterfaceProvider, mDisplayListUserPresenterProvider);
  }

  @Override
  public void injectMembers(DisplayListCars instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    com.exam.ph.examination.BaseActivity_MembersInjector.injectMTestInterface(
        instance, mTestInterfaceProvider);
    instance.mDisplayListUserPresenter = mDisplayListUserPresenterProvider.get();
  }

  public static void injectMDisplayListUserPresenter(
      DisplayListCars instance,
      Provider<DisplayListCarsPresenter> mDisplayListUserPresenterProvider) {
    instance.mDisplayListUserPresenter = mDisplayListUserPresenterProvider.get();
  }
}
