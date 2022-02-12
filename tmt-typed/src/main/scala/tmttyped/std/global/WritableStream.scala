package tmttyped.std.global

import tmttyped.std.QueuingStrategy
import tmttyped.std.UnderlyingSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WritableStream")
@js.native
/* standard DOM */
class WritableStream[W] ()
  extends StObject
     with tmttyped.std.WritableStream[W] {
  def this(underlyingSink: UnderlyingSink[W]) = this()
  def this(underlyingSink: Unit, strategy: QueuingStrategy[W]) = this()
  def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
}
