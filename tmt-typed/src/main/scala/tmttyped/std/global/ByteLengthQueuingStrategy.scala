package tmttyped.std.global

import tmttyped.std.QueuingStrategyInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ByteLengthQueuingStrategy")
@js.native
open class ByteLengthQueuingStrategy protected ()
  extends StObject
     with tmttyped.std.ByteLengthQueuingStrategy {
  /* standard DOM */
  def this(init: QueuingStrategyInit) = this()
  
  /* standard DOM */
  /* CompleteClass */
  @JSName("highWaterMark")
  override val highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  
  /* standard DOM */
  /* CompleteClass */
  @JSName("size")
  override def size_MByteLengthQueuingStrategy(chunk: js.typedarray.ArrayBufferView): Double = js.native
}
