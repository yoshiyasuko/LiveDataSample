package jp.egg.fried.livedatasample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import jp.egg.fried.livedatasample.R
import jp.egg.fried.livedatasample.databinding.ActivityMainBinding
import jp.egg.fried.livedatasample.viewmodel.MainViewModel
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

        binding?.button?.setOnClickListener {
            onClickButtonListener.invoke()
        }

        setupObserver()

        viewModel.initialize()
    }
    //endregion

    //region: private methods
    private fun setupObserver() {
        val binding = binding!!

        // MainViewModelのbuttonTextを購読してボタンのテキストにセットする
        viewModel.buttonText.observe(this, Observer { text ->
            binding.button.text = text
        })

    }
    //endregion

    //region: listeners
    private val onClickButtonListener = {
        viewModel.onButtonClick()
    }
    //endregion


}
