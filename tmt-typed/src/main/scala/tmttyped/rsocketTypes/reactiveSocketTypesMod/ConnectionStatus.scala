package tmttyped.rsocketTypes.reactiveSocketTypesMod

import tmttyped.rsocketTypes.rsocketTypesStrings.CLOSED
import tmttyped.rsocketTypes.rsocketTypesStrings.CONNECTED
import tmttyped.rsocketTypes.rsocketTypesStrings.CONNECTING
import tmttyped.rsocketTypes.rsocketTypesStrings.ERROR
import tmttyped.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - tmttyped.rsocketTypes.anon.Kind
  - tmttyped.rsocketTypes.anon.`0`
  - tmttyped.rsocketTypes.anon.`1`
  - tmttyped.rsocketTypes.anon.`2`
  - tmttyped.rsocketTypes.anon.Error
*/
trait ConnectionStatus extends StObject
object ConnectionStatus {
  
  @scala.inline
  def `0`(kind: CONNECTING): tmttyped.rsocketTypes.anon.`0` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.rsocketTypes.anon.`0`]
  }
  
  @scala.inline
  def `1`(kind: CONNECTED): tmttyped.rsocketTypes.anon.`1` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.rsocketTypes.anon.`1`]
  }
  
  @scala.inline
  def `2`(kind: CLOSED): tmttyped.rsocketTypes.anon.`2` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.rsocketTypes.anon.`2`]
  }
  
  @scala.inline
  def Error(error: js.Error, kind: ERROR): tmttyped.rsocketTypes.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.rsocketTypes.anon.Error]
  }
  
  @scala.inline
  def Kind(kind: NOT_CONNECTED): tmttyped.rsocketTypes.anon.Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.rsocketTypes.anon.Kind]
  }
}
