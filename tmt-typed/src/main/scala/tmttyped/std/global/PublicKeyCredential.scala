package tmttyped.std.global

import tmttyped.std.AuthenticationExtensionsClientOutputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PublicKeyCredential")
@js.native
/* standard DOM */
open class PublicKeyCredential ()
  extends StObject
     with tmttyped.std.PublicKeyCredential {
  
  /* standard DOM */
  /* CompleteClass */
  override def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val rawId: js.typedarray.ArrayBuffer = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val response: tmttyped.std.AuthenticatorResponse = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
}
object PublicKeyCredential {
  
  @JSGlobal("PublicKeyCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard DOM */
  inline def isUserVerifyingPlatformAuthenticatorAvailable(): js.Promise[scala.Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserVerifyingPlatformAuthenticatorAvailable")().asInstanceOf[js.Promise[scala.Boolean]]
}
