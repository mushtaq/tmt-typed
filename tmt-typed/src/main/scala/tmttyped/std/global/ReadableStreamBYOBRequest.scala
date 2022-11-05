package tmttyped.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ReadableStreamBYOBRequest")
@js.native
/* standard DOM */
open class ReadableStreamBYOBRequest ()
  extends StObject
     with tmttyped.std.ReadableStreamBYOBRequest {
  
  /* standard DOM */
  /* CompleteClass */
  override def respond(bytesWritten: Double): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def respondWithNewView(view: js.typedarray.ArrayBufferView): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val view: js.typedarray.ArrayBufferView | Null = js.native
}
