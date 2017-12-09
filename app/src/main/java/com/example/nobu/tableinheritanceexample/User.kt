package com.example.nobu.tableinheritanceexample

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.Query



@Entity
class User(
        @PrimaryKey
        val id: Long,
        val name: String
)

@Dao
interface UserDao {
    @Query("select * from user")
    fun findAll(): List<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg users: User)

}