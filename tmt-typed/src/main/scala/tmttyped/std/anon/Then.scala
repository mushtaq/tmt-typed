package tmttyped.std.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Then extends StObject {
  
  /* standard es5 */
  def `then`(
    onfulfilled: /* import warning: importer.ImportType#apply Failed type conversion: infer F */ js.Any
  ): Any
}
object Then {
  
  inline def apply(
    `then`: /* import warning: importer.ImportType#apply Failed type conversion: infer F */ js.Any => Any
  ): Then = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Then]
  }
  
  extension [Self <: Then](x: Self) {
    
    inline def setThen(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer F */ js.Any => Any
    ): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
  }
}
