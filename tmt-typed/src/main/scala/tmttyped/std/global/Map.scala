package tmttyped.std.global

import tmttyped.std.MapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Map")
@js.native
/* standard es2015.collection */
class Map[K, V] ()
  extends StObject
     with tmttyped.std.Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  /* standard es2015.iterable */
  def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
}
object Map {
  
  @scala.inline
  def apply: MapConstructor = js.Dynamic.global.selectDynamic("Map").asInstanceOf[MapConstructor]
}
