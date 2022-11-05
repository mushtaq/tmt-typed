package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamBYOBRequest extends StObject {
  
  /* standard DOM */
  def respond(bytesWritten: Double): Unit
  
  /* standard DOM */
  def respondWithNewView(view: js.typedarray.ArrayBufferView): Unit
  
  /* standard DOM */
  val view: js.typedarray.ArrayBufferView | Null
}
object ReadableStreamBYOBRequest {
  
  inline def apply(respond: Double => Unit, respondWithNewView: js.typedarray.ArrayBufferView => Unit): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(respond = js.Any.fromFunction1(respond), respondWithNewView = js.Any.fromFunction1(respondWithNewView), view = null)
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
  
  extension [Self <: ReadableStreamBYOBRequest](x: Self) {
    
    inline def setRespond(value: Double => Unit): Self = StObject.set(x, "respond", js.Any.fromFunction1(value))
    
    inline def setRespondWithNewView(value: js.typedarray.ArrayBufferView => Unit): Self = StObject.set(x, "respondWithNewView", js.Any.fromFunction1(value))
    
    inline def setView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
  }
}
