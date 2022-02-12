package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Payment Request API interface is returned after a user selects a payment method and approves a payment request.
  * Available only in secure contexts.
  */
@js.native
trait PaymentResponse
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  def complete(): js.Promise[Unit] = js.native
  def complete(result: PaymentComplete): js.Promise[Unit] = js.native
  
  /* standard DOM */
  val details: Any = js.native
  
  /* standard DOM */
  val methodName: java.lang.String = js.native
  
  /* standard DOM */
  val requestId: java.lang.String = js.native
  
  /* standard DOM */
  def retry(): js.Promise[Unit] = js.native
  def retry(errorFields: PaymentValidationErrors): js.Promise[Unit] = js.native
  
  /* standard DOM */
  def toJSON(): Any = js.native
}
