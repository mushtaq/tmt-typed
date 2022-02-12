package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKeyPair extends StObject {
  
  /* standard DOM */
  var privateKey: js.UndefOr[org.scalajs.dom.CryptoKey] = js.undefined
  
  /* standard DOM */
  var publicKey: js.UndefOr[org.scalajs.dom.CryptoKey] = js.undefined
}
object CryptoKeyPair {
  
  @scala.inline
  def apply(): CryptoKeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoKeyPair]
  }
  
  @scala.inline
  implicit class CryptoKeyPairMutableBuilder[Self <: CryptoKeyPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateKey(value: org.scalajs.dom.CryptoKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    @scala.inline
    def setPublicKey(value: org.scalajs.dom.CryptoKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
  }
}
