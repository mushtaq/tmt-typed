package tmttyped.node.cryptoMod

import tmttyped.node.anon.FormatType
import tmttyped.node.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RSAPSSKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
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
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `0`
  
  /**
    * Public exponent
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.undefined
  
  var publicKeyEncoding: FormatType[PubF]
  
  /**
    * Minimal salt length in bytes
    */
  var saltLength: js.UndefOr[String] = js.undefined
}
object RSAPSSKeyPairOptions {
  
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `0`,
    publicKeyEncoding: FormatType[PubF]
  ): RSAPSSKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAPSSKeyPairOptions[PubF, PrivF]]
  }
  
  @scala.inline
  implicit class RSAPSSKeyPairOptionsMutableBuilder[Self <: RSAPSSKeyPairOptions[_, _], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] (val x: Self with (RSAPSSKeyPairOptions[PubF, PrivF])) extends AnyVal {
    
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
    def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with `0`): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponent(value: Double): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    
    @scala.inline
    def setPublicKeyEncoding(value: FormatType[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltLength(value: String): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
  }
}
