package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
trait CountQueuingStrategy
  extends StObject
     with QueuingStrategy[Any] {
  
  /* standard DOM */
  @JSName("highWaterMark")
  val highWaterMark_CountQueuingStrategy: Double
  
  /* standard DOM */
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: Any): Double
}
object CountQueuingStrategy {
  
  @scala.inline
  def apply(highWaterMark: Double, size: Any => Double): CountQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[CountQueuingStrategy]
  }
  
  @scala.inline
  implicit class CountQueuingStrategyMutableBuilder[Self <: CountQueuingStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Any => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
  }
}
