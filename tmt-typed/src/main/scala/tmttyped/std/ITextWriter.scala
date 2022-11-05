package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextWriter extends StObject {
  
  /* standard ScriptHost */
  def Close(): Unit
  
  /* standard ScriptHost */
  def Write(s: java.lang.String): Unit
  
  /* standard ScriptHost */
  def WriteLine(s: java.lang.String): Unit
}
object ITextWriter {
  
  inline def apply(Close: () => Unit, Write: java.lang.String => Unit, WriteLine: java.lang.String => Unit): ITextWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Write = js.Any.fromFunction1(Write), WriteLine = js.Any.fromFunction1(WriteLine))
    __obj.asInstanceOf[ITextWriter]
  }
  
  extension [Self <: ITextWriter](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    inline def setWrite(value: java.lang.String => Unit): Self = StObject.set(x, "Write", js.Any.fromFunction1(value))
    
    inline def setWriteLine(value: java.lang.String => Unit): Self = StObject.set(x, "WriteLine", js.Any.fromFunction1(value))
  }
}
