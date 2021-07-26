package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
trait CountQueuingStrategy
  extends StObject
     with QueuingStrategy[js.Any] {
  
  @JSName("highWaterMark")
  val highWaterMark_CountQueuingStrategy: Double
  
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: js.Any): Double
}
object CountQueuingStrategy {
  
  @scala.inline
  def apply(highWaterMark: Double, size: js.Any => Double): CountQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[CountQueuingStrategy]
  }
  
  @scala.inline
  implicit class CountQueuingStrategyMutableBuilder[Self <: CountQueuingStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Any => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
  }
}
