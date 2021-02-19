package tmttyped.std.global

import tmttyped.std.DOMMatrixInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMMatrixReadOnly")
@js.native
class DOMMatrixReadOnly ()
  extends tmttyped.std.DOMMatrixReadOnly {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}
object DOMMatrixReadOnly {
  
  @JSGlobal("DOMMatrixReadOnly.fromFloat32Array")
  @js.native
  def fromFloat32Array(array32: js.typedarray.Float32Array): tmttyped.std.DOMMatrixReadOnly = js.native
  
  @JSGlobal("DOMMatrixReadOnly.fromFloat64Array")
  @js.native
  def fromFloat64Array(array64: js.typedarray.Float64Array): tmttyped.std.DOMMatrixReadOnly = js.native
  
  @JSGlobal("DOMMatrixReadOnly.fromMatrix")
  @js.native
  def fromMatrix(): tmttyped.std.DOMMatrixReadOnly = js.native
  @JSGlobal("DOMMatrixReadOnly.fromMatrix")
  @js.native
  def fromMatrix(other: DOMMatrixInit): tmttyped.std.DOMMatrixReadOnly = js.native
  
  @JSGlobal("DOMMatrixReadOnly.toString")
  @js.native
  def toString_(): java.lang.String = js.native
}
