package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait AuthenticatorAssertionResponse
  extends StObject
     with AuthenticatorResponse {
  
  /* standard DOM */
  val authenticatorData: js.typedarray.ArrayBuffer
  
  /* standard DOM */
  val signature: js.typedarray.ArrayBuffer
  
  /* standard DOM */
  val userHandle: js.typedarray.ArrayBuffer | Null
}
object AuthenticatorAssertionResponse {
  
  @scala.inline
  def apply(
    authenticatorData: js.typedarray.ArrayBuffer,
    clientDataJSON: js.typedarray.ArrayBuffer,
    signature: js.typedarray.ArrayBuffer
  ): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userHandle = null)
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
  
  @scala.inline
  implicit class AuthenticatorAssertionResponseMutableBuilder[Self <: AuthenticatorAssertionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatorData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "authenticatorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserHandle(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "userHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserHandleNull: Self = StObject.set(x, "userHandle", null)
  }
}
