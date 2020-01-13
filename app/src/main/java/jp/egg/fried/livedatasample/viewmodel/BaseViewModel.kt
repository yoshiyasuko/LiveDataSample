package jp.egg.fried.livedatasample.viewmodel

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import jp.egg.fried.livedatasample.view.common.ViewState


/**
 * BaseViewModel
 *
 * Created by Yoshiyasu on 2020-01-14
 */

open class BaseViewModel : ViewModel() {

    //region: protected
    protected val _viewState = MediatorLiveData<ViewState>()
    //endregion

}