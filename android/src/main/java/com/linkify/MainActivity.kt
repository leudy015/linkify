package com.dynamiclinks

import com.facebook.react.ReactActivity
import android.content.Intent
import android.os.Bundle

class MainActivity : ReactActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // Custom logic can be added here
  }

  override fun onNewIntent(intent: Intent?) {
    super.onNewIntent(intent)
    intent?.data?.let {
      // Send this link to JavaScript
    }
  }
}
