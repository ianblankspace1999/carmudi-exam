package com.exam.ph.examination.dagger;

import com.exam.ph.examination.activities.displayspecificuser.DisplaySpecificUserPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideDisplayUserSpecificPresenterFactory
    implements Factory<DisplaySpecificUserPresenter> {
  private final PresenterModule module;

  public PresenterModule_ProvideDisplayUserSpecificPresenterFactory(PresenterModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DisplaySpecificUserPresenter get() {
    return Preconditions.checkNotNull(
        module.provideDisplayUserSpecificPresenter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DisplaySpecificUserPresenter> create(PresenterModule module) {
    return new PresenterModule_ProvideDisplayUserSpecificPresenterFactory(module);
  }
}
