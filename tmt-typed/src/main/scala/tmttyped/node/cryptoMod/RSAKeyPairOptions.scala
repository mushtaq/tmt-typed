package tmttyped.node.cryptoMod

import tmttyped.node.anon.Format
import tmttyped.node.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  /**
    * Key size in bits
    */
  var modulusLength: Double
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & Type
  
  /**
    * Public exponent
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.undefined
  
  var publicKeyEncoding: Format[PubF]
}
object RSAKeyPairOptions {
  
  inline def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & Type,
    publicKeyEncoding: Format[PubF]
  ): RSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAKeyPairOptions[PubF, PrivF]]
  }
  
  extension [Self <: RSAKeyPairOptions[?, ?], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](x: Self & (RSAKeyPairOptions[PubF, PrivF])) {
    
    inline def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] & Type): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    inline def setPublicExponent(value: Double): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    inline def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    
    inline def setPublicKeyEncoding(value: Format[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
