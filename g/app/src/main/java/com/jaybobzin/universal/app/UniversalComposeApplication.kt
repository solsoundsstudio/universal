package com.jaybobzin.universal.app

import android.app.Application
import co.touchlab.kermit.Logger
import com.jaybobzin.universal.app.BuildConfig
import com.jaybobzin.universal.common.di.initKoin
import com.jaybobzin.universal.app.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.osmdroid.config.Configuration
import java.io.File

class UniversalComposeApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // needed for osmandroid
        Configuration.getInstance().userAgentValue = BuildConfig.APPLICATION_ID
        Configuration.getInstance().osmdroidTileCache = File(cacheDir, "osm").also {
            it.mkdir()
        }

        initKoin {
            androidLogger()
            androidContext(this@UniversalComposeApplication)
            modules(appModule)
        }

        Logger.d { "UniversalComposeApplication" }
    }
}
