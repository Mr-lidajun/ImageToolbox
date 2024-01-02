package ru.tech.imageresizershrinker.coreui.app

import android.app.Application
import com.google.mlkit.common.sdkinternal.MlKitContext
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class ImageApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MlKitContext.initializeIfNeeded(this)
    }
}