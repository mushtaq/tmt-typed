package tmttyped.std

import tmttyped.std.stdStrings.enterpictureinpicture
import tmttyped.std.stdStrings.leavepictureinpicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods for manipulating video objects. It also inherits properties and methods of HTMLMediaElement and HTMLElement. */
@js.native
trait HTMLVideoElement
  extends StObject
     with HTMLMediaElement {
  
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  var disablePictureInPicture: scala.Boolean = js.native
  
  /* standard DOM */
  def getVideoPlaybackQuality(): VideoPlaybackQuality = js.native
  
  /** Gets or sets the height of the video element. */
  /* standard DOM */
  var height: Double = js.native
  
  /* standard DOM */
  var onenterpictureinpicture: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onleavepictureinpicture: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** Gets or sets the playsinline of the video element. for example, On iPhone, video elements will now be allowed to play inline, and will not automatically enter fullscreen mode when playback begins. */
  /* standard DOM */
  var playsInline: scala.Boolean = js.native
  
  /** Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available. */
  /* standard DOM */
  var poster: java.lang.String = js.native
  
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enterpictureinpicture(
    `type`: enterpictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_leavepictureinpicture(
    `type`: leavepictureinpicture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  def requestPictureInPicture(): js.Promise[PictureInPictureWindow] = js.native
  
  /** Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known. */
  /* standard DOM */
  val videoHeight: Double = js.native
  
  /** Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known. */
  /* standard DOM */
  val videoWidth: Double = js.native
  
  /** Gets or sets the width of the video element. */
  /* standard DOM */
  var width: Double = js.native
}
