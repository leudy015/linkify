import Foundation
import React

@objc(DynamicLinksModule)
class DynamicLinksModule: NSObject {

  @objc static func requiresMainQueueSetup() -> Bool {
    return true
  }

  @objc func getInitialLink(_ resolve: @escaping RCTPromiseResolveBlock, reject: @escaping RCTPromiseRejectBlock) {
    if let url = UserDefaults.standard.string(forKey: "initialLink") {
        resolve(url)
    } else {
        resolve(nil)
    }
  }

  @objc func listenForDynamicLink() {
    NotificationCenter.default.addObserver(
        self,
        selector: #selector(handleIncomingDynamicLink(notification:)),
        name: NSNotification.Name("DynamicLinkOpened"),
        object: nil
    )
  }

  @objc private func handleIncomingDynamicLink(notification: Notification) {
    if let url = notification.object as? URL {
        print("Dynamic Link recibido: \(url.absoluteString)")
    }
  }
}
