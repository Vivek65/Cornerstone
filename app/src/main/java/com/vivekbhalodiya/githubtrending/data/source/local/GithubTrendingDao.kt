/*
 * Created by Vivek Bhalodiya on 19/11/19 2:25 PM
 * Copyright (c) 2019 . All rights reserved.
 * Last modified 19/11/19 2:25 PM
 */

package com.vivekbhalodiya.githubtrending.data.source.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vivekbhalodiya.githubtrending.data.GithubTrendingResponse
import io.reactivex.Single

/**
 * Created by Vivek Patel on 2019-11-19.
 */

@Dao
interface GithubTrendingDao {

    @Query("SELECT * FROM trendingrepos")
    fun queryGithubTrendingRepos(): Single<List<GithubTrendingResponse>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllGithubTrendingRepos(githubTrendingRepos: List<GithubTrendingResponse>)
}