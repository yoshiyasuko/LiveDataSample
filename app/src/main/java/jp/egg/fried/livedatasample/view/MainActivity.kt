package jp.egg.fried.livedatasample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.egg.fried.livedatasample.R
import jp.egg.fried.livedatasample.module.viewModelModule
import jp.egg.fried.livedatasample.viewmodel.MainViewModel
import org.koin.android.ext.android.startKoin
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    //region: properties
    private val binding
    private val viewModel: MainViewModel by viewModel()
    //endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}
