package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Push API interface provides a way to receive notifications from third-party servers as well as request URLs for push notifications.
  * Available only in secure contexts.
  */
@js.native
trait PushManager extends StObject {
  
  /* standard DOM */
  def getSubscription(): js.Promise[org.scalajs.dom.PushSubscription | Null] = js.native
  
  /* standard DOM */
  def permissionState(): js.Promise[org.scalajs.dom.PushPermissionState] = js.native
  def permissionState(options: PushSubscriptionOptionsInit): js.Promise[org.scalajs.dom.PushPermissionState] = js.native
  
  /* standard DOM */
  def subscribe(): js.Promise[org.scalajs.dom.PushSubscription] = js.native
  def subscribe(options: PushSubscriptionOptionsInit): js.Promise[org.scalajs.dom.PushSubscription] = js.native
}
