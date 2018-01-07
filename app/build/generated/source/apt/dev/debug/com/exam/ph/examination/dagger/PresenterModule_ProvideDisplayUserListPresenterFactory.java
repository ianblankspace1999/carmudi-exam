package com.exam.ph.examination.dagger;

import com.exam.ph.examination.activities.displaycars.DisplayListCarsPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideDisplayUserListPresenterFactory
    implements Factory<DisplayListCarsPresenter> {
  private final PresenterModule module;

  public PresenterModule_ProvideDisplayUserListPresenterFactory(PresenterModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DisplayListCarsPresenter get() {
    return Preconditions.checkNotNull(
        module.provideDisplayUserListPresenter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DisplayListCarsPresenter> create(PresenterModule module) {
    return new PresenterModule_ProvideDisplayUserListPresenterFactory(module);
  }
}
