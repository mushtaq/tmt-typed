package tmttyped.std

import tmttyped.std.stdStrings.audioprocess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows the generation, processing, or analyzing of audio using JavaScript.
  * @deprecated As of the August 29 2014 Web Audio API spec publication, this feature has been marked as deprecated, and was replaced by AudioWorklet (see AudioWorkletNode).
  */
@js.native
trait ScriptProcessorNode extends AudioNode {
  
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** @deprecated */
  val bufferSize: Double = js.native
  
  /** @deprecated */
  var onaudioprocess: (js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}
