package tmttyped.std

import tmttyped.std.stdStrings.updatefound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This ServiceWorker API interface represents the service worker registration. You register a service worker to control one or more pages that share the same origin.
  * Available only in secure contexts.
  */
@js.native
trait ServiceWorkerRegistration
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  val active: org.scalajs.dom.ServiceWorker | Null = js.native
  
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  def getNotifications(): js.Promise[js.Array[org.scalajs.dom.Notification]] = js.native
  def getNotifications(filter: org.scalajs.dom.GetNotificationOptions): js.Promise[js.Array[org.scalajs.dom.Notification]] = js.native
  
  /* standard DOM */
  val installing: org.scalajs.dom.ServiceWorker | Null = js.native
  
  /* standard DOM */
  var onupdatefound: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  val pushManager: org.scalajs.dom.PushManager = js.native
  
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  val scope: java.lang.String = js.native
  
  /* standard DOM */
  def showNotification(title: java.lang.String): js.Promise[Unit] = js.native
  def showNotification(title: java.lang.String, options: org.scalajs.dom.NotificationOptions): js.Promise[Unit] = js.native
  
  /* standard DOM */
  def unregister(): js.Promise[scala.Boolean] = js.native
  
  /* standard DOM */
  def update(): js.Promise[Unit] = js.native
  
  /* standard DOM */
  val updateViaCache: ServiceWorkerUpdateViaCache = js.native
  
  /* standard DOM */
  val waiting: org.scalajs.dom.ServiceWorker | Null = js.native
}
