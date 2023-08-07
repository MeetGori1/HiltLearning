package com.example.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    fun providesUserRepository(): UserRepository {
        return FireBaseRepository()
    }
}

