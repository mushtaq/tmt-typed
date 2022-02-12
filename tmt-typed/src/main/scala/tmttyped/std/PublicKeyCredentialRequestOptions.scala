package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredentialRequestOptions extends StObject {
  
  /* standard DOM */
  var allowCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.undefined
  
  /* standard DOM */
  var challenge: BufferSource
  
  /* standard DOM */
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.undefined
  
  /* standard DOM */
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.undefined
}
object PublicKeyCredentialRequestOptions {
  
  @scala.inline
  def apply(challenge: BufferSource): PublicKeyCredentialRequestOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRequestOptions]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialRequestOptionsMutableBuilder[Self <: PublicKeyCredentialRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCredentials(value: js.Array[PublicKeyCredentialDescriptor]): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
    
    @scala.inline
    def setAllowCredentialsVarargs(value: PublicKeyCredentialDescriptor*): Self = StObject.set(x, "allowCredentials", js.Array(value :_*))
    
    @scala.inline
    def setChallenge(value: BufferSource): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: AuthenticationExtensionsClientInputs): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setRpId(value: java.lang.String): Self = StObject.set(x, "rpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRpIdUndefined: Self = StObject.set(x, "rpId", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUserVerification(value: UserVerificationRequirement): Self = StObject.set(x, "userVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVerificationUndefined: Self = StObject.set(x, "userVerification", js.undefined)
  }
}
