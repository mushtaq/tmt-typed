package tmttyped.std.global

import tmttyped.std.DOMMatrixInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGMatrix")
@js.native
/* standard DOM */
open class SVGMatrix ()
  extends StObject
     with tmttyped.std.DOMMatrix {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}
/* was `typeof DOMMatrix` */
object SVGMatrix {
  
  @JSGlobal("SVGMatrix")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard DOM */
  inline def fromFloat32Array(array32: js.typedarray.Float32Array): tmttyped.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat32Array")(array32.asInstanceOf[js.Any]).asInstanceOf[tmttyped.std.DOMMatrix]
  
  /* standard DOM */
  inline def fromFloat64Array(array64: js.typedarray.Float64Array): tmttyped.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat64Array")(array64.asInstanceOf[js.Any]).asInstanceOf[tmttyped.std.DOMMatrix]
  
  /* standard DOM */
  inline def fromMatrix(): tmttyped.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")().asInstanceOf[tmttyped.std.DOMMatrix]
  inline def fromMatrix(other: DOMMatrixInit): tmttyped.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")(other.asInstanceOf[js.Any]).asInstanceOf[tmttyped.std.DOMMatrix]
}
