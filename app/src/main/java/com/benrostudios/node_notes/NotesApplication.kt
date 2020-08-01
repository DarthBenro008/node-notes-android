package com.benrostudios.node_notes

import android.app.Application
import com.benrostudios.node_notes.di.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class NotesApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@NotesApplication)
            modules(appComponent)
        }
    }
}