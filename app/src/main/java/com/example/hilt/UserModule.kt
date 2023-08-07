package com.example.hilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
abstract class UserModule {

    //if we are unable to use Inject annotation then we have to use Module and Provide Annotation
    @Provides
    @Named
    fun provideSqlRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }

    @Provides
    @FireBaseQualifier
    fun providesFireBaseRepository(): UserRepository {
        return FireBaseRepository()
    }

/*    // to bind interface with sqlRepository
    @Binds
    abstract fun bindsUserRepository(sqlRepository: SQLRepository):UserRepository*/
}

