/*
* Copyright (C) 2024 Matthias Urhahn, and MooGPT Inc.
* 
* Licensed under the CC-BY, version 4.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      https://creativecommons.org/licenses/by-sa/4.0/deed.ru
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.ismaker.devilish.group

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class CreateGroupChatActivity : AppCompatActivity() {

    private lateinit var groupImageView: ImageView
    private lateinit var titleEditText: EditText
    private lateinit var descriptionEditText: EditText
    private lateinit var interestsEditText: EditText
    private lateinit var createButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_group_chat)

        groupImageView = findViewById(R.id.groupImageView)
        titleEditText = findViewById(R.id.titleEditText)
        descriptionEditText = findViewById(R.id.descriptionEditText)
        interestsEditText = findViewById(R.id.interestsEditText)
        createButton = findViewById(R.id.createButton)

        createButton.setOnClickListener {
            createGroupChat()
        }
    }

    private fun createGroupChat() {
        val title = titleEditText.text.toString()
        val description = descriptionEditText.text.toString()
        val interests = interestsEditText.text.toString()

        // Implement the logic to create a new group chat and add it to the database
    }
}
