package com.ismaker.devilish.user

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner

class CreateMyDevilish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_my_devilish)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val user = MyDevilish(
            name = "My user (Devilish)",
            email = "email@moogpt.kr",
            password = "abc123",
            profilePictureUrl = "https://private-user-images.githubusercontent.com/180175560/373643831-c8b4692d-b2f2-452c-9e9f-147b5c84509a.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjgwNDY2NTAsIm5iZiI6MTcyODA0NjM1MCwicGF0aCI6Ii8xODAxNzU1NjAvMzczNjQzODMxLWM4YjQ2OTJkLWIyZjItNDUyYy05ZTlmLTE0N2I1Yzg0NTA5YS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQxMDA0JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MTAwNFQxMjUyMzBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yNWNlZjNiNzg2YjA4MTM3YTE4YzAwNWE3OTc5ZGRiYjBjNzFiMjgxZmVjNmM1ZmE4YTQ4NmM1MWQzNjUzZjBmJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.KS7ImyD5UXBURlrQQ_AP-9Z8w58BLbIN491XINcZwsE"
        )

        val spinnerGender = findViewById<Spinner>(R.id.spinnerGender)
        val spinnerAge = findViewById<Spinner>(R.id.spinnerAge)
        val listViewInterests = findViewById<ListView>(R.id.listViewInterests)

        // Populate Gender Spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.genders, // Create a genders array in strings.xml or dynamically
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerGender.adapter = adapter
        }

        // Populate Age Spinner
        ArrayAdapter.createFromResource(
            this,
            R.array.age_groups, // Create an age_groups array in strings.xml or dynamically
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerAge.adapter = adapter
        }

        // Populate Interests ListView
        val interests = arrayOf("Technology", "Sports", "Music", "Reading", "Travel")
        val interestsAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_multiple_choice,
            interests
        )
        
        listViewInterests.adapter = interestsAdapter
        listViewInterests.choiceMode = ListView.CHOICE_MODE_MULTIPLE
    }
}

        // Example: Display the user's data
        println("You can passed username $user added!")
        
        // You might want to save this user data to a database or shared preferences.
    }
}
