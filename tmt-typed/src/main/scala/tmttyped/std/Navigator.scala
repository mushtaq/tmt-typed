package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities. */
@js.native
trait Navigator
  extends StObject
     with NavigatorAutomationInformation
     with NavigatorConcurrentHardware
     with NavigatorContentUtils
     with NavigatorCookies
     with NavigatorID
     with NavigatorLanguage
     with NavigatorLocks
     with NavigatorOnLine
     with NavigatorPlugins
     with NavigatorStorage {
  
  /** Available only in secure contexts. */
  /* standard DOM */
  def canShare(): scala.Boolean = js.native
  def canShare(data: ShareData): scala.Boolean = js.native
  
  /** Available only in secure contexts. */
  /* standard DOM */
  val clipboard: Clipboard = js.native
  
  /** Available only in secure contexts. */
  /* standard DOM */
  val credentials: CredentialsContainer = js.native
  
  /* standard DOM */
  val doNotTrack: java.lang.String | Null = js.native
  
  /* standard DOM */
  val geolocation: org.scalajs.dom.Geolocation = js.native
  
  /* standard DOM */
  def getGamepads(): js.Array[org.scalajs.dom.Gamepad | Null] = js.native
  
  /* standard DOM */
  val maxTouchPoints: Double = js.native
  
  /* standard DOM */
  val mediaCapabilities: MediaCapabilities = js.native
  
  /** Available only in secure contexts. */
  /* standard DOM */
  val mediaDevices: org.scalajs.dom.MediaDevices = js.native
  
  /* standard DOM */
  val mediaSession: MediaSession = js.native
  
  /* standard DOM */
  val permissions: Permissions = js.native
  
  /** Available only in secure contexts. */
  /* standard DOM */
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Array[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  /** Available only in secure contexts. */
  /* standard DOM.Iterable */
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Iterable[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  
  /* standard DOM */
  def sendBeacon(url: java.lang.String): scala.Boolean = js.native
  def sendBeacon(url: java.lang.String, data: BodyInit): scala.Boolean = js.native
  def sendBeacon(url: org.scalajs.dom.URL): scala.Boolean = js.native
  def sendBeacon(url: org.scalajs.dom.URL, data: BodyInit): scala.Boolean = js.native
  
  /** Available only in secure contexts. */
  /* standard DOM */
  val serviceWorker: org.scalajs.dom.ServiceWorkerContainer = js.native
  
  /** Available only in secure contexts. */
  /* standard DOM */
  def share(): js.Promise[Unit] = js.native
  def share(data: ShareData): js.Promise[Unit] = js.native
  
  /* standard DOM.Iterable */
  def vibrate(pattern: js.Iterable[Double]): scala.Boolean = js.native
  /* standard DOM */
  def vibrate(pattern: VibratePattern): scala.Boolean = js.native
}
