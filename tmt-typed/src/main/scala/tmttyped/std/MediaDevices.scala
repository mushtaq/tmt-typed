package tmttyped.std

import tmttyped.std.stdStrings.devicechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to connected media input devices like cameras and microphones, as well as screen sharing. In essence, it lets you obtain access to any hardware source of media data.
  * Available only in secure contexts.
  */
@js.native
trait MediaDevices
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  def enumerateDevices(): js.Promise[js.Array[org.scalajs.dom.MediaDeviceInfo]] = js.native
  
  /* standard DOM */
  def getDisplayMedia(): js.Promise[org.scalajs.dom.MediaStream] = js.native
  def getDisplayMedia(constraints: DisplayMediaStreamConstraints): js.Promise[org.scalajs.dom.MediaStream] = js.native
  
  /* standard DOM */
  def getSupportedConstraints(): org.scalajs.dom.MediaTrackSupportedConstraints = js.native
  
  /* standard DOM */
  def getUserMedia(): js.Promise[org.scalajs.dom.MediaStream] = js.native
  def getUserMedia(constraints: org.scalajs.dom.MediaStreamConstraints): js.Promise[org.scalajs.dom.MediaStream] = js.native
  
  /* standard DOM */
  var ondevicechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
}
