package jp.egg.fried.livedatasample

import android.app.Application
import jp.egg.fried.livedatasample.module.viewModelModule
import org.koin.android.ext.android.startKoin


/**
 * MainApplication
 *
 * Created by Yoshiyasu on 2020-01-14
 */

class MainApplication : Application() {

    //region: override Application

    override fun onCreate() {
        super.onCreate()

        //Koinの開始
        startKoin(
            this,
            listOf(
                viewModelModule
            )
        )
    }
    //endregion

}