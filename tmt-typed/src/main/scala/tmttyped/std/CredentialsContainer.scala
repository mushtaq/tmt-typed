package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait CredentialsContainer extends StObject {
  
  /* standard DOM */
  def create(): js.Promise[Credential | Null] = js.native
  def create(options: CredentialCreationOptions): js.Promise[Credential | Null] = js.native
  
  /* standard DOM */
  def get(): js.Promise[Credential | Null] = js.native
  def get(options: CredentialRequestOptions): js.Promise[Credential | Null] = js.native
  
  /* standard DOM */
  def preventSilentAccess(): js.Promise[Unit] = js.native
  
  /* standard DOM */
  def store(credential: Credential): js.Promise[Credential] = js.native
}
