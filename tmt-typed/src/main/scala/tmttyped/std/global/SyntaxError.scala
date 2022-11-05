package tmttyped.std.global

import tmttyped.std.ErrorOptions
import tmttyped.std.SyntaxErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SyntaxError")
@js.native
/* standard es2022.error */
open class SyntaxError ()
  extends StObject
     with tmttyped.std.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, options: ErrorOptions) = this()
  def this(message: Unit, options: ErrorOptions) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: java.lang.String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: java.lang.String = js.native
}
object SyntaxError {
  
  inline def apply: SyntaxErrorConstructor = js.Dynamic.global.selectDynamic("SyntaxError").asInstanceOf[SyntaxErrorConstructor]
}
