package tmttyped.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CipherInfoOptions extends StObject {
  
  /**
    * A test IV length.
    */
  var ivLength: js.UndefOr[Double] = js.undefined
  
  /**
    * A test key length.
    */
  var keyLength: js.UndefOr[Double] = js.undefined
}
object CipherInfoOptions {
  
  @scala.inline
  def apply(): CipherInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CipherInfoOptions]
  }
  
  @scala.inline
  implicit class CipherInfoOptionsMutableBuilder[Self <: CipherInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIvLength(value: Double): Self = StObject.set(x, "ivLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvLengthUndefined: Self = StObject.set(x, "ivLength", js.undefined)
    
    @scala.inline
    def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
  }
}
