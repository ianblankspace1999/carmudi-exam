package com.exam.ph.examination.activities.displaycars;

import com.exam.ph.examination.BaseViewPresenter;
import com.exam.ph.examination.restclient.LoadAction;
import com.exam.ph.examination.restclient.restinterface.TestInterface;

/**
 * Created by IanBlanco on 12/26/2017.
 */

public interface DisplayListCarsPresenter extends BaseViewPresenter {

    void attachView(DisplayListCarView displayListCarView);
    void loadData(TestInterface testInterface, LoadAction loadAction, int page, String category);
}
