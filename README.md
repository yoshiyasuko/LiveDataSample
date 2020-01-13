## LiveDataSample

MVVM + LiveDataのサンプル。

中央のボタンを押すとボタンのテキストが変わる。

MainViewModelで `buttonText` をLiveDataとして持ち、MainActivityでObserveしている。

ボタンの押下をトリガーとして、buttonTextが更新され、ボタンのテキストが更新された値に変わる。

MainViewModelはKoinを利用してMainActivityでDIしている。