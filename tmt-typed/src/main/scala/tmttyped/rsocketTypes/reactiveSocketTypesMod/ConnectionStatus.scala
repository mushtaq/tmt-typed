package tmttyped.rsocketTypes.reactiveSocketTypesMod

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
  def `0`(): tmttyped.rsocketTypes.anon.`0` = {
    val __obj = js.Dynamic.literal(kind = "CONNECTING")
    __obj.asInstanceOf[tmttyped.rsocketTypes.anon.`0`]
  }
  
  @scala.inline
  def `1`(): tmttyped.rsocketTypes.anon.`1` = {
    val __obj = js.Dynamic.literal(kind = "CONNECTED")
    __obj.asInstanceOf[tmttyped.rsocketTypes.anon.`1`]
  }
  
  @scala.inline
  def `2`(): tmttyped.rsocketTypes.anon.`2` = {
    val __obj = js.Dynamic.literal(kind = "CLOSED")
    __obj.asInstanceOf[tmttyped.rsocketTypes.anon.`2`]
  }
  
  @scala.inline
  def Error(error: js.Error): tmttyped.rsocketTypes.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = "ERROR")
    __obj.asInstanceOf[tmttyped.rsocketTypes.anon.Error]
  }
  
  @scala.inline
  def Kind(): tmttyped.rsocketTypes.anon.Kind = {
    val __obj = js.Dynamic.literal(kind = "NOT_CONNECTED")
    __obj.asInstanceOf[tmttyped.rsocketTypes.anon.Kind]
  }
}
