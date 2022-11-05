package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Inherits from Event, and represents the event object of an event sent on a document or worker when its content security policy is violated. */
@js.native
trait SecurityPolicyViolationEvent
  extends StObject
     with Event {
  
  /* standard DOM */
  val blockedURI: java.lang.String = js.native
  
  /* standard DOM */
  val columnNumber: Double = js.native
  
  /* standard DOM */
  val disposition: SecurityPolicyViolationEventDisposition = js.native
  
  /* standard DOM */
  val documentURI: java.lang.String = js.native
  
  /* standard DOM */
  val effectiveDirective: java.lang.String = js.native
  
  /* standard DOM */
  val lineNumber: Double = js.native
  
  /* standard DOM */
  val originalPolicy: java.lang.String = js.native
  
  /* standard DOM */
  val referrer: java.lang.String = js.native
  
  /* standard DOM */
  val sample: java.lang.String = js.native
  
  /* standard DOM */
  val sourceFile: java.lang.String = js.native
  
  /* standard DOM */
  val statusCode: Double = js.native
  
  /* standard DOM */
  val violatedDirective: java.lang.String = js.native
}
