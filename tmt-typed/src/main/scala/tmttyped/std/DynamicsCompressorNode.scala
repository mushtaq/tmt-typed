package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Inherits properties from its parent, AudioNode. */
@js.native
trait DynamicsCompressorNode
  extends StObject
     with AudioNode {
  
  /* standard DOM */
  val attack: org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  val knee: org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  val ratio: org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  val reduction: Double = js.native
  
  /* standard DOM */
  val release: org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  val threshold: org.scalajs.dom.AudioParam = js.native
}
