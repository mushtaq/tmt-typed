package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesCtrParams
  extends StObject
     with Algorithm {
  
  /* standard DOM */
  var counter: BufferSource
  
  /* standard DOM */
  var length: Double
}
object AesCtrParams {
  
  @scala.inline
  def apply(counter: BufferSource, length: Double, name: java.lang.String): AesCtrParams = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCtrParams]
  }
  
  @scala.inline
  implicit class AesCtrParamsMutableBuilder[Self <: AesCtrParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounter(value: BufferSource): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
