package tmttyped.std

import tmttyped.std.stdStrings.addtrack
import tmttyped.std.stdStrings.removetrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A stream of media content. A stream consists of several tracks such as video or audio tracks. Each track is specified as an instance of MediaStreamTrack. */
@js.native
trait MediaStream
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  val active: scala.Boolean = js.native
  
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  def addTrack(track: org.scalajs.dom.MediaStreamTrack): Unit = js.native
  
  /* standard DOM */
  def getAudioTracks(): js.Array[org.scalajs.dom.MediaStreamTrack] = js.native
  
  /* standard DOM */
  def getTrackById(trackId: java.lang.String): org.scalajs.dom.MediaStreamTrack | Null = js.native
  
  /* standard DOM */
  def getTracks(): js.Array[org.scalajs.dom.MediaStreamTrack] = js.native
  
  /* standard DOM */
  def getVideoTracks(): js.Array[org.scalajs.dom.MediaStreamTrack] = js.native
  
  /* standard DOM */
  val id: java.lang.String = js.native
  
  /* standard DOM */
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any]) | Null = js.native
  
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  def removeTrack(track: org.scalajs.dom.MediaStreamTrack): Unit = js.native
}
