package tmttyped.std.global

import tmttyped.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("URLSearchParams")
@js.native
/* standard DOM */
open class URLSearchParams ()
  extends StObject
     with tmttyped.std.URLSearchParams {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[js.Array[java.lang.String]]) = this()
  def this(init: Record[java.lang.String, java.lang.String]) = this()
  def this(init: tmttyped.std.URLSearchParams) = this()
}
object URLSearchParams {
  
  @JSGlobal("URLSearchParams")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard DOM */
  inline def toString_(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[java.lang.String]
}
