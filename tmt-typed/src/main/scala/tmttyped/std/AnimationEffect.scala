package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEffect extends StObject {
  
  /* standard DOM */
  def getComputedTiming(): ComputedEffectTiming = js.native
  
  /* standard DOM */
  def getTiming(): EffectTiming = js.native
  
  /* standard DOM */
  def updateTiming(): Unit = js.native
  def updateTiming(timing: OptionalEffectTiming): Unit = js.native
}
