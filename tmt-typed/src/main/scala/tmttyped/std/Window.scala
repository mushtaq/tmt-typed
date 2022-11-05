package tmttyped.std

import org.scalablytyped.runtime.NumberDictionary
import tmttyped.std.stdStrings.DOMContentLoaded
import tmttyped.std.stdStrings.devicemotion
import tmttyped.std.stdStrings.deviceorientation
import tmttyped.std.stdStrings.orientationchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A window containing a DOM document; the document property points to the DOM document loaded in that window. */
@js.native
trait Window
  extends StObject
     with EventTarget
     with AnimationFrameProvider
     with GlobalEventHandlers
     with WindowEventHandlers
     with WindowLocalStorage
     with WindowOrWorkerGlobalScope
     with WindowSessionStorage
     with /* standard DOM */
/* index */ NumberDictionary[org.scalajs.dom.Window] {
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_DOMContentLoaded(
    `type`: DOMContentLoaded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_DOMContentLoaded(
    `type`: DOMContentLoaded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_DOMContentLoaded(
    `type`: DOMContentLoaded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  def alert(): Unit = js.native
  def alert(message: Any): Unit = js.native
  
  /* standard DOM */
  def blur(): Unit = js.native
  
  /* standard DOM */
  def cancelIdleCallback(handle: Double): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  def captureEvents(): Unit = js.native
  
  /** @deprecated This is a legacy alias of `navigator`. */
  /* standard DOM */
  val clientInformation: org.scalajs.dom.Navigator = js.native
  
  /** Closes the window. */
  /* standard DOM */
  def close(): Unit = js.native
  
  /** Returns true if the window has been closed, false otherwise. */
  /* standard DOM */
  val closed: scala.Boolean = js.native
  
  /* standard DOM */
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
  
  /** Defines a new custom element, mapping the given name to the given constructor as an autonomous custom element. */
  /* standard DOM */
  val customElements: CustomElementRegistry = js.native
  
  /* standard DOM */
  val devicePixelRatio: Double = js.native
  
  /* standard DOM */
  val document: org.scalajs.dom.Document = js.native
  
  /** @deprecated */
  /* standard DOM */
  val event: js.UndefOr[org.scalajs.dom.Event] = js.native
  
  /** @deprecated */
  /* standard DOM */
  val external: org.scalajs.dom.External = js.native
  
  /** Moves the focus to the window's browsing context, if any. */
  /* standard DOM */
  def focus(): Unit = js.native
  
  /* standard DOM */
  val frameElement: org.scalajs.dom.Element | Null = js.native
  
  /* standard DOM */
  val frames: org.scalajs.dom.Window = js.native
  
  /* standard DOM */
  def getComputedStyle(elt: org.scalajs.dom.Element): org.scalajs.dom.CSSStyleDeclaration = js.native
  def getComputedStyle(elt: org.scalajs.dom.Element, pseudoElt: java.lang.String): org.scalajs.dom.CSSStyleDeclaration = js.native
  
  /* standard DOM */
  def getSelection(): org.scalajs.dom.Selection | Null = js.native
  
  /* standard DOM */
  val history: org.scalajs.dom.History = js.native
  
  /* standard DOM */
  val innerHeight: Double = js.native
  
  /* standard DOM */
  val innerWidth: Double = js.native
  
  /* standard DOM */
  val length: Double = js.native
  
  /* standard DOM */
  def location: org.scalajs.dom.Location = js.native
  /* standard DOM */
  def location_=(href: java.lang.String | org.scalajs.dom.Location): Unit = js.native
  
  /** Returns true if the location bar is visible; otherwise, returns false. */
  /* standard DOM */
  val locationbar: BarProp = js.native
  
  /* standard DOM */
  def matchMedia(query: java.lang.String): org.scalajs.dom.MediaQueryList = js.native
  
  /** Returns true if the menu bar is visible; otherwise, returns false. */
  /* standard DOM */
  val menubar: BarProp = js.native
  
  /* standard DOM */
  def moveBy(x: Double, y: Double): Unit = js.native
  
  /* standard DOM */
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /* standard DOM */
  var name: java.lang.String = js.native
  
  /* standard DOM */
  val navigator: org.scalajs.dom.Navigator = js.native
  
  /** Available only in secure contexts. */
  /* standard DOM */
  var ondevicemotion: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any]) | Null = js.native
  
  /** Available only in secure contexts. */
  /* standard DOM */
  var ondeviceorientation: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]) | Null = js.native
  
  /** @deprecated */
  /* standard DOM */
  var onorientationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  def open(): org.scalajs.dom.Window | Null = js.native
  def open(url: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: java.lang.String, target: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: java.lang.String, target: java.lang.String, features: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: java.lang.String, target: Unit, features: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: org.scalajs.dom.URL): org.scalajs.dom.Window | Null = js.native
  def open(url: org.scalajs.dom.URL, target: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: org.scalajs.dom.URL, target: java.lang.String, features: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: org.scalajs.dom.URL, target: Unit, features: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: Unit, target: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: Unit, target: java.lang.String, features: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: Unit, target: Unit, features: java.lang.String): org.scalajs.dom.Window | Null = js.native
  
  /* standard DOM */
  var opener: Any = js.native
  
  /** @deprecated */
  /* standard DOM */
  val orientation: Double = js.native
  
  /* standard DOM */
  val outerHeight: Double = js.native
  
  /* standard DOM */
  val outerWidth: Double = js.native
  
  /** @deprecated This is a legacy alias of `scrollX`. */
  /* standard DOM */
  val pageXOffset: Double = js.native
  
  /** @deprecated This is a legacy alias of `scrollY`. */
  /* standard DOM */
  val pageYOffset: Double = js.native
  
  /**
    * Refers to either the parent WindowProxy, or itself.
    *
    * It can rarely be null e.g. for contentWindow of an iframe that is already removed from the parent.
    */
  /* standard DOM */
  val parent: org.scalajs.dom.Window = js.native
  
  /** Returns true if the personal bar is visible; otherwise, returns false. */
  /* standard DOM */
  val personalbar: BarProp = js.native
  
  /* standard DOM */
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, options: WindowPostMessageOptions): Unit = js.native
  /**
    * Posts a message to the given window. Messages can be structured objects, e.g. nested objects and arrays, can contain JavaScript values (strings, numbers, Date objects, etc), and can contain certain data objects such as File Blob, FileList, and ArrayBuffer objects.
    *
    * Objects listed in the transfer member of options are transferred, not just cloned, meaning that they are no longer usable on the sending side.
    *
    * A target origin can be specified using the targetOrigin member of options. If not provided, it defaults to "/". This default restricts the message to same-origin targets only.
    *
    * If the origin of the target window doesn't match the given target origin, the message is discarded, to avoid information leakage. To send the message to the target regardless of origin, set the target origin to "*".
    *
    * Throws a "DataCloneError" DOMException if transfer array contains duplicate objects or if message could not be cloned.
    */
  /* standard DOM */
  def postMessage(message: Any, targetOrigin: java.lang.String): Unit = js.native
  def postMessage(message: Any, targetOrigin: java.lang.String, transfer: js.Array[Transferable]): Unit = js.native
  
  /* standard DOM */
  def print(): Unit = js.native
  
  /* standard DOM */
  def prompt(): java.lang.String | Null = js.native
  def prompt(message: java.lang.String): java.lang.String | Null = js.native
  def prompt(message: java.lang.String, _default: java.lang.String): java.lang.String | Null = js.native
  def prompt(message: Unit, _default: java.lang.String): java.lang.String | Null = js.native
  
  /** @deprecated */
  /* standard DOM */
  def releaseEvents(): Unit = js.native
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_DOMContentLoaded(
    `type`: DOMContentLoaded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_DOMContentLoaded(
    `type`: DOMContentLoaded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_DOMContentLoaded(
    `type`: DOMContentLoaded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  def requestIdleCallback(callback: IdleRequestCallback): Double = js.native
  def requestIdleCallback(callback: IdleRequestCallback, options: IdleRequestOptions): Double = js.native
  
  /* standard DOM */
  def resizeBy(x: Double, y: Double): Unit = js.native
  
  /* standard DOM */
  def resizeTo(width: Double, height: Double): Unit = js.native
  
  /* standard DOM */
  val screen: org.scalajs.dom.Screen = js.native
  
  /* standard DOM */
  val screenLeft: Double = js.native
  
  /* standard DOM */
  val screenTop: Double = js.native
  
  /* standard DOM */
  val screenX: Double = js.native
  
  /* standard DOM */
  val screenY: Double = js.native
  
  /* standard DOM */
  def scroll(): Unit = js.native
  def scroll(options: ScrollToOptions): Unit = js.native
  /* standard DOM */
  def scroll(x: Double, y: Double): Unit = js.native
  
  /* standard DOM */
  def scrollBy(): Unit = js.native
  def scrollBy(options: ScrollToOptions): Unit = js.native
  /* standard DOM */
  def scrollBy(x: Double, y: Double): Unit = js.native
  
  /* standard DOM */
  def scrollTo(): Unit = js.native
  def scrollTo(options: ScrollToOptions): Unit = js.native
  /* standard DOM */
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  /* standard DOM */
  val scrollX: Double = js.native
  
  /* standard DOM */
  val scrollY: Double = js.native
  
  /** Returns true if the scrollbars are visible; otherwise, returns false. */
  /* standard DOM */
  val scrollbars: BarProp = js.native
  
  /* standard DOM */
  val self: org.scalajs.dom.Window & (/* globalThis */ Any) = js.native
  
  /* standard DOM */
  val speechSynthesis: SpeechSynthesis = js.native
  
  /** @deprecated */
  /* standard DOM */
  var status: java.lang.String = js.native
  
  /** Returns true if the status bar is visible; otherwise, returns false. */
  /* standard DOM */
  val statusbar: BarProp = js.native
  
  /** Cancels the document load. */
  /* standard DOM */
  def stop(): Unit = js.native
  
  /** Returns true if the toolbar is visible; otherwise, returns false. */
  /* standard DOM */
  val toolbar: BarProp = js.native
  
  /* standard DOM */
  val top: org.scalajs.dom.Window | Null = js.native
  
  /* standard DOM */
  val visualViewport: VisualViewport | Null = js.native
  
  /* standard DOM */
  val window: org.scalajs.dom.Window & (/* globalThis */ Any) = js.native
}
