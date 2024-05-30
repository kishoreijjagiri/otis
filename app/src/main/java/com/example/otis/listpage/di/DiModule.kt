package com.example.otis.listpage.di

import com.example.otis.listpage.data.network.RetrofitInterface
import com.example.otis.listpage.domain.Repository
import com.example.otis.listpage.domain.RepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DiModule {


    @Provides
    @Singleton
    fun provideRetrofit() =Retrofit.Builder()
        .baseUrl("https://api.jsonbin.io/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit) = retrofit.create(RetrofitInterface::class.java)

    @Provides
    fun provideRepository(api: RetrofitInterface): Repository = RepositoryImpl(api)


}