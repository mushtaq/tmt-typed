package tmttyped.std.global

import tmttyped.std.BufferSource
import tmttyped.std.TextDecoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TextDecoderStream")
@js.native
/* standard DOM */
open class TextDecoderStream ()
  extends StObject
     with tmttyped.std.TextDecoderStream {
  def this(label: java.lang.String) = this()
  def this(label: java.lang.String, options: TextDecoderOptions) = this()
  def this(label: Unit, options: TextDecoderOptions) = this()
  
  /** Returns encoding's name, lowercased. */
  /* standard DOM */
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  
  /** Returns true if error mode is "fatal", otherwise false. */
  /* standard DOM */
  /* CompleteClass */
  override val fatal: scala.Boolean = js.native
  
  /** Returns the value of ignore BOM. */
  /* standard DOM */
  /* CompleteClass */
  override val ignoreBOM: scala.Boolean = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val readable: org.scalajs.dom.ReadableStream[Any] = js.native
  /* standard DOM */
  /* CompleteClass */
  @JSName("readable")
  override val readable_TextDecoderStream: org.scalajs.dom.ReadableStream[java.lang.String] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val writable: tmttyped.std.WritableStream[Any] = js.native
  /* standard DOM */
  /* CompleteClass */
  @JSName("writable")
  override val writable_TextDecoderStream: tmttyped.std.WritableStream[BufferSource] = js.native
}
