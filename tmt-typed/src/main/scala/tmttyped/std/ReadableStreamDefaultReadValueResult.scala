package tmttyped.std

import tmttyped.std.stdBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamDefaultReadValueResult[T]
  extends StObject
     with ReadableStreamDefaultReadResult[T] {
  
  /* standard DOM */
  var done: `false`
  
  /* standard DOM */
  var value: T
}
object ReadableStreamDefaultReadValueResult {
  
  @scala.inline
  def apply[T](value: T): ReadableStreamDefaultReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamDefaultReadValueResult[T]]
  }
  
  @scala.inline
  implicit class ReadableStreamDefaultReadValueResultMutableBuilder[Self <: ReadableStreamDefaultReadValueResult[_], T] (val x: Self with ReadableStreamDefaultReadValueResult[T]) extends AnyVal {
    
    @scala.inline
    def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
