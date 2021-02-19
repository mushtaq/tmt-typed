package tmttyped.std.global

import tmttyped.std.AuthenticationExtensionsClientOutputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PublicKeyCredential")
@js.native
class PublicKeyCredential ()
  extends tmttyped.std.PublicKeyCredential {
  
  /* CompleteClass */
  override def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
  
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /* CompleteClass */
  override val rawId: js.typedarray.ArrayBuffer = js.native
  
  /* CompleteClass */
  override val response: tmttyped.std.AuthenticatorResponse = js.native
  
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
}
object PublicKeyCredential {
  
  @JSGlobal("PublicKeyCredential.isUserVerifyingPlatformAuthenticatorAvailable")
  @js.native
  def isUserVerifyingPlatformAuthenticatorAvailable(): js.Promise[scala.Boolean] = js.native
}
