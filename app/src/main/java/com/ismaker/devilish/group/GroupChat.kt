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
