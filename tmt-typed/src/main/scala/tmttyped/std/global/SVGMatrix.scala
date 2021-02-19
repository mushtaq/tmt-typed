package tmttyped.std.global

import tmttyped.std.DOMMatrixInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGMatrix")
@js.native
class SVGMatrix ()
  extends tmttyped.std.DOMMatrix {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}
/* was `typeof DOMMatrix` */
object SVGMatrix {
  
  @JSGlobal("SVGMatrix.fromFloat32Array")
  @js.native
  def fromFloat32Array(array32: js.typedarray.Float32Array): tmttyped.std.DOMMatrix = js.native
  
  @JSGlobal("SVGMatrix.fromFloat64Array")
  @js.native
  def fromFloat64Array(array64: js.typedarray.Float64Array): tmttyped.std.DOMMatrix = js.native
  
  @JSGlobal("SVGMatrix.fromMatrix")
  @js.native
  def fromMatrix(): tmttyped.std.DOMMatrix = js.native
  @JSGlobal("SVGMatrix.fromMatrix")
  @js.native
  def fromMatrix(other: DOMMatrixInit): tmttyped.std.DOMMatrix = js.native
}
