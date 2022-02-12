package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesCbcParams
  extends StObject
     with Algorithm {
  
  /* standard DOM */
  var iv: BufferSource
}
object AesCbcParams {
  
  @scala.inline
  def apply(iv: BufferSource, name: java.lang.String): AesCbcParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCbcParams]
  }
  
  @scala.inline
  implicit class AesCbcParamsMutableBuilder[Self <: AesCbcParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIv(value: BufferSource): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
