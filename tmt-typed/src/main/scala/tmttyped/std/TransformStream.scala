package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformStream[I, O] extends StObject {
  
  /* standard DOM */
  val readable: org.scalajs.dom.ReadableStream[O]
  
  /* standard DOM */
  val writable: WritableStream[I]
}
object TransformStream {
  
  @scala.inline
  def apply[I, O](readable: org.scalajs.dom.ReadableStream[O], writable: WritableStream[I]): TransformStream[I, O] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStream[I, O]]
  }
  
  @scala.inline
  implicit class TransformStreamMutableBuilder[Self <: TransformStream[_, _], I, O] (val x: Self with (TransformStream[I, O])) extends AnyVal {
    
    @scala.inline
    def setReadable(value: org.scalajs.dom.ReadableStream[O]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritable(value: WritableStream[I]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
