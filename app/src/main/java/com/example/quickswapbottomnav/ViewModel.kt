package com.example.quickswapbottomnav

import android.app.Activity
import android.app.Application
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner


class MyViewModel(application: Application,
                  savedStateHandle: SavedStateHandle) : AndroidViewModel(application){

    class Factory(val application: Application,
                  val savedStateRegistryOwner: SavedStateRegistryOwner):
        AbstractSavedStateViewModelFactory(
            savedStateRegistryOwner,
            null) {

        override fun <T : ViewModel?> create(
            key: String,
            modelClass: Class<T>,
            handle: SavedStateHandle
        ): T {
            if (modelClass.isAssignableFrom(MyViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return MyViewModel(application, handle) as T
            }
            throw IllegalArgumentException("Unable to construct viewmodel")
        }
    }

    fun doSomething(): Int{
        return 5 + 4
    }

}