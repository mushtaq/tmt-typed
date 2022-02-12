package tmttyped.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RSAPSSKeyPairKeyObjectOptions extends StObject {
  
  /**
    * Name of the message digest
    */
  var hashAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the message digest used by MGF1
    */
  var mgf1HashAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    * Key size in bits
    */
  var modulusLength: Double
  
  /**
    * Public exponent
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimal salt length in bytes
    */
  var saltLength: js.UndefOr[String] = js.undefined
}
object RSAPSSKeyPairKeyObjectOptions {
  
  @scala.inline
  def apply(modulusLength: Double): RSAPSSKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAPSSKeyPairKeyObjectOptions]
  }
  
  @scala.inline
  implicit class RSAPSSKeyPairKeyObjectOptionsMutableBuilder[Self <: RSAPSSKeyPairKeyObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    @scala.inline
    def setMgf1HashAlgorithm(value: String): Self = StObject.set(x, "mgf1HashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMgf1HashAlgorithmUndefined: Self = StObject.set(x, "mgf1HashAlgorithm", js.undefined)
    
    @scala.inline
    def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponent(value: Double): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    
    @scala.inline
    def setSaltLength(value: String): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
  }
}
