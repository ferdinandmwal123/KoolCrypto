package com.mwalagho.ferdinand.koolcrypto.di

import com.mwalagho.ferdinand.koolcrypto.common.Constants
import com.mwalagho.ferdinand.koolcrypto.data.remote.CoinPaprikaAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
/*
* Component 	       Injector for
* SingletonComponent 	Application
* */
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaAPI {

        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaAPI::class.java)

    }

    @
}