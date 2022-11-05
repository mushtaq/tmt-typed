package tmttyped.std

import tmttyped.std.stdStrings.error
import tmttyped.std.stdStrings.message
import tmttyped.std.stdStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSource
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  val CLOSED: Double = js.native
  
  /* standard DOM */
  val CONNECTING: Double = js.native
  
  /* standard DOM */
  val OPEN: Double = js.native
  
  /* standard DOM */
  def addEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
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
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** Aborts any instances of the fetch algorithm started for this EventSource object, and sets the readyState attribute to CLOSED. */
  /* standard DOM */
  def close(): Unit = js.native
  
  /* standard DOM */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MessageEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onopen: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** Returns the state of this EventSource object's connection. It can have the values described below. */
  /* standard DOM */
  val readyState: Double = js.native
  
  /* standard DOM */
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any]
  ): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ org.scalajs.dom.MessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
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
  def removeEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** Returns the URL providing the event stream. */
  /* standard DOM */
  val url: java.lang.String = js.native
  
  /** Returns true if the credentials mode for connection requests to the URL providing the event stream is set to "include", and false otherwise. */
  /* standard DOM */
  val withCredentials: scala.Boolean = js.native
}
