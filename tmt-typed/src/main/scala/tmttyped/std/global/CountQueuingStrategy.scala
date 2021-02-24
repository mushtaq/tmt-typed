package tmttyped.std.global

import tmttyped.std.QueuingStrategyInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CountQueuingStrategy")
@js.native
class CountQueuingStrategy protected ()
  extends tmttyped.std.CountQueuingStrategy {
  def this(init: QueuingStrategyInit) = this()
  
  /* CompleteClass */
  @JSName("highWaterMark")
  override val highWaterMark_CountQueuingStrategy: Double = js.native
  
  /* CompleteClass */
  @JSName("size")
  override def size_MCountQueuingStrategy(chunk: js.Any): Double = js.native
}
