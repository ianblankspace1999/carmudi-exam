package com.exam.ph.examination.dagger;

import com.exam.ph.examination.BaseActivity;
import com.exam.ph.examination.BaseActivity_MembersInjector;
import com.exam.ph.examination.activities.displaycars.DisplayListCars;
import com.exam.ph.examination.activities.displaycars.DisplayListCarsPresenter;
import com.exam.ph.examination.activities.displaycars.DisplayListCars_MembersInjector;
import com.exam.ph.examination.activities.displayspecificuser.DisplaySpecificUser;
import com.exam.ph.examination.activities.displayspecificuser.DisplaySpecificUserPresenter;
import com.exam.ph.examination.activities.displayspecificuser.DisplaySpecificUser_MembersInjector;
import com.exam.ph.examination.restclient.restinterface.TestInterface;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<Converter.Factory> provideGsonConverterProvider;

  private Provider<HttpLoggingInterceptor> provideInterceptotProvider;

  private Provider<OkHttpClient> provideOkHttpProvider;

  private Provider<String> provideBaseUrlStringProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<TestInterface> provideTestInterfaceProvider;

  private Provider<DisplayListCarsPresenter> provideDisplayUserListPresenterProvider;

  private MembersInjector<DisplayListCars> displayListCarsMembersInjector;

  private MembersInjector<BaseActivity> baseActivityMembersInjector;

  private Provider<DisplaySpecificUserPresenter> provideDisplayUserSpecificPresenterProvider;

  private MembersInjector<DisplaySpecificUser> displaySpecificUserMembersInjector;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideGsonConverterProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideGsonConverterFactory.create(builder.networkModule));

    this.provideInterceptotProvider =
        DoubleCheck.provider(NetworkModule_ProvideInterceptotFactory.create(builder.networkModule));

    this.provideOkHttpProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideOkHttpFactory.create(
                builder.networkModule, provideInterceptotProvider));

    this.provideBaseUrlStringProvider =
        NetworkModule_ProvideBaseUrlStringFactory.create(builder.networkModule);

    this.provideRetrofitProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideRetrofitFactory.create(
                builder.networkModule,
                provideGsonConverterProvider,
                provideOkHttpProvider,
                provideBaseUrlStringProvider));

    this.provideTestInterfaceProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideTestInterfaceFactory.create(
                builder.networkModule, provideRetrofitProvider));

    this.provideDisplayUserListPresenterProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideDisplayUserListPresenterFactory.create(builder.presenterModule));

    this.displayListCarsMembersInjector =
        DisplayListCars_MembersInjector.create(
            provideTestInterfaceProvider, provideDisplayUserListPresenterProvider);

    this.baseActivityMembersInjector =
        BaseActivity_MembersInjector.create(provideTestInterfaceProvider);

    this.provideDisplayUserSpecificPresenterProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideDisplayUserSpecificPresenterFactory.create(
                builder.presenterModule));

    this.displaySpecificUserMembersInjector =
        DisplaySpecificUser_MembersInjector.create(
            provideTestInterfaceProvider, provideDisplayUserSpecificPresenterProvider);
  }

  @Override
  public void inject(DisplayListCars activity) {
    displayListCarsMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(BaseActivity activity) {
    baseActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(DisplaySpecificUser activity) {
    displaySpecificUserMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private NetworkModule networkModule;

    private PresenterModule presenterModule;

    private Builder() {}

    public AppComponent build() {
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (presenterModule == null) {
        this.presenterModule = new PresenterModule();
      }
      return new DaggerAppComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder presenterModule(PresenterModule presenterModule) {
      this.presenterModule = Preconditions.checkNotNull(presenterModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }
  }
}
