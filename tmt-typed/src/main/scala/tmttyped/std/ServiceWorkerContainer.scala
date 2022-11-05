package tmttyped.std

import tmttyped.std.stdStrings.controllerchange
import tmttyped.std.stdStrings.message
import tmttyped.std.stdStrings.messageerror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ServiceWorkerContainer interface of the ServiceWorker API provides an object representing the service worker as an overall unit in the network ecosystem, including facilities to register, unregister and update service workers, and access the state of service workers and their registrations.
  * Available only in secure contexts.
  */
@js.native
trait ServiceWorkerContainer
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  val controller: org.scalajs.dom.ServiceWorker | Null = js.native
  
  /* standard DOM */
  def getRegistration(): js.Promise[js.UndefOr[org.scalajs.dom.ServiceWorkerRegistration]] = js.native
  def getRegistration(clientURL: java.lang.String): js.Promise[js.UndefOr[org.scalajs.dom.ServiceWorkerRegistration]] = js.native
  def getRegistration(clientURL: org.scalajs.dom.URL): js.Promise[js.UndefOr[org.scalajs.dom.ServiceWorkerRegistration]] = js.native
  
  /* standard DOM */
  def getRegistrations(): js.Promise[js.Array[org.scalajs.dom.ServiceWorkerRegistration]] = js.native
  
  /* standard DOM */
  var oncontrollerchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any]) | Null = js.native
  
  /* standard DOM */
  val ready: js.Promise[org.scalajs.dom.ServiceWorkerRegistration] = js.native
  
  /* standard DOM */
  def register(scriptURL: java.lang.String): js.Promise[org.scalajs.dom.ServiceWorkerRegistration] = js.native
  def register(scriptURL: java.lang.String, options: RegistrationOptions): js.Promise[org.scalajs.dom.ServiceWorkerRegistration] = js.native
  def register(scriptURL: org.scalajs.dom.URL): js.Promise[org.scalajs.dom.ServiceWorkerRegistration] = js.native
  def register(scriptURL: org.scalajs.dom.URL, options: RegistrationOptions): js.Promise[org.scalajs.dom.ServiceWorkerRegistration] = js.native
  
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  def startMessages(): Unit = js.native
}
