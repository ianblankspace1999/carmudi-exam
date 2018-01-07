package com.exam.ph.examination.dagger;



import com.exam.ph.examination.activities.displayspecificuser.DisplaySpecificUserPresenter;
import com.exam.ph.examination.activities.displayspecificuser.DisplaySpecificUserPresenterImpl;
import com.exam.ph.examination.activities.displaycars.DisplayListCarsPresenter;
import com.exam.ph.examination.activities.displaycars.DisplayListCarsPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ian.blanco on 12/26/2017.
 */
@Module
public class PresenterModule {


    @Provides
    @Singleton
    DisplayListCarsPresenter provideDisplayUserListPresenter() {
        return new DisplayListCarsPresenterImpl();
    }

    @Provides
    @Singleton
    DisplaySpecificUserPresenter provideDisplayUserSpecificPresenter() {
        return  new DisplaySpecificUserPresenterImpl();
    }
}
