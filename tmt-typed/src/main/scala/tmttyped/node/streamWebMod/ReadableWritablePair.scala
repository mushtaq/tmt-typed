package tmttyped.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// stub module, pending copy&paste from .d.ts or manual impl
// copy from lib.dom.d.ts
trait ReadableWritablePair[R, W] extends StObject {
  
  var readable: ReadableStream[R]
  
  /**
    * Provides a convenient, chainable way of piping this readable stream
    * through a transform stream (or any other { writable, readable }
    * pair). It simply pipes the stream into the writable side of the
    * supplied pair, and returns the readable side for further use.
    *
    * Piping a stream will lock it for the duration of the pipe, preventing
    * any other consumer from acquiring a reader.
    */
  var writable: WritableStream[W]
}
object ReadableWritablePair {
  
  @scala.inline
  def apply[R, W](readable: ReadableStream[R], writable: WritableStream[W]): ReadableWritablePair[R, W] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableWritablePair[R, W]]
  }
  
  @scala.inline
  implicit class ReadableWritablePairMutableBuilder[Self <: ReadableWritablePair[_, _], R, W] (val x: Self with (ReadableWritablePair[R, W])) extends AnyVal {
    
    @scala.inline
    def setReadable(value: ReadableStream[R]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritable(value: WritableStream[W]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
