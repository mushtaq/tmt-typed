package tmttyped.std

import tmttyped.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamDefaultReadDoneResult
  extends ReadableStreamDefaultReadResult[js.Any] {
  
  var done: `true`
  
  var value: js.UndefOr[scala.Nothing] = js.undefined
}
object ReadableStreamDefaultReadDoneResult {
  
  @scala.inline
  def apply(): ReadableStreamDefaultReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true)
    __obj.asInstanceOf[ReadableStreamDefaultReadDoneResult]
  }
  
  @scala.inline
  implicit class ReadableStreamDefaultReadDoneResultMutableBuilder[Self <: ReadableStreamDefaultReadDoneResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
  }
}
