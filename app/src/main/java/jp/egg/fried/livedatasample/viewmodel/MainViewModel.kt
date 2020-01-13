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

    //region: properties
    private val buttonTextList: List<String> = listOf(
        "テキストが変わるボタン",
        "何かに変わるよ",
        "同じテキストが選ばれることもあるよ",
        "どれに変わるかな？",
        "これはLiveDataのサンプルだよ",
        "ここを押すとLiveDataが更新されるよ"
    )
    //endregion


    //region: public methods
    fun initialize() {
        // 初期値はリストの先頭
        _buttonText.value = buttonTextList.first()
    }

    fun onButtonClick() {
        // リストからランダムでテキストを選ぶ
        _buttonText.value = buttonTextList[(0..buttonTextList.lastIndex).shuffled().first()]
    }
    //endregion

}