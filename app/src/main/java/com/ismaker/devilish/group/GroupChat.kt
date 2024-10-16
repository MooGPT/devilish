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
import android.widget.ListView
import android.widget.Toast

class GroupChatActivity : AppCompatActivity() {

    private lateinit var messageEditText: EditText
    private lateinit var sendButton: Button
    private lateinit var messagesListView: ListView
    private lateinit var kickButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_chat)

        messageEditText = findViewById(R.id.messageEditText)
        sendButton = findViewById(R.id.sendButton)
        messagesListView = findViewById(R.id.messagesListView)
        kickButton = findViewById(R.id.kickButton)

        sendButton.setOnClickListener {
            sendMessage()
        }

        kickButton.setOnClickListener {
            kickMember()
        }
    }

    private fun sendMessage() {
        val message = messageEditText.text.toString()
        // Code to send message to the group chat
    }

    private fun kickMember() {
        // Code to remove a member from the group chat
    }
}
