package tmttyped.std.global

import tmttyped.std.BufferSource
import tmttyped.std.TextDecoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TextDecoderStream")
@js.native
class TextDecoderStream ()
  extends tmttyped.std.TextDecoderStream {
  def this(label: java.lang.String) = this()
  def this(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions) = this()
  def this(label: java.lang.String, options: TextDecoderOptions) = this()
  
  /**
    * Returns encoding's name, lowercased.
    */
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  
  /**
    * Returns true if error mode is "fatal", otherwise false.
    */
  /* CompleteClass */
  override val fatal: scala.Boolean = js.native
  
  /**
    * Returns the value of ignore BOM.
    */
  /* CompleteClass */
  override val ignoreBOM: scala.Boolean = js.native
  
  /* CompleteClass */
  override val readable: org.scalajs.dom.experimental.ReadableStream[_] = js.native
  /* CompleteClass */
  @JSName("readable")
  override val readable_TextDecoderStream: org.scalajs.dom.experimental.ReadableStream[java.lang.String] = js.native
  
  /* CompleteClass */
  override val writable: tmttyped.std.WritableStream[_] = js.native
  /* CompleteClass */
  @JSName("writable")
  override val writable_TextDecoderStream: tmttyped.std.WritableStream[BufferSource] = js.native
}
