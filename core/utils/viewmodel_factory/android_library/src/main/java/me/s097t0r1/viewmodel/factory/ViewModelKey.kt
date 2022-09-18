package me.s097t0r1.viewmodel.factory

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
annotation class ViewModelKey(
    val viewModelClazz: KClass<out ViewModel>
)