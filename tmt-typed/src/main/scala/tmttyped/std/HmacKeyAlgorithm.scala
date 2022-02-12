package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmacKeyAlgorithm
  extends StObject
     with KeyAlgorithm {
  
  /* standard DOM */
  var hash: org.scalajs.dom.KeyAlgorithm
  
  /* standard DOM */
  var length: Double
}
object HmacKeyAlgorithm {
  
  @scala.inline
  def apply(hash: org.scalajs.dom.KeyAlgorithm, length: Double, name: java.lang.String): HmacKeyAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacKeyAlgorithm]
  }
  
  @scala.inline
  implicit class HmacKeyAlgorithmMutableBuilder[Self <: HmacKeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: org.scalajs.dom.KeyAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
