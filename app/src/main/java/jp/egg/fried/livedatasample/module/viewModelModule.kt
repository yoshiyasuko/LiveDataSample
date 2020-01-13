package jp.egg.fried.livedatasample.module

import jp.egg.fried.livedatasample.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module


/**
 * viewModelModule
 *
 * Created by Yoshiyasu on 2020-01-14
 */

val viewModelModule = module {
    viewModel { MainViewModel() }
}