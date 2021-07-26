package tmttyped.std.global

import tmttyped.std.RegExpConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RegExp")
@js.native
class RegExp protected ()
  extends StObject
     with tmttyped.std.RegExp {
  def this(pattern: java.lang.String) = this()
  def this(pattern: js.RegExp) = this()
  def this(pattern: java.lang.String, flags: java.lang.String) = this()
  def this(pattern: js.RegExp, flags: java.lang.String) = this()
}
object RegExp {
  
  @scala.inline
  def apply: RegExpConstructor = js.Dynamic.global.selectDynamic("RegExp").asInstanceOf[RegExpConstructor]
}
