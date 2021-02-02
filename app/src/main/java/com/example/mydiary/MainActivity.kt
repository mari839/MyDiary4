package com.example.mydiary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        memoriesButton.setOnClickListener {
            startActivity(Intent(this, PersonActivity::class.java))
        }

        saveButton.setOnClickListener {
            if (dateEditText.text.toString().isEmpty() || personNameEditText.text.toString().isEmpty() || diaryEditText.text.toString().isEmpty()) {
                Toast.makeText(this, "Empty", Toast.LENGTH_SHORT).show()
            }else {
                (application as App).notes.add(Note(personNameEditText.text.toString(), dateEditText.text.toString().toInt(), diaryEditText.text.toString()))
                dateEditText.text?.clear()
                personNameEditText.text?.clear()
                diaryEditText.text?.clear()
            }
        }

    }

}