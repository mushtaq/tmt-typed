package tmttyped.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TextEncoderStream")
@js.native
/* standard DOM */
open class TextEncoderStream ()
  extends StObject
     with tmttyped.std.TextEncoderStream {
  
  /** Returns "utf-8". */
  /* standard DOM */
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val readable: org.scalajs.dom.ReadableStream[Any] = js.native
  /* standard DOM */
  /* CompleteClass */
  @JSName("readable")
  override val readable_TextEncoderStream: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val writable: tmttyped.std.WritableStream[Any] = js.native
  /* standard DOM */
  /* CompleteClass */
  @JSName("writable")
  override val writable_TextEncoderStream: tmttyped.std.WritableStream[java.lang.String] = js.native
}
