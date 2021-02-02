package com.example.mydiary

import android.app.Application

class App: Application() {

    val notes = mutableListOf<Note>()

}