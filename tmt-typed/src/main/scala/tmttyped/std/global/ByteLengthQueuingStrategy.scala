package tmttyped.std.global

import tmttyped.std.anon.HighWaterMark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ByteLengthQueuingStrategy")
@js.native
class ByteLengthQueuingStrategy protected ()
  extends tmttyped.std.ByteLengthQueuingStrategy {
  def this(options: HighWaterMark) = this()
  
  /* CompleteClass */
  @JSName("highWaterMark")
  override var highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  
  /* CompleteClass */
  @JSName("size")
  override def size_MByteLengthQueuingStrategy(chunk: js.typedarray.ArrayBufferView): Double = js.native
}
