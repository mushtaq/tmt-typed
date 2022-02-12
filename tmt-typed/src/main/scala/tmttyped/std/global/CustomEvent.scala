package tmttyped.std.global

import tmttyped.std.CustomEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CustomEvent")
@js.native
class CustomEvent[T] protected ()
  extends StObject
     with tmttyped.std.CustomEvent[T] {
  /* standard DOM */
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: CustomEventInit[T]) = this()
}
