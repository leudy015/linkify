package com.dynamiclinks

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactNativeHost
import com.facebook.react.bridge.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactModuleProvider
import com.facebook.react.bridge.JavaScriptModule
import java.util.*

class DynamicLinksPackage : ReactPackage {
  override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
    return listOf(DynamicLinksModule(reactContext))
  }

  override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
    return emptyList()
  }
}
