package tmttyped.std

import tmttyped.std.stdStrings.cancel
import tmttyped.std.stdStrings.finish
import tmttyped.std.stdStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remove(
    `type`: remove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remove(
    `type`: remove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remove(
    `type`: remove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  def cancel(): Unit = js.native
  
  /* standard DOM */
  def commitStyles(): Unit = js.native
  
  /* standard DOM */
  var currentTime: CSSNumberish | Null = js.native
  
  /* standard DOM */
  var effect: AnimationEffect | Null = js.native
  
  /* standard DOM */
  def finish(): Unit = js.native
  
  /* standard DOM */
  val finished: js.Promise[Animation] = js.native
  
  /* standard DOM */
  var id: java.lang.String = js.native
  
  /* standard DOM */
  var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onfinish: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onremove: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  def pause(): Unit = js.native
  
  /* standard DOM */
  val pending: scala.Boolean = js.native
  
  /* standard DOM */
  def persist(): Unit = js.native
  
  /* standard DOM */
  def play(): Unit = js.native
  
  /* standard DOM */
  val playState: AnimationPlayState = js.native
  
  /* standard DOM */
  var playbackRate: Double = js.native
  
  /* standard DOM */
  val ready: js.Promise[Animation] = js.native
  
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remove(
    `type`: remove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remove(
    `type`: remove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remove(
    `type`: remove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  val replaceState: AnimationReplaceState = js.native
  
  /* standard DOM */
  def reverse(): Unit = js.native
  
  /* standard DOM */
  var startTime: CSSNumberish | Null = js.native
  
  /* standard DOM */
  var timeline: AnimationTimeline | Null = js.native
  
  /* standard DOM */
  def updatePlaybackRate(playbackRate: Double): Unit = js.native
}
