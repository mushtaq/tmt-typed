package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEncoderEncodeIntoResult extends StObject {
  
  /* standard DOM */
  var read: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var written: js.UndefOr[Double] = js.undefined
}
object TextEncoderEncodeIntoResult {
  
  @scala.inline
  def apply(): TextEncoderEncodeIntoResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEncoderEncodeIntoResult]
  }
  
  @scala.inline
  implicit class TextEncoderEncodeIntoResultMutableBuilder[Self <: TextEncoderEncodeIntoResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRead(value: Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setWritten(value: Double): Self = StObject.set(x, "written", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrittenUndefined: Self = StObject.set(x, "written", js.undefined)
  }
}
