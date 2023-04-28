package com.artemissoftware.herculesworkmanager.di

import com.artemissoftware.herculesworkmanager.util.DemoHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ModuleApp {

    @Provides
    @Singleton
    fun provideDemoHelper(): DemoHelper {
        return DemoHelper()
    }
}