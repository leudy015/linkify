package com.dynamiclinks

import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class DynamicLinksModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return "DynamicLinksModule"
  }

  @ReactMethod
  fun getInitialLink(promise: Promise) {
    val link = getInitialLinkFromIntent()
    promise.resolve(link)
  }

  private fun getInitialLinkFromIntent(): String? {
    val intent: Intent = currentActivity?.intent ?: return null
    return intent.data?.toString()
  }
}
