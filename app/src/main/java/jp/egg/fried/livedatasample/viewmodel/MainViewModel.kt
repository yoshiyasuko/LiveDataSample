package jp.egg.fried.livedatasample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


/**
 * MainViewModel
 *
 * Created by Yoshiyasu on 2020-01-14
 */

class MainViewModel : ViewModel() {

    //region: LiveData
    private val _buttonText = MutableLiveData<String>()
    val buttonText: LiveData<String> = _buttonText
    //endregion

}