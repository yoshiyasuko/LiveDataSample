package jp.egg.fried.livedatasample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import jp.egg.fried.livedatasample.R
import jp.egg.fried.livedatasample.databinding.ActivityMainBinding
import jp.egg.fried.livedatasample.module.viewModelModule
import jp.egg.fried.livedatasample.viewmodel.MainViewModel
import org.koin.android.ext.android.startKoin
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    //region: properties
    private var binding: ActivityMainBinding? = null
    private val viewModel: MainViewModel by viewModel()
    //endregion


    //region: override MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        ).apply {
            lifecycleOwner = this@MainActivity
        }
    }
    //endregion


}
