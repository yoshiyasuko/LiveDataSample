package jp.egg.fried.livedatasample.view.common


/**
 * ViewState
 *
 * Created by Yoshiyasu on 2020-01-14
 */

sealed class ViewState {

    /**
     * 初期の状態
     */
    object Initialize : ViewState()

    /**
     * 処理中
     */
    object UnderProcess : ViewState()

    /**
     * データを表示する
     */
    object Display : ViewState()

}