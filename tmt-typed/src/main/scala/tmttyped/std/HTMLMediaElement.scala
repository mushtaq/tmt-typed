package tmttyped.std

import tmttyped.std.stdStrings._empty
import tmttyped.std.stdStrings.auto
import tmttyped.std.stdStrings.encrypted
import tmttyped.std.stdStrings.metadata
import tmttyped.std.stdStrings.none
import tmttyped.std.stdStrings.waitingforkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Adds to HTMLElement the properties and methods needed to support basic media-related capabilities that are common to audio and video. */
@js.native
trait HTMLMediaElement
  extends StObject
     with HTMLElement {
  
  /* standard DOM */
  val HAVE_CURRENT_DATA: Double = js.native
  
  /* standard DOM */
  val HAVE_ENOUGH_DATA: Double = js.native
  
  /* standard DOM */
  val HAVE_FUTURE_DATA: Double = js.native
  
  /* standard DOM */
  val HAVE_METADATA: Double = js.native
  
  /* standard DOM */
  val HAVE_NOTHING: Double = js.native
  
  /* standard DOM */
  val NETWORK_EMPTY: Double = js.native
  
  /* standard DOM */
  val NETWORK_IDLE: Double = js.native
  
  /* standard DOM */
  val NETWORK_LOADING: Double = js.native
  
  /* standard DOM */
  val NETWORK_NO_SOURCE: Double = js.native
  
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
  def addEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  def addTextTrack(kind: TextTrackKind): org.scalajs.dom.TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: java.lang.String): org.scalajs.dom.TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: java.lang.String, language: java.lang.String): org.scalajs.dom.TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: Unit, language: java.lang.String): org.scalajs.dom.TextTrack = js.native
  
  /** Gets or sets a value that indicates whether to start playing the media automatically. */
  /* standard DOM */
  var autoplay: scala.Boolean = js.native
  
  /** Gets a collection of buffered time ranges. */
  /* standard DOM */
  val buffered: org.scalajs.dom.TimeRanges = js.native
  
  /** Returns a string that specifies whether the client can play a given media resource type. */
  /* standard DOM */
  def canPlayType(`type`: java.lang.String): CanPlayTypeResult = js.native
  
  /** Gets or sets a flag that indicates whether the client provides a set of controls for the media (in case the developer does not include controls for the player). */
  /* standard DOM */
  var controls: scala.Boolean = js.native
  
  /* standard DOM */
  var crossOrigin: java.lang.String | Null = js.native
  
  /** Gets the address or URL of the current media resource that is selected by IHTMLMediaElement. */
  /* standard DOM */
  val currentSrc: java.lang.String = js.native
  
  /** Gets or sets the current playback position, in seconds. */
  /* standard DOM */
  var currentTime: Double = js.native
  
  /* standard DOM */
  var defaultMuted: scala.Boolean = js.native
  
  /** Gets or sets the default playback rate when the user is not using fast forward or reverse for a video or audio resource. */
  /* standard DOM */
  var defaultPlaybackRate: Double = js.native
  
  /* standard DOM */
  var disableRemotePlayback: scala.Boolean = js.native
  
  /** Returns the duration in seconds of the current media resource. A NaN value is returned if duration is not available, or Infinity if the media resource is streaming. */
  /* standard DOM */
  val duration: Double = js.native
  
  /** Gets information about whether the playback has ended or not. */
  /* standard DOM */
  val ended: scala.Boolean = js.native
  
  /** Returns an object representing the current error state of the audio or video element. */
  /* standard DOM */
  val error: org.scalajs.dom.MediaError | Null = js.native
  
  /* standard DOM */
  def fastSeek(time: Double): Unit = js.native
  
  /** Resets the audio or video object and loads a new media resource. */
  /* standard DOM */
  def load(): Unit = js.native
  
  /** Gets or sets a flag to specify whether playback should restart after it completes. */
  /* standard DOM */
  var loop: scala.Boolean = js.native
  
  /** Available only in secure contexts. */
  /* standard DOM */
  val mediaKeys: MediaKeys | Null = js.native
  
  /** Gets or sets a flag that indicates whether the audio (either audio or the audio track on video media) is muted. */
  /* standard DOM */
  var muted: scala.Boolean = js.native
  
  /** Gets the current network activity for the element. */
  /* standard DOM */
  val networkState: Double = js.native
  
  /* standard DOM */
  var onencrypted: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onwaitingforkey: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** Pauses the current playback and sets paused to TRUE. This can be used to test whether the media is playing or paused. You can also use the pause or play events to tell whether the media is playing or not. */
  /* standard DOM */
  def pause(): Unit = js.native
  
  /** Gets a flag that specifies whether playback is paused. */
  /* standard DOM */
  val paused: scala.Boolean = js.native
  
  /** Loads and starts playback of a media resource. */
  /* standard DOM */
  def play(): js.Promise[Unit] = js.native
  
  /** Gets or sets the current rate of speed for the media resource to play. This speed is expressed as a multiple of the normal speed of the media resource. */
  /* standard DOM */
  var playbackRate: Double = js.native
  
  /** Gets TimeRanges for the current media resource that has been played. */
  /* standard DOM */
  val played: org.scalajs.dom.TimeRanges = js.native
  
  /** Gets or sets a value indicating what data should be preloaded, if any. */
  /* standard DOM */
  var preload: none | metadata | auto | _empty = js.native
  
  /* standard DOM */
  var preservesPitch: scala.Boolean = js.native
  
  /* standard DOM */
  val readyState: Double = js.native
  
  /* standard DOM */
  val remote: RemotePlayback = js.native
  
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
  def removeEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_encrypted(
    `type`: encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(
    `type`: waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** Returns a TimeRanges object that represents the ranges of the current media resource that can be seeked. */
  /* standard DOM */
  val seekable: org.scalajs.dom.TimeRanges = js.native
  
  /** Gets a flag that indicates whether the client is currently moving to a new playback position in the media resource. */
  /* standard DOM */
  val seeking: scala.Boolean = js.native
  
  /** Available only in secure contexts. */
  /* standard DOM */
  def setMediaKeys(): js.Promise[Unit] = js.native
  def setMediaKeys(mediaKeys: MediaKeys): js.Promise[Unit] = js.native
  
  /** The address or URL of the a media resource that is to be considered. */
  /* standard DOM */
  var src: java.lang.String = js.native
  
  /* standard DOM */
  var srcObject: MediaProvider | Null = js.native
  
  /* standard DOM */
  val textTracks: org.scalajs.dom.TextTrackList = js.native
  
  /** Gets or sets the volume level for audio portions of the media element. */
  /* standard DOM */
  var volume: Double = js.native
}
