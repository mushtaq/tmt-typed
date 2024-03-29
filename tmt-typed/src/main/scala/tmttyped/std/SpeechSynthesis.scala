package tmttyped.std

import tmttyped.std.stdStrings.voiceschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Speech API interface is the controller interface for the speech service; this can be used to retrieve information about the synthesis voices available on the device, start and pause speech, and other commands besides. */
@js.native
trait SpeechSynthesis
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  def cancel(): Unit = js.native
  
  /* standard DOM */
  def getVoices(): js.Array[SpeechSynthesisVoice] = js.native
  
  /* standard DOM */
  var onvoiceschanged: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  def pause(): Unit = js.native
  
  /* standard DOM */
  val paused: scala.Boolean = js.native
  
  /* standard DOM */
  val pending: scala.Boolean = js.native
  
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  def resume(): Unit = js.native
  
  /* standard DOM */
  def speak(utterance: SpeechSynthesisUtterance): Unit = js.native
  
  /* standard DOM */
  val speaking: scala.Boolean = js.native
}
