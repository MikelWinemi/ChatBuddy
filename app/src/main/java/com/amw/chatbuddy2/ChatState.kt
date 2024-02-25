package com.amw.chatbuddy2

import android.graphics.Bitmap
import com.amw.chatbuddy2.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)