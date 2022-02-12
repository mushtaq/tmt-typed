package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialRequestOptions extends StObject {
  
  /* standard DOM */
  var mediation: js.UndefOr[CredentialMediationRequirement] = js.undefined
  
  /* standard DOM */
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.undefined
  
  /* standard DOM */
  var signal: js.UndefOr[org.scalajs.dom.AbortSignal] = js.undefined
}
object CredentialRequestOptions {
  
  @scala.inline
  def apply(): CredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialRequestOptions]
  }
  
  @scala.inline
  implicit class CredentialRequestOptionsMutableBuilder[Self <: CredentialRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediation(value: CredentialMediationRequirement): Self = StObject.set(x, "mediation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediationUndefined: Self = StObject.set(x, "mediation", js.undefined)
    
    @scala.inline
    def setPublicKey(value: PublicKeyCredentialRequestOptions): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    @scala.inline
    def setSignal(value: org.scalajs.dom.AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
